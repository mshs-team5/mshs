package com.szxs.service;

import com.szxs.entity.Agent;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TDevuser;

import java.util.List;

public interface TdevuserService{
    JqueryTable<TDevuser> queryAll(TDevuser tDevuser, Integer from , Integer end, Integer draw);

    Integer addtDevuser(TDevuser tDevuser);
    Integer deltDevuser(Integer id);
    Integer updatetDevuser(Integer id);
    Agent queryByid(Integer id);
    Integer querytDevuserRows(TDevuser tDevuser);
}
