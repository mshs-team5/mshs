package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TRoles;
import com.szxs.entity.TUsers;

import java.util.List;

public interface TRolesService {

    JqueryTable<TRoles> queryAll(TRoles tRoles, Integer from , Integer end, Integer draw);
    Integer addTRoles(TRoles tRoles);
    Integer delTRoles(String uuid);
    Integer updateTRoles(TRoles tRoles);
}
