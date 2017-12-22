package com.godwei.stock.service.user.impl;

import com.godwei.stock.mapper.manage.FundMapper;
import com.godwei.stock.mapper.user.CommMapper;
import com.godwei.stock.mapper.user.TransactionMapper;
import com.godwei.stock.model.manage.Fund;
import com.godwei.stock.model.user.Comm;
import com.godwei.stock.model.user.CommExample;
import com.godwei.stock.model.user.Position;
import com.godwei.stock.model.user.Transaction;
import com.godwei.stock.service.user.TransactionService;
import com.godwei.stock.util.ActionReturnUtil;
import com.godwei.stock.util.HttpUtil;
import com.godwei.stock.util.RealTimePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private CommMapper commMapper;
    @Autowired
    private TransactionMapper transactionMapper;
    @Autowired
    private FundMapper fundMapper;

    @Override
    public ActionReturnUtil addComm(Comm comm) {
        Fund fund = new Fund();
        Comm comm1 = new Comm();
        CommExample commExample = new CommExample();
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(date);
        comm.setCommStatus("等待成交！");
        comm.setCommdate(date);
        commExample.createCriteria().andCommdateEqualTo(date);
        try {
            commMapper.insertSelective(comm);
            fund = fundMapper.selectByPrimaryKey(comm.getBankrollId());
            if(fund==null){
                return ActionReturnUtil.returnErrorWithMsg("资金账户无效！");
            }
            comm.getCommprice().multiply(new BigDecimal(comm.getCommquantity()));
            if(fund.getUsable().compareTo( comm.getCommprice().multiply(new BigDecimal(comm.getCommquantity())))<0){
                return ActionReturnUtil.returnErrorWithMsg("账户可用余额不够！");
            }
            comm1 = commMapper.selectByCommDate(time);
        } catch (Exception e) {
            commMapper.deleteByCommDate(time);
            return ActionReturnUtil.returnErrorWithMsg("服务器忙，稍后重试！");
        }
        if (comm1 != null) {
            //开启该股票交易线程
            Thread th = new Thread(new MatchingTransactions(comm1));
            th.start();
            //new Thread(new MatchingTransactions(comm1)).start();
        } else {
            //处理错误
        }
        return ActionReturnUtil.returnSuccess();
    }

    public class MatchingTransactions implements Runnable{
        private RealTimePrice realTimePrice;
        private HttpUtil httpUtil;
        private Comm comm;
        private String url = "http://web.juhe.cn:8080/finance/stock/hs";
        private String StaticPara = "type=&key=05be5f36982326a3a0b6a3cc3c01ebca&gid=";
        private String json;
        private Map<String,Object> map = new HashMap<>();
        private String para;
        private Boolean flag=true;
        private Transaction transaction;
        private Fund fund;
        private Position position;

        public MatchingTransactions(Comm comm){
            this.comm = comm;
            realTimePrice = new RealTimePrice();
            httpUtil = new HttpUtil();
            map = new HashMap<>();
            para = StaticPara+comm.getStockId();
            position = new Position();
            try{
                json = httpUtil.sendGet(url,para);
                map = realTimePrice.getPriceList(json);
            }catch (Exception e){
                e.printStackTrace();
            }
            try {
                fund = fundMapper.selectByPrimaryKey(comm.getBankrollId());
            }catch (Exception e){
                System.out.println("无银行账户！");
            }
        }
        @Override
        public void run() {
            while(comm.getCommquantity()>comm.getAccomplishquantity()&&flag){
                //System.out.println(Thread.currentThread().getName()+map);
                transaction = new Transaction();
                Integer left = comm.getCommquantity()-comm.getAccomplishquantity();
                BigDecimal[] buyPrice = (BigDecimal[]) map.get("buyPrice");
                Integer[] buy = (Integer[]) map.get("buy");
                BigDecimal[] sellPrice = (BigDecimal[]) map.get("sellPrice");
                Integer[] sell = (Integer[])map.get("sell");
                if(comm.getType()==1) {
                    //处理买单
                    if (comm.getCommprice().compareTo(sellPrice[1]) == 0) {
                        transaction.setStockId(comm.getStockId());
                        transaction.setStockName(comm.getStockName());
                        transaction.setBankrollId(comm.getBankrollId());
                        transaction.setProcedurecost(new BigDecimal(0));
                        Date date = new Date();
                        transaction.setDealdate(date);
                        comm.setAccomplishdate(date);
                        position.setBankrollId(comm.getBankrollId());
                        position.setStockId(comm.getStockId());
                        position.setStockName(comm.getStockName());
                        position.setDealdate(date);
                        if(left.compareTo(sell[1])<=0){
                            transaction.setCount(comm.getCommquantity());
                            transaction.setPrice(comm.getCommprice());
                            comm.setCommStatus("交易已成！");
                            comm.setAccomplishquantity(comm.getAccomplishquantity()+left);
                            fund.setTotal(fund.getTotal().subtract(comm.getCommprice().multiply(new BigDecimal(left))));
                            fund.setTocalstock(fund.getTocalstock().add(comm.getCommprice().multiply(new BigDecimal(left))));
                            fund.setUsable(fund.getUsable().subtract(comm.getCommprice().multiply(new BigDecimal(left))));
                            position.setCount(left);
                            position.setPrice(comm.getCommprice());
                        }else if(left.compareTo(sell[1])>0){
                            transaction.setPrice(comm.getCommprice());
                            transaction.setCount(sell[1]);
                            comm.setCommStatus("交易部分已成！");
                            comm.setAccomplishquantity(comm.getAccomplishquantity()+sell[1]);
                            fund.setTotal(fund.getTotal().subtract(comm.getCommprice().multiply(new BigDecimal(sell[1]))));
                            fund.setTocalstock(fund.getTocalstock().add(comm.getCommprice().multiply(new BigDecimal(sell[1]))));
                            fund.setUsable(fund.getUsable().subtract(comm.getCommprice().multiply(new BigDecimal(sell[1]))));
                            position.setCount(sell[1]);
                            position.setPrice(comm.getCommprice());
                        }
                    }else if(comm.getCommprice().compareTo(sellPrice[1]) > 0){
                        transaction.setProcedurecost(new BigDecimal(0));
                        transaction.setStockId(comm.getStockId());
                        transaction.setStockName(comm.getStockName());
                        transaction.setBankrollId(comm.getBankrollId());
                        Date date = new Date();
                        transaction.setDealdate(date);
                        comm.setAccomplishdate(date);
                        position.setBankrollId(comm.getBankrollId());
                        position.setStockId(comm.getStockId());
                        position.setStockName(comm.getStockName());
                        position.setDealdate(date);
                        if(left.compareTo(sell[1])<=0){
                            transaction.setCount(comm.getCommquantity());
                            transaction.setPrice((comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2)));
                            comm.setCommStatus("交易已成！");
                            comm.setAccomplishquantity(comm.getAccomplishquantity()+left);
                            fund.setTotal(fund.getTotal().subtract(comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(comm.getCommquantity()))));
                            fund.setTocalstock(fund.getTocalstock().add(comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(comm.getCommquantity()))));
                            fund.setUsable(fund.getUsable().subtract(comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(comm.getCommquantity()))));
                            position.setCount(left);
                            position.setPrice(comm.getCommprice().add(sellPrice[1]).divide(new BigDecimal(2)));
                        }else if(left.compareTo(sell[1])>0){
                            transaction.setPrice((comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2)));
                            transaction.setCount(sell[1]);
                            comm.setCommStatus("交易部分已成！");
                            comm.setAccomplishquantity(comm.getAccomplishquantity()+sell[1]);
                            fund.setTotal(fund.getTotal().subtract(comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(sell[1]))));
                            fund.setTocalstock(fund.getTocalstock().add(comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(sell[1]))));
                            fund.setUsable(fund.getUsable().subtract(comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(sell[1]))));
                            position.setCount(sell[1]);
                            position.setPrice(comm.getCommprice().add(sellPrice[1]).divide(new BigDecimal(2)));
                        }
                    }
                }else{
                    //处理卖单
                    if (comm.getCommprice().compareTo(buyPrice[1]) == 0) {
                        transaction.setProcedurecost(new BigDecimal(0));
                        transaction.setStockId(comm.getStockId());
                        transaction.setStockName(comm.getStockName());
                        transaction.setBankrollId(comm.getBankrollId());
                        Date date = new Date();
                        transaction.setDealdate(date);
                        comm.setAccomplishdate(date);
                        position.setBankrollId(comm.getBankrollId());
                        position.setStockId(comm.getStockId());
                        position.setStockName(comm.getStockName());
                        position.setDealdate(date);
                        if(left.compareTo(buy[1])<=0){
                            transaction.setCount(comm.getCommquantity());
                            transaction.setPrice(comm.getCommprice());
                            comm.setCommStatus("交易已成！");
                            comm.setAccomplishquantity(comm.getAccomplishquantity()+left);
                            fund.setTotal(fund.getTotal().subtract(comm.getCommprice().multiply(new BigDecimal(left))));
                            fund.setTocalstock(fund.getTocalstock().add(comm.getCommprice().multiply(new BigDecimal(left))));
                            fund.setUsable(fund.getUsable().subtract(comm.getCommprice().multiply(new BigDecimal(left))));
                            position.setPrice(comm.getCommprice());
                            position.setCount(left);
                        }else if(left.compareTo(buy[1])>0){
                            transaction.setPrice(comm.getCommprice());
                            transaction.setCount(buy[1]);
                            comm.setCommStatus("交易部分已成！");
                            comm.setAccomplishquantity(comm.getAccomplishquantity()+buy[1]);
                            fund.setTotal(fund.getTotal().subtract(comm.getCommprice().multiply(new BigDecimal(buy[1]))));
                            fund.setTocalstock(fund.getTocalstock().add(comm.getCommprice().multiply(new BigDecimal(buy[1]))));
                            fund.setUsable(fund.getUsable().subtract(comm.getCommprice().multiply(new BigDecimal(buy[1]))));
                            position.setCount(buy[1]);
                            position.setPrice(comm.getCommprice());
                        }
                    }else if(comm.getCommprice().compareTo(buyPrice[1]) < 0){
                        transaction.setProcedurecost(new BigDecimal(0));
                        transaction.setStockId(comm.getStockId());
                        transaction.setStockName(comm.getStockName());
                        transaction.setBankrollId(comm.getBankrollId());
                        Date date = new Date();
                        transaction.setDealdate(date);
                        comm.setAccomplishdate(date);
                        position.setBankrollId(comm.getBankrollId());
                        position.setStockId(comm.getStockId());
                        position.setStockName(comm.getStockName());
                        position.setDealdate(date);
                        if(left.compareTo(buy[1])<=0){
                            transaction.setCount(comm.getCommquantity());
                            transaction.setPrice((comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2)));
                            comm.setCommStatus("交易已成！");
                            comm.setAccomplishquantity(comm.getAccomplishquantity()+left);
                            fund.setTotal(fund.getTotal().subtract(comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(left))));
                            fund.setTocalstock(fund.getTocalstock().add(comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(left))));
                            fund.setUsable(fund.getUsable().subtract(comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(left))));
                            position.setCount(left);
                            position.setPrice((comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2)));
                        }else if(left.compareTo(buy[1])>0){
                            transaction.setPrice((comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2)));
                            transaction.setCount(buy[1]);
                            comm.setCommStatus("交易部分已成！");
                            comm.setAccomplishquantity(comm.getAccomplishquantity()+buy[1]);
                            fund.setTotal(fund.getTotal().subtract(comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(buy[1]))));
                            fund.setTocalstock(fund.getTocalstock().add(comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(buy[1]))));
                            fund.setUsable(fund.getUsable().subtract(comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2).multiply(new BigDecimal(buy[1]))));
                            position.setCount(buy[1]);
                            position.setPrice((comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2)));
                        }
                    }
                }

                //刷新数据库
                commMapper.updateByPrimaryKeySelective(comm);
                fundMapper.updateByPrimaryKeySelective(fund);
                if(transaction.getCount()!=null&&transaction.getCount()!=0) {
                    transactionMapper.insert(transaction);
                    transaction.setCount(0);
                }
                //暂停10秒
                try {
                    Thread.sleep(3000);
                }catch (Exception e){
                    flag=false;
                }
                //刷新数据
                try {
                    json = httpUtil.sendGet(url, para);
                    map = realTimePrice.getPriceList(json);
                }catch (Exception e){
                    flag=false;
                }
            }
        }
    }


}


