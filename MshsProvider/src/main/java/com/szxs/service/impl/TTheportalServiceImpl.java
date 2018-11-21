package com.szxs.service.impl;

import com.szxs.dao.TTheportalDao;
import com.szxs.entity.TTheportal;
import com.szxs.service.TTheportalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TTheportalServiceImpl implements TTheportalService {

    @Resource
    public TTheportalDao tTheportalDao;

    public List<TTheportal> queryAll(TTheportal tTheportal, Integer integer, Integer integer1, Integer integer2) {
        return tTheportalDao.queryAll(tTheportal,integer,integer1);
    }

    public Integer addTTheportal(TTheportal tTheportal) {
        return null;
    }

    public Integer delTTheportal(Integer integer) {
        return null;
    }

    public Integer updateTTheportal(Integer integer) {
        return null;
    }
}
