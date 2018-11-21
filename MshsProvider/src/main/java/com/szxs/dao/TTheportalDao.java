package com.szxs.dao;

import com.szxs.entity.TTheportal;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 门店类
 */
public interface TTheportalDao {
    List<TTheportal> queryAll(@Param("tTheportal") TTheportal tTheportal, @Param("from") Integer from ,@Param("end") Integer end);

}
