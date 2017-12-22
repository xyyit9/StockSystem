package com.godwei.stock.controller.manage;

import com.godwei.stock.model.manage.Corporation;
import com.godwei.stock.model.manage.User;
import com.godwei.stock.service.manage.SecuritiesService;
import com.godwei.stock.util.ActionReturnUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/manage")
public class SecuritiesController {
    @Autowired
    private SecuritiesService securitiesService;

    @RequestMapping(value = "/user/addUser",method = RequestMethod.POST)
    public ActionReturnUtil addUser(User user) throws Exception{
        return securitiesService.addUser(user);
    }

    @RequestMapping(value = "/corporation/addCorporation",method = RequestMethod.POST)
    public ActionReturnUtil addCorporation(@RequestBody Corporation corporation) throws Exception{
        return securitiesService.addCorporation(corporation);
    }

    @RequestMapping(value = "/user/listUser",method = RequestMethod.GET)
    public ActionReturnUtil listUser()throws Exception{
        return securitiesService.listUser();
    }

    @RequestMapping(value = "/corporation/listCorporation",method = RequestMethod.GET)
    public ActionReturnUtil listCorporation()throws Exception{
        return securitiesService.listCorporation();
    }

    @RequestMapping(value = "/user/lossReported",method = RequestMethod.POST)
    public ActionReturnUtil uLossReported(@Param(value = "uName") final String uName,@Param(value = "uIdcard")final String uIdcard)throws Exception{
        return securitiesService.uLossReported(uName,uIdcard);
    }

    @RequestMapping(value = "/corporation/lossReported",method = RequestMethod.POST)
    public ActionReturnUtil cLossReported(@Param(value = "cName") final String cName,@Param(value = "cIdcard")final String cIdcard,@Param(value = "cLicense") final String cLicense)throws Exception{
        return securitiesService.cLossReported(cName,cIdcard,cLicense);
    }

    @RequestMapping(value = "/user/deleteUser",method = RequestMethod.POST)
    public ActionReturnUtil deleteUser(@Param(value = "uName") final String uName,@Param(value = "uIdcard")final String uIdcard)throws Exception{
        return securitiesService.deleteUser(uName,uIdcard);
    }

    @RequestMapping(value = "/corporation/deleteCorporation",method = RequestMethod.POST)
    public ActionReturnUtil deleteCorporation(@Param(value = "cName") final String cName,@Param(value = "cIdcard")final String cIdcard,@Param(value = "cLicense") final String cLicense)throws Exception{
        return securitiesService.deleteCorporation(cName,cIdcard,cLicense);
    }
}
