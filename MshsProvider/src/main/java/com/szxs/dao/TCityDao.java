package com.szxs.dao;

import com.szxs.entity.Agent;
import com.szxs.entity.TCity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface TCityDao {
    List<Agent> queryAll(@Param("agent") TCity tCity, @Param("from") Integer from, @Param("end")Integer end);
    Integer addTCity(TCity agent);
    Integer delTCity(Integer id);
    Integer updateTCity(Integer id);
    Integer queryTCityRows(TCity tCity);
}
