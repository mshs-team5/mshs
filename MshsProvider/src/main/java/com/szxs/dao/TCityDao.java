package com.szxs.dao;

import com.szxs.entity.Agent;
import com.szxs.entity.TCity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface TCityDao {
    List<TCity> queryAll(@Param("agent") TCity tCity, @Param("from") Integer from, @Param("end")Integer end);
    Integer addTCity(TCity agent);
    Integer delTCity(String id);
    Integer updateTCity(TCity tCity);
    Integer queryTCityRows(TCity tCity);
}
