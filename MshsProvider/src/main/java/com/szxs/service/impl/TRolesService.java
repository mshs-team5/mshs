package com.szxs.service.impl;

import com.szxs.dao.TRoleDao;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TRoles;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class TRolesService implements com.szxs.service.TRolesService {
    @Resource
    private TRoleDao tRoleDao;

    public JqueryTable<TRoles> queryAll(TRoles tRoles, Integer integer, Integer integer1, Integer integer2) {
        return null;
    }

    public Integer addtttRoles(TRoles tRoles) {
        return null;
    }

    public Integer deltttRoles(String s) {
        return null;
    }

    public Integer updatetttRoles(TRoles tRoles) {
        return null;
    }

    public TRoles queryByid(String s) {
        return null;
    }

    public Integer querytttRolesRows(TRoles tRoles) {
        return null;
    }
}
