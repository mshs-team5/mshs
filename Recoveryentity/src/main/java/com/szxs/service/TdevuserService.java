package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TDevuser;

import java.util.List;

public interface TdevuserService{
    JqueryTable<TDevuser> queryAll(TDevuser tDevuser, Integer from , Integer end, Integer draw);
}
