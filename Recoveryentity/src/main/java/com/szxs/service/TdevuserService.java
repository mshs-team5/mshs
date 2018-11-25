package com.szxs.service;

import com.szxs.entity.Agent;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TDevuser;

import java.util.List;

public interface TdevuserService{
    JqueryTable<TDevuser> queryAll(TDevuser tDevuser, Integer from , Integer end, Integer draw);

    Integer addtDevuser(TDevuser tDevuser);
    Integer deltDevuser(String  uuid);
    Integer updatetDevuser(TDevuser tDevuser);
    TDevuser queryByid(String id);
    Integer querytDevuserRows(TDevuser tDevuser);
}
