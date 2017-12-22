package com.godwei.stock.controller.manage;

import com.godwei.stock.service.manage.FundService;
import com.godwei.stock.util.ActionReturnUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/manage/fund")
public class FundsController {
    @Autowired
    private FundService fundService;

    @RequestMapping(value = "/addFund",method = RequestMethod.POST)
    public ActionReturnUtil addFund(@RequestBody Map<String,Object> map)throws Exception{
        return fundService.addFund(map);
    }

    @RequestMapping(value = "/saveMoney",method = RequestMethod.POST)
    public ActionReturnUtil saveMoney(@RequestBody Map<String,Object> map)throws Exception{
        return fundService.saveMoney(map);
    }

    @RequestMapping(value = "/withdrawalMoney",method = RequestMethod.POST)
    public ActionReturnUtil withdrawalMoney(@RequestBody Map<String,Object> map) throws Exception{
        return fundService.withdrawalMoney(map);
    }

    @RequestMapping(value = "/reliefBind",method = RequestMethod.POST)
    public ActionReturnUtil reliefBind(@RequestBody Map<String,Object> map) throws Exception{
        return fundService.reliefBind(map);
    }

    @RequestMapping(value = "/userBind",method = RequestMethod.GET)
    public ActionReturnUtil userBind() throws Exception{
        return fundService.userBind();
    }

    @RequestMapping(value = "/corporationBind",method = RequestMethod.GET)
    public ActionReturnUtil corporationBind() throws Exception{
        return fundService.corporationBind();
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ActionReturnUtil test(@Param(value = "test")final String test)throws Exception{
        System.out.println(test);
        List<String[]> list = new ArrayList<>();
        String a = "2004-01-02";
//        list.add("\"2004-01-02\",10452.74,10409.85,10367.41,10554.96,168890000");
//        list.add("\"2004-01-06\",10543.85,10538.66,10454.37,10584.07,191460000");
        return ActionReturnUtil.returnData(list);
    }
}
