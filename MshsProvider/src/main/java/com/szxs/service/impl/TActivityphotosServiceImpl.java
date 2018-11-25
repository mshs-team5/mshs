package com.szxs.service.impl;
import com.szxs.dao.TActivityphotosDao;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TActivityphotos;
import com.szxs.service.TActivityphotosService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class TActivityphotosServiceImpl implements TActivityphotosService {
    @Resource
    public TActivityphotosDao tActivityphotosDao;
    public JqueryTable<TActivityphotos> queryAll(TActivityphotos tActivityphotos, Integer integer, Integer integer1, Integer integer2) {
        JqueryTable<TActivityphotos> table=new JqueryTable<TActivityphotos>();


        return table;
    }
    public Integer addTActivityphotos(TActivityphotos tActivityphotos) {
        return null;
    }

    public Integer delTActivityphotos(String s) {
        return null;
    }

    public Integer updateTActivityphotos(TActivityphotos tActivityphotos) {
        return null;
    }
}
