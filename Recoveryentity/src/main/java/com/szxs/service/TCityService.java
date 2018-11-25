package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TCity;
import java.util.List;
public interface TCityService{
    JqueryTable<TCity> queryAll(TCity agent, Integer from , Integer end, Integer draw);
    Integer addTCity(TCity agent);
    Integer delTCity(Integer id);
    Integer updateTCity(Integer id);
}
