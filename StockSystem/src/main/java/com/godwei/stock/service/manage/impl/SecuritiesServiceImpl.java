package com.godwei.stock.service.manage.impl;

import com.godwei.stock.mapper.manage.CorporationMapper;
import com.godwei.stock.mapper.manage.UserMapper;
import com.godwei.stock.model.manage.Corporation;
import com.godwei.stock.model.manage.CorporationExample;
import com.godwei.stock.model.manage.User;
import com.godwei.stock.model.manage.UserExample;
import com.godwei.stock.service.manage.SecuritiesService;
import com.godwei.stock.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SecuritiesServiceImpl implements SecuritiesService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CorporationMapper corporationMapper;

    @Override
    public ActionReturnUtil addUser(User user) {
        User user1 = new User();
        user.setuStatus(1);
        user.setuRecorddate(new Date());
        user.setBankrollId(0);
        try{
            user1 = userMapper.selectByIdcard(user.getuIdcard());
            if(user1!=null){
                if(user1.getuStatus()==0){
                    user.setuId(user1.getuId());
                    userMapper.updateByPrimaryKeySelective(user);
                    return ActionReturnUtil.returnSuccess();
                }else {
                    return ActionReturnUtil.returnErrorWithMsg("账户已经注册。");
                }
            }
            userMapper.insertSelective(user);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作错误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil addCorporation(Corporation corporation) {
        Corporation corporation1 = new Corporation();
        corporation.setcStatus(1);
        corporation.setcRecorddate(new Date());
        corporation.setBankrollId(0);
        try{
            corporation1 = corporationMapper.selectByIdcard(corporation.getcIdcard());
            if(corporation1!=null){
                if(corporation1.getcStatus()==0){
                    corporation.setcId(corporation1.getcId());
                    corporationMapper.updateByPrimaryKeySelective(corporation);
                    return ActionReturnUtil.returnSuccess();
                }else{
                    return ActionReturnUtil.returnErrorWithMsg("账户已经注册。");
                }
            }
            corporationMapper.insertSelective(corporation);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作错误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil listUser() {
        List<User> users = new ArrayList<>();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUIdIsNotNull();
        try{
            users = userMapper.selectByExample(userExample);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作错误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccessWithData(users);
    }

    @Override
    public ActionReturnUtil listCorporation() {
        List<Corporation> corporations = new ArrayList<>();
        CorporationExample corporationExample  = new CorporationExample();
        corporationExample.createCriteria().andCIdIsNotNull();
        try{
            corporations = corporationMapper.selectByExample(corporationExample);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作错误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccessWithData(corporations);
    }

    @Override
    public ActionReturnUtil uLossReported(String uName,String uIdcard) {
        List<User> users = new ArrayList<>();
        User user = new User();
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUIdcardEqualTo(uIdcard).andUNameEqualTo(uName);
        try{
            users = userMapper.selectByExample(userExample);
            if(users==null||users.equals("")){
                return ActionReturnUtil.returnErrorWithMsg("操作失误，请稍后重试！");
            }
            user = users.get(0);
            user.setuStatus(0);
            userMapper.updateByPrimaryKeySelective(user);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作失误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil cLossReported(String cName, String cIdcard,String cLicense) {
        List<Corporation> corporations = new ArrayList<>();
        Corporation corporation = new Corporation();
        CorporationExample corporationExample = new CorporationExample();
        corporationExample.createCriteria().andCNameEqualTo(cName).andCIdcardEqualTo(cIdcard).andCLicenseEqualTo(cLicense);
        try{
            corporations = corporationMapper.selectByExample(corporationExample);
            if(corporations==null||corporations.equals("")){
                return ActionReturnUtil.returnErrorWithMsg("操作失误，请稍后重试！");
            }
            corporation = corporations.get(0);
            corporation.setcStatus(0);
            corporationMapper.updateByPrimaryKeySelective(corporation);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作失误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil deleteUser(String uName, String uIdcard) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUNameEqualTo(uName).andUIdcardEqualTo(uIdcard);
        try{
            userMapper.deleteByExample(userExample);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作失误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

    @Override
    public ActionReturnUtil deleteCorporation(String cName, String cIdcard, String cLicense) {
        CorporationExample corporationExample = new CorporationExample();
        corporationExample.createCriteria().andCNameEqualTo(cName).andCIdcardEqualTo(cIdcard).andCLicenseEqualTo(cIdcard);
        try{
            corporationMapper.deleteByExample(corporationExample);
        }catch (Exception e){
            return ActionReturnUtil.returnErrorWithMsg("操作失误，请稍后重试！");
        }
        return ActionReturnUtil.returnSuccess();
    }

}
