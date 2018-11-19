package com.szxs.service;

import com.szxs.entity.TCity;
import java.util.List;
public interface TCityService{
    List<TCity> queryAll(TCity agent, Integer from , Integer end, Integer draw);
    Integer addTCity(TCity agent);
    Integer delTCity(Integer id);
    Integer updateTCity(Integer id);
}
