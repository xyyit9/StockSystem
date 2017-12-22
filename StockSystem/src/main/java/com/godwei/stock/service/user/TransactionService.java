package com.godwei.stock.service.user;

import com.godwei.stock.model.user.Comm;
import com.godwei.stock.util.ActionReturnUtil;

public interface TransactionService {
    ActionReturnUtil addComm(Comm comm);

}
