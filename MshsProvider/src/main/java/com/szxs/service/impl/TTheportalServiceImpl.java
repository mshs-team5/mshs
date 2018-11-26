package com.szxs.service.impl;

import com.szxs.dao.TTheportalDao;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TCity;
import com.szxs.entity.TTheportal;
import com.szxs.service.TTheportalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TTheportalServiceImpl implements TTheportalService {

    @Resource
    public TTheportalDao tTheportalDao;

    public JqueryTable<TTheportal> queryAll(TTheportal tTheportal, Integer from , Integer end, Integer draw) {
        JqueryTable<TTheportal> table=new JqueryTable<TTheportal>();
        table.setDraw(draw);
        table.setRecordsTotal(tTheportalDao.queryTTheportalRows(tTheportal));
        table.setRecordsFiltered(table.getRecordsTotal());
        table.setData(tTheportalDao.queryAll(tTheportal,from,end));
        return table;
    }

    public Integer addTTheportal(TTheportal tTheporta) {
        return tTheportalDao.addTTheportal(tTheporta);
    }

    public Integer delTTheportal(String uuid) {
        return tTheportalDao.delTTTheportal(uuid);
    }

    public Integer updateTTheportal(TTheportal tTheportal) {
        return tTheportalDao.updateTTheportal(tTheportal);
    }

    public Integer queryTCityRows(TCity tCity) {
        return null;
    }
}
