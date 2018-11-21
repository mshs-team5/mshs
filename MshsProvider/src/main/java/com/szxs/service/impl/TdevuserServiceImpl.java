package com.szxs.service.impl;

import com.szxs.dao.T_devuserDao;
import com.szxs.entity.TDevuser;
import com.szxs.service.TdevuserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TdevuserServiceImpl implements TdevuserService {

    @Resource
    public T_devuserDao t_devuserDao;
    public List<TDevuser> queryAll(TDevuser tDevuser, Integer integer, Integer integer1, Integer integer2) {
        return t_devuserDao.queryAll(tDevuser,integer,integer1);
    }
}
