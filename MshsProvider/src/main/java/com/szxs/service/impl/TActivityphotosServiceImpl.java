package com.szxs.service.impl;

import com.szxs.dao.TActivityphotosDao;
import com.szxs.entity.TActivityphotos;
import com.szxs.service.TActivityphotosService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TActivityphotosServiceImpl implements TActivityphotosService {

    @Resource
    public TActivityphotosDao tActivityphotosDao;
    public List<TActivityphotos> queryAll(TActivityphotos tActivityphotos, Integer integer, Integer integer1, Integer integer2) {
        return tActivityphotosDao.queryAll(tActivityphotos,integer,integer1,integer2);
    }

    public Integer addTActivityphotos(TActivityphotos tActivityphotos) {
        return null;
    }

    public Integer delTActivityphotos(Integer integer) {
        return null;
    }

    public Integer updateTActivityphotos(Integer integer) {
        return null;
    }
}
