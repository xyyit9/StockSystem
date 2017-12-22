package com.godwei.stock.service.user;

import com.godwei.stock.util.ActionReturnUtil;

public interface UserService {
    ActionReturnUtil commListById(String bankroll_id);

    ActionReturnUtil cacelComm(Integer id);

    ActionReturnUtil positionList(String bankroll_id);

    ActionReturnUtil transationList(String bankroll_id);

    ActionReturnUtil myBank(String id);

    ActionReturnUtil login(String idcard, String transactionPw);
}
