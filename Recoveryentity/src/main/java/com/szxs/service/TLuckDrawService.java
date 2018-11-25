package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TLuckDraw;
import java.util.List;

/**
 * 抽奖
 */
public interface TLuckDrawService {
    JqueryTable<TLuckDraw> queryAll(TLuckDraw tLuckDraw, Integer from , Integer end, Integer draw);
    Integer addTLuckDraw(TLuckDraw tLuckDraw);
    Integer delTLuckDraw(String uuid);
    Integer updateTLuckDraw(TLuckDraw tLuckDraw);
}
