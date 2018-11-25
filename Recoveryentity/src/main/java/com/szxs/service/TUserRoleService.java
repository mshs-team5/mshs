package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TUserRole;
import java.util.List;


public interface TUserRoleService {

    JqueryTable<TUserRole> queryAll(TUserRole tUserRole, Integer from , Integer end, Integer draw);
    Integer addTUserRole(TUserRole tUserRole);
    Integer delTUserRole(String uuid);
    Integer updateTUserRole(TUserRole tUserRole);
}
