package com.szxs.service;

import com.szxs.entity.*;

import java.util.List;

public interface TRolesService {

    JqueryTable<TRoles> queryAll(TRoles tRoles, Integer from , Integer end, Integer draw);
    Integer addtttRoles(TRoles tRoles);
    Integer deltttRoles(String  uuid);
    Integer updatetttRoles(TRoles tRoles);
    TDevuser queryByid(String id);
    Integer querytttRolesRows(TRoles tRoles);
}
