package com.godwei.stock.controller.user;

import com.godwei.stock.service.user.UserService;
import com.godwei.stock.util.ActionReturnUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/commListById",method = RequestMethod.GET)
    public ActionReturnUtil commListById(@Param(value = "bankroll_id")final String bankroll_id) throws Exception{
        return userService.commListById(bankroll_id);
    }

    @RequestMapping(value = "/cacelComm",method = RequestMethod.POST)
    public ActionReturnUtil cacelComm(@Param(value = "id")final Integer id)throws Exception{
        return userService.cacelComm(id);
    }

    @RequestMapping(value = "/positionList",method = RequestMethod.GET)
    public ActionReturnUtil positionList(@Param(value = "bankroll_id")final String bankroll_id) throws Exception{
        return userService.positionList(bankroll_id);
    }

    @RequestMapping(value = "/transactionList",method = RequestMethod.GET)
    public ActionReturnUtil transationList(@Param(value = "bankroll_id")final String bankroll_id) throws Exception{
        return userService.transationList(bankroll_id);
    }

    @RequestMapping(value = "/myBank",method = RequestMethod.GET)
    public ActionReturnUtil myBank(@Param(value = "id")final String id) throws Exception{
        return userService.myBank(id);
    }

    @RequestMapping(value = "/login1",method = RequestMethod.GET)
    public ActionReturnUtil login(@Param(value = "idcard")final String idcard,@Param(value = "transactionPw")final String transactionPw) throws Exception{
        return userService.login(idcard,transactionPw);
}

}


