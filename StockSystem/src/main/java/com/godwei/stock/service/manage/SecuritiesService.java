package com.godwei.stock.service.manage;

import com.godwei.stock.model.manage.Corporation;
import com.godwei.stock.model.manage.User;
import com.godwei.stock.util.ActionReturnUtil;

public interface SecuritiesService {
    ActionReturnUtil addUser(User user);

    ActionReturnUtil addCorporation(Corporation corporation);

    ActionReturnUtil listUser();

    ActionReturnUtil listCorporation();

    ActionReturnUtil uLossReported(String uName,String uIdcard);

    ActionReturnUtil cLossReported(String cName, String cIdcard,String cLicense);

    ActionReturnUtil deleteUser(String uName, String uIdcard);

    ActionReturnUtil deleteCorporation(String cName, String cIdcard, String cLicense);
}
