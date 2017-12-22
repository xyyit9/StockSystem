package com.godwei.stock.service.manage;

import com.godwei.stock.util.ActionReturnUtil;

import java.util.Map;

public interface FundService {
    ActionReturnUtil addFund(Map<String,Object> map);

    ActionReturnUtil saveMoney(Map<String, Object> map);

    ActionReturnUtil withdrawalMoney(Map<String, Object> map);

    ActionReturnUtil reliefBind(Map<String, Object> map);

    ActionReturnUtil userBind();

    ActionReturnUtil corporationBind();
}
