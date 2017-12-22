package com.godwei.stock.controller.user;

import com.godwei.stock.model.user.Comm;
import com.godwei.stock.service.user.TransactionService;
import com.godwei.stock.util.ActionReturnUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/client/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value = "/addComm",method = RequestMethod.POST)
    public ActionReturnUtil addComm(@RequestBody Comm comm)throws Exception{
        return transactionService.addComm(comm);
    }
}
