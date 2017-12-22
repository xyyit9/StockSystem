//package com.godwei.stock.service.user;
//
//import com.godwei.stock.mapper.user.TransactionMapper;
//import com.godwei.stock.model.user.Comm;
//import com.godwei.stock.model.user.Transaction;
//import com.godwei.stock.util.HttpUtil;
//import com.godwei.stock.util.RealTimePrice;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//public class MatchingTransactions implements Runnable{
//
//    private RealTimePrice realTimePrice;
//    private HttpUtil httpUtil;
//    private Comm comm;
//    private String url = "http://web.juhe.cn:8080/finance/stock/hs";
//    private String StaticPara = "type=&key=05be5f36982326a3a0b6a3cc3c01ebca&gid=";
//    private String json;
//    private Map<String,Object> map = new HashMap<>();
//    private String para;
//    private Boolean flag=true;
//    private Transaction transaction;
//
//    public MatchingTransactions(Comm comm){
//        this.comm = comm;
//        realTimePrice = new RealTimePrice();
//        httpUtil = new HttpUtil();
//        map = new HashMap<>();
//        para = StaticPara+comm.getStockId();
//        try{
//            json = httpUtil.sendGet(url,para);
//            map = realTimePrice.getPriceList(json);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    @Override
//    public void run() {
//        while(comm.getCommquantity()>comm.getAccomplishquantity()&&flag){
//            //System.out.println(Thread.currentThread().getName()+map);
//            transaction = new Transaction();
//            Integer left = comm.getCommquantity()-comm.getAccomplishquantity();
//            BigDecimal[] buyPrice = (BigDecimal[]) map.get("buyPrice");
//            Integer[] buy = (Integer[]) map.get("buy");
//            BigDecimal[] sellPrice = (BigDecimal[]) map.get("sellPrice");
//            Integer[] sell = (Integer[])map.get("sell");
//            if(comm.getType()==1) {
//                //处理买单
//                if (comm.getCommprice().compareTo(sellPrice[1]) == 0) {
//                    transaction.setStockId(comm.getStockId());
//                    transaction.setStockName(comm.getStockName());
//                    transaction.setBankrollId(comm.getBankrollId());
//                    Date date = new Date();
//                    transaction.setDealdate(date);
//                    comm.setAccomplishdate(date);
//                    if(left.compareTo(sell[1])<=0){
//                        transaction.setCount(comm.getCommquantity());
//                        transaction.setPrice(comm.getCommprice());
//                        comm.setAccomplishquantity(comm.getAccomplishquantity()+left);
//                    }else if(comm.getCommquantity().compareTo(sell[1])>0){
//                        transaction.setPrice(comm.getCommprice());
//                        transaction.setCount(sell[1]);
//                        comm.setAccomplishquantity(comm.getAccomplishquantity()+buy[1]);
//                    }
//                }else if(comm.getCommprice().compareTo(sellPrice[1]) > 0){
//                    transaction.setStockId(comm.getStockId());
//                    transaction.setStockName(comm.getStockName());
//                    transaction.setBankrollId(comm.getBankrollId());
//                    Date date = new Date();
//                    transaction.setDealdate(date);
//                    comm.setAccomplishdate(date);
//                    if(left.compareTo(sell[1])<=0){
//                        transaction.setCount(comm.getCommquantity());
//                        transaction.setPrice((comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2)));
//                        comm.setAccomplishquantity(comm.getAccomplishquantity()+left);
//                    }else if(comm.getCommquantity().compareTo(sell[1])>0){
//                        transaction.setPrice((comm.getCommprice().add(sellPrice[1])).divide(new BigDecimal(2)));
//                        transaction.setCount(sell[1]);
//                        comm.setAccomplishquantity(comm.getAccomplishquantity()+buy[1]);
//                    }
//                }
//            }else{
//                //处理卖单
//                if (comm.getCommprice().compareTo(buyPrice[1]) == 0) {
//                    transaction.setStockId(comm.getStockId());
//                    transaction.setStockName(comm.getStockName());
//                    transaction.setBankrollId(comm.getBankrollId());
//                    Date date = new Date();
//                    transaction.setDealdate(date);
//                    comm.setAccomplishdate(date);
//                    if(left.compareTo(buy[1])<=0){
//                        transaction.setCount(comm.getCommquantity());
//                        transaction.setPrice(comm.getCommprice());
//                        comm.setAccomplishquantity(comm.getAccomplishquantity()+left);
//                    }else if(comm.getCommquantity().compareTo(buy[1])>0){
//                        transaction.setPrice(comm.getCommprice());
//                        transaction.setCount(buy[1]);
//                        comm.setAccomplishquantity(comm.getAccomplishquantity()+buy[1]);
//                    }
//                }else if(comm.getCommprice().compareTo(buyPrice[1]) < 0){
//                    transaction.setStockId(comm.getStockId());
//                    transaction.setStockName(comm.getStockName());
//                    transaction.setBankrollId(comm.getBankrollId());
//                    Date date = new Date();
//                    transaction.setDealdate(date);
//                    comm.setAccomplishdate(date);
//                    if(left.compareTo(buy[1])<=0){
//                        transaction.setCount(comm.getCommquantity());
//                        transaction.setPrice((comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2)));
//                        comm.setAccomplishquantity(comm.getAccomplishquantity()+left);
//                    }else if(comm.getCommquantity().compareTo(buy[1])>0){
//                        transaction.setPrice((comm.getCommprice().add(buyPrice[1])).divide(new BigDecimal(2)));
//                        transaction.setCount(buy[1]);
//                        comm.setAccomplishquantity(comm.getAccomplishquantity()+buy[1]);
//                    }
//                }
//            }
//
//            //刷新数据库
//            commMapper.updateByPrimaryKeySelective(comm);
//            if(transaction.getCount()!=null&&transaction.getCount()!=0) {
//                transactionMapper.insert(transaction);
//                transaction.setCount(0);
//            }
//            //暂停10秒
//            try {
//                Thread.sleep(3000);
//            }catch (Exception e){
//                flag=false;
//            }
//            //刷新数据
//            try {
//                json = httpUtil.sendGet(url, para);
//                map = realTimePrice.getPriceList(json);
//            }catch (Exception e){
//                flag=false;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Comm comm = new Comm();
//        comm.setId(new Integer(9));
//        comm.setStockId("sz002651");
//        comm.setCommquantity(100);
//        comm.setAccomplishquantity(0);
//        comm.setType(1);
//        comm.setCommprice(new BigDecimal(1));
//        Thread a = new Thread(new MatchingTransactions(comm));
//        a.setName(comm.getStockId());
//        a.start();
//        //new Thread(new MatchingTransactions(comm)).start();
//        //new Thread(new MatchingTransactions(comm)).start();
//    }
//}
