package com.szxs.service;

import com.szxs.entity.TTheportal;

import java.util.List;

public interface TTheportalService {
    List<TTheportal> queryAll(TTheportal agent, Integer from , Integer end, Integer draw);
    Integer addTTheportal(TTheportal agent);
    Integer delTTheportal(Integer id);
    Integer updateTTheportal(Integer id);

}
