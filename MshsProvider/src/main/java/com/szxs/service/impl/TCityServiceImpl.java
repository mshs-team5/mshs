package com.szxs.service.impl;

import com.szxs.dao.TCityDao;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TCity;
import com.szxs.service.TCityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TCityServiceImpl implements TCityService {

    @Resource
   private TCityDao tCityDao;


    public JqueryTable queryAll(TCity tCity, Integer from, Integer end, Integer draw) {
        JqueryTable table = new JqueryTable();
        table.setDraw(draw);
        table.setRecordsTotal(tCityDao.queryTCityRows(tCity));
        table.setRecordsFiltered(table.getRecordsTotal());
        table.setData(tCityDao.queryAll(tCity,from,end));
        return table;
    }

    public Integer addTCity(TCity tCity) {
        return null;
    }

    public Integer delTCity(Integer integer) {
        return null;
    }

    public Integer updateTCity(Integer integer) {
        return null;
    }

    public Integer queryAgentsRows(TCity tCity) {
        return null;
    }
}
