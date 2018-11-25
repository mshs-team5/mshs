package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TTheportal;

import java.util.List;

public interface TTheportalService {
    JqueryTable<TTheportal> queryAll(TTheportal agent, Integer from , Integer end, Integer draw);
    Integer addTTheportal(TTheportal agent);
    Integer delTTheportal(String uuid);
    Integer updateTTheportal(TTheportal tTheportal);

}
