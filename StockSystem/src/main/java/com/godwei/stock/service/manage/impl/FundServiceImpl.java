package com.godwei.stock.service.manage.impl;

import com.godwei.stock.mapper.manage.CorporationMapper;
import com.godwei.stock.mapper.manage.FundMapper;
import com.godwei.stock.mapper.manage.UserMapper;
import com.godwei.stock.model.manage.*;
import com.godwei.stock.service.manage.FundService;
import com.godwei.stock.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FundServiceImpl implements FundService{
    @Autowired
    private FundMapper fundMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CorporationMapper corporationMapper;

    @Override
    public ActionReturnUtil addFund(Map<String,Object> map) {
        Fund fund = new Fund();
        Fund fund1 = new Fund();
        User user = new User();
        BigDecimal init = new BigDecimal(0);
        Corporation corporation = new Corporation();
        String flag = (String) map.get("flag");
        fund.setWithdrawalspw((String)map.get("withdrawalspw"));
        fund.setTransactionpw((String)map.get("transactionpw"));
        fund.setName((String)map.get("name"));
        fund.setIdcard((String)map.get("idcard"));
        fund.setUsable(init);
        fund.setIncash(init);
        fund.setTotal(init);
        fund.setFreezed(init);
        fund.setTocalstock(init);
        try{
            if(fundMapper.selectByNameAndIdcard(fund)!=null){
                return ActionReturnUtil.returnErrorWithMsg("该账户已经绑定相关资金账户！");
            }
            fundMapper.insertSelective(fund);
            fund1 = fundMapper.selectByNameAndIdcard(fund);
            if(flag.equals("1")){
                 user = userMapper.selectByIdcard(fund.getIdcard());
                if(user==null){
                    return ActionReturnUtil.returnErrorWithMsg("未找到相关证券账户，请先注册证券账户！");
                }
                user.setBankrollId(fund1.getId());
                userMapper.updateByPrimaryKeySelective(user);
            }else{
                corporation = corporationMapper.selectByIdcard(fund.getIdcard());
                if(corporation==null){
                    return ActionReturnUtil.returnErrorWithMsg("未找到相关证券账户，请先注册证券账户！");
                }
                corporation.setBankrollId(fund1.getId());
                corporationMapper.updateByPrimaryKeySelective(corporation);
            }
        }catch (Exception e){
            //rollback
            fund1 = fundMapper.selectByNameAndIdcard(fund);
            if(fund1!=null){
                fundMapper.deleteByPrimaryKey(fund1.getId());
            }
            if(flag.equals("1")){
                user.setBankrollId(0);
                userMapper.updateByPrimaryKeySelective(user);
            }else{
                corporation.setBankrollId(0);
                corporationMapper.updateByPrimaryKeySelective(corporation);
            }
            return ActionReturnUtil.returnErrorWithMsg("操作失误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil saveMoney(Map<String, Object> map) {
        Fund fund = new Fund();
        Fund fund1 = new Fund();
        fund.setIdcard((String) map.get("idcard"));
        fund.setName((String)map.get("name"));
        BigDecimal totle = new BigDecimal((map.get("count").toString()));
        try {
            fund1 = fundMapper.selectByNameAndIdcard(fund);
            if(fund1.getTotal()!=null){
                totle=totle.add(fund1.getTotal());
            }
            fund1.setTotal(totle);
            fund1.setUsable(totle);
            fundMapper.updateByPrimaryKeySelective(fund1);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作失误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil withdrawalMoney(Map<String, Object> map) {
        Fund fund = new Fund();
        Fund fund1 = new Fund();
        fund.setIdcard((String) map.get("idcard"));
        fund.setName((String)map.get("name"));
        BigDecimal count = new BigDecimal((map.get("count").toString()));
        BigDecimal totle = new BigDecimal(0);
        try {
            fund1 = fundMapper.selectByNameAndIdcard(fund);
            if(fund1.getUsable()!=null&&(fund1.getUsable().compareTo(count)>=0)){
                totle=fund1.getTotal().subtract(totle);

            }else{
                return ActionReturnUtil.returnErrorWithMsg("可用余额不足！");
            }
            fund1.setUsable(fund1.getUsable().subtract(count));
            fund1.setTotal(totle);
            fundMapper.updateByPrimaryKeySelective(fund1);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作失误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil reliefBind(Map<String, Object> map) {
        Fund fund = new Fund();
        Fund fund1 = new Fund();
        User user = new User();
        Corporation corporation = new Corporation();
        String flag = (String) map.get("flag");
        fund.setName((String) map.get("name"));
        fund.setIdcard((String)map.get("idcard"));
        try{
            fund1 = fundMapper.selectByNameAndIdcard(fund);
            if(flag.equals("1")){
                user = userMapper.selectByIdcard(fund1.getIdcard());
                user.setBankrollId(null);
                userMapper.updateByPrimaryKeySelective(user);
            }else{
                corporation = corporationMapper.selectByIdcard(fund.getIdcard());
                corporation.setBankrollId(0);
                corporationMapper.updateByPrimaryKeySelective(corporation);
            }
            fundMapper.deleteByPrimaryKey(fund1.getId());
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作失败，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil userBind() {
        List<Map<String,Object>> list = new ArrayList<>();
        List<User> users = new ArrayList<>();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUIdIsNotNull();
        try{
            users = userMapper.selectByExample(userExample);
            for(User user:users){
                Map<String,Object> map = new HashMap<>();
                Fund fund = fundMapper.selectByPrimaryKey(user.getBankrollId());
                if(fund==null){
                    map.put("bankrollId","暂未绑定");
                    map.put("total",0);
                    map.put("usable",0);
                }else{
                    map.put("bankrollId",fund.getId());
                    map.put("total",fund.getTotal());
                    map.put("usable",fund.getUsable());
                }
                map.put("name",user.getuName());
                map.put("idCard",user.getuIdcard());
                map.put("userId",user.getuId());
                list.add(map);
            }
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作失败，请稍后重试！");
        }
        return ActionReturnUtil.returnData(list);
    }

    @Override
    public ActionReturnUtil corporationBind() {
        List<Map<String,Object>> list = new ArrayList<>();
        List<Corporation> corporations = new ArrayList<>();
        CorporationExample corporationExample = new CorporationExample();
        corporationExample.createCriteria().andCIdIsNotNull();
        try{
            corporations = corporationMapper.selectByExample(corporationExample);
            for(Corporation corporation:corporations){
                Map<String,Object> map = new HashMap<>();
                Fund fund = fundMapper.selectByPrimaryKey(corporation.getBankrollId());
                if(fund==null){
                    map.put("bankrollId","暂未绑定");
                    map.put("total",0);
                    map.put("usable",0);
                }else{
                    map.put("bankrollId",fund.getId());
                    map.put("total",fund.getTotal());
                    map.put("usable",fund.getUsable());
                }
                map.put("name",corporation.getcName());
                map.put("idCard",corporation.getcIdcard());
                map.put("corporationId",corporation.getcId());
                list.add(map);
            }
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作失败，请稍后重试！");
        }
        return ActionReturnUtil.returnData(list);
    }
}
