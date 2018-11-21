package com.szxs.service.impl;

import com.szxs.dao.TCityDao;
import com.szxs.entity.TCity;
import com.szxs.service.TCityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TCityServiceImpl implements TCityService {

    @Resource
   private TCityDao tCityDao;
    public List<TCity> queryAll(TCity tCity, Integer integer, Integer integer1, Integer integer2) {
        return tCityDao.queryAll(tCity,integer,integer1,integer2);
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
}
