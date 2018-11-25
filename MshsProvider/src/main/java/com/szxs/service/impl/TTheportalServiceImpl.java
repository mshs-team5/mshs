package com.szxs.service.impl;

import com.szxs.dao.TTheportalDao;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TTheportal;
import com.szxs.service.TTheportalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TTheportalServiceImpl implements TTheportalService {

    @Resource
    public TTheportalDao tTheportalDao;

    public JqueryTable<TTheportal> queryAll(TTheportal tTheportal, Integer integer, Integer integer1, Integer integer2) {
        JqueryTable<TTheportal> table=new JqueryTable<TTheportal>();

        return table;
    }

    public Integer addTTheportal(TTheportal tTheporta) {
        return null;
    }

    public Integer delTTheportal(String uuid) {
        return null;
    }

    public Integer updateTTheportal(TTheportal tTheportal) {
        return null;
    }
}
