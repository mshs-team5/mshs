package com.szxs.service.impl;

import com.szxs.dao.T_devuserDao;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TDevuser;
import com.szxs.service.TdevuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TdevuserServiceImpl implements TdevuserService{
    @Resource
    public T_devuserDao t_devuserDao;
    public Integer addtDevuser(TDevuser tDevuser) {
        return null;
    }
    public JqueryTable<TDevuser> queryAll(TDevuser tDevuser, Integer integer, Integer integer1, Integer integer2) {
        JqueryTable<TDevuser> table=new JqueryTable<TDevuser>();
        table.setDraw(integer2);
        table.setRecordsTotal(t_devuserDao.queryTDevusersRows(tDevuser));
        table.setRecordsFiltered(table.getRecordsTotal());
        table.setData(t_devuserDao.queryAll(tDevuser,integer,integer1));
        return table;

    }
    public Integer deltDevuser(String s) {
        return t_devuserDao.delTDevuser(s);
    }

    public Integer updatetDevuser(TDevuser tDevuser) {
        return t_devuserDao.updateTDevuser(tDevuser);
    }
    public TDevuser queryByid(String s) {
        return t_devuserDao.queryByid(s);
    }
    public Integer querytDevuserRows(TDevuser tDevuser) {
        return t_devuserDao.queryTDevusersRows(tDevuser);
    }


}
