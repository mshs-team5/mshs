package com.szxs.dao;

import com.szxs.entity.TCity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface TCityDao {
    List<TCity> queryAll(@Param("agent") TCity agent, @Param("from")Integer from , @Param("end")Integer end, @Param("draw") Integer draw);
    Integer addTCity(TCity agent);
    Integer delTCity(Integer id);
    Integer updateTCity(Integer id);
}
