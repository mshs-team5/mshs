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


    public JqueryTable<TDevuser> queryAll(TDevuser tDevuser, Integer integer, Integer integer1, Integer integer2) {
        return null;
    }

    public Integer addtDevuser(TDevuser tDevuser) {
        return null;
    }

    public Integer deltDevuser(String s) {
        return null;
    }

    public Integer updatetDevuser(TDevuser tDevuser) {
        return null;
    }

    public TDevuser queryByid(String s) {
        return null;
    }

    public Integer querytDevuserRows(TDevuser tDevuser) {
        return null;
    }
}
