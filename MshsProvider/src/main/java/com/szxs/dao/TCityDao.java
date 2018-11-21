package com.szxs.dao;

import com.szxs.entity.TCity;
import java.util.List;
public interface TCityDao {
    List<TCity> queryAll(TCity agent, Integer from , Integer end, Integer draw);
    Integer addTCity(TCity agent);
    Integer delTCity(Integer id);
    Integer updateTCity(Integer id);
}
