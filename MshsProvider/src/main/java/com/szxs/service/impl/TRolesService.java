package com.szxs.service.impl;

import com.szxs.dao.TRoleDao;
import com.szxs.entity.TRoles;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class TRolesService implements com.szxs.service.TRolesService {
    @Resource
    private TRoleDao tRoleDao;
    public List<TRoles> queryAll(TRoles tRoles, Integer integer, Integer integer1, Integer integer2) {
        return tRoleDao.queryAll(tRoles,integer,integer1);
    }
    public Integer addTRoles(TRoles tRoles) {
        return null;
    }

    public Integer delTRoles(Integer integer) {
        return null;
    }

    public Integer updateTRoles(Integer integer) {
        return null;
    }
}
