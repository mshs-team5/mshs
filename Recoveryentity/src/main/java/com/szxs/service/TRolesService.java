package com.szxs.service;

import com.szxs.entity.TRoles;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TRoles;

public interface TRolesService {
    JqueryTable<TRoles> queryAll(TRoles tRoles, Integer from , Integer end, Integer draw);
    Integer addtttRoles(TRoles tRoles);
    Integer deltttRoles(String  uuid);
    Integer updatetttRoles(TRoles tRoles);
    TRoles queryByid(String id);
    Integer querytttRolesRows(TRoles tRoles);
}
