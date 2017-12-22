package com.godwei.stock.service.user.impl;

import com.godwei.stock.mapper.manage.FundMapper;
import com.godwei.stock.mapper.user.CommMapper;
import com.godwei.stock.mapper.user.PositionMapper;
import com.godwei.stock.mapper.user.TransactionMapper;
import com.godwei.stock.model.manage.Fund;
import com.godwei.stock.model.user.*;
import com.godwei.stock.service.user.UserService;
import com.godwei.stock.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private CommMapper commMapper;
    @Autowired
    private PositionMapper positionMapper;
    @Autowired
    private TransactionMapper transactionMapper;
    @Autowired
    private FundMapper fundMapper;


    @Override
    public ActionReturnUtil commListById(String bankroll_id) {
        Integer id = new Integer(bankroll_id);
        CommExample commExample = new CommExample();
        commExample.createCriteria().andBankrollIdEqualTo(id);
        List<Comm> comms = new ArrayList<>();
        try{
            comms = commMapper.selectByExample(commExample);
            if(comms==null){
                return ActionReturnUtil.returnErrorWithMsg("您当前没有委托信息！");
            }
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("服务器忙，稍后重试！");
        }
        return ActionReturnUtil.returnData(comms);
    }

    @Override
    public ActionReturnUtil cacelComm(Integer id) {
        Comm comm = new Comm();
        comm.setCommStatus("已取消！");
        try{
            commMapper.updateByPrimaryKeySelective(comm);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("服务器忙，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil positionList(String bankroll_id) {
        Integer id = new Integer(bankroll_id);
        PositionExample positionExample = new PositionExample();
        positionExample.createCriteria().andBankrollIdEqualTo(id);
        List<Position> list = new ArrayList<>();
        try{
            list = positionMapper.selectByExample(positionExample);
            if(list==null){
                return ActionReturnUtil.returnSuccessWithMsg("您暂无持仓！");
            }
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("服务器忙，请稍后重试！");
        }
        return ActionReturnUtil.returnData(list);
    }

    @Override
    public ActionReturnUtil transationList(String bankroll_id) {
        Integer id = new Integer(bankroll_id);
        TransactionExample transactionExample = new TransactionExample();
        transactionExample.createCriteria().andBankrollIdEqualTo(id);
        List<Transaction> list = new ArrayList<>();
        try{
            list = transactionMapper.selectByExample(transactionExample);
            if(list==null){
                return ActionReturnUtil.returnSuccessWithMsg("该账户暂无交易明细!");
            }
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("系统繁忙，请稍后重试！");
        }
        return ActionReturnUtil.returnData(list);
    }

    @Override
    public ActionReturnUtil myBank(String id) {
        Fund fund = new Fund();
        try{
            fund = fundMapper.selectByPrimaryKey(new Integer(id));
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("该账户为无效账户！");
        }
        return ActionReturnUtil.returnData(fund);
    }

    @Override
    public ActionReturnUtil login(String idcard, String transactionPw) {
        Fund fund = new Fund();
        Fund fund1 = new Fund();
        fund1.setIdcard(idcard);
        fund1.setTransactionpw(transactionPw);
        try{
            fund = fundMapper.selectIdcardAndPw(fund1);
            if(fund==null){
                return ActionReturnUtil.returnErrorWithMsg("账户名或密码或错误！");
            }
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("服务器忙，请稍后再试！");
        }
        return ActionReturnUtil.returnSuccessWithData(fund);
    }
}
