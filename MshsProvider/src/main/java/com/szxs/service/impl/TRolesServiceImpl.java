package com.szxs.service.impl;

import com.szxs.dao.TRoleDao;
import com.szxs.entity.Agent;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TRoles;
import com.szxs.service.TRolesService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class TRolesServiceImpl implements TRolesService {
    @Resource
    private TRoleDao tRoleDao;

    public JqueryTable<TRoles> queryAll(TRoles tRoles, Integer from, Integer end, Integer draw) {
        JqueryTable<TRoles> table = new JqueryTable();
        table.setDraw(draw);
        table.setRecordsTotal(tRoleDao.querytttRolesRows(tRoles));
        table.setRecordsFiltered(table.getRecordsTotal());
        table.setData(tRoleDao.queryAll(tRoles,from,end));
        return table;
    }

    public Integer addtttRoles(TRoles tRoles) {
        return tRoleDao.addtttRoles(tRoles);
    }

    public Integer deltttRoles(String s) {
        return tRoleDao.deltttRoles(s);
    }

    public Integer updatetttRoles(TRoles tRoles) {
        return tRoleDao.updatetttRoles(tRoles);
    }

    public TRoles queryByid(String s) {
        return tRoleDao.queryByid(s);
    }

    public Integer querytttRolesRows(TRoles tRoles) {
        return tRoleDao.querytttRolesRows(tRoles);
    }
}
