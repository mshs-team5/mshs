package com.szxs.dao;

import com.szxs.entity.TTheportal;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 门店类
 */
public interface TTheportalDao {/**
 * 分页查询
 * @param tTheportal
 * @param from
 * @param end
 * @return
 */
List<TTheportal> queryAll(@Param("tTheportal") TTheportal tTheportal, @Param("from") Integer from ,@Param("end") Integer end);

    /**
     * 新增门店
     * @param tTheportal 门店对象
     * @return
     */
    Integer addTTheportal(TTheportal tTheportal);

    /**
     * 删除门店
     * @param id
     * @return
     */
    Integer delTTTheportal(String id);

    /**
     * 修改
     * @param tTheportal
     * @return
     */
    Integer updateTTheportal(TTheportal tTheportal);

    /**
     * 查询总数
     * @param tTheportal
     * @return
     */
    Integer queryTTheportalRows(TTheportal tTheportal);
}
