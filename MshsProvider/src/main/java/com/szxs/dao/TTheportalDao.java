package com.szxs.dao;

import com.szxs.entity.TTheportal;

import java.util.List;

/**
 * 门店类
 */
public interface TTheportalDao {
    List<TTheportal> queryAll(TTheportal agent, Integer from , Integer end, Integer draw);

}
