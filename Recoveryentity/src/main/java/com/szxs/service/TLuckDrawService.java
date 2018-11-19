package com.szxs.service;

import com.szxs.entity.TLuckDraw;
import java.util.List;

/**
 * 抽奖
 */
public interface TLuckDrawService {
    List<TLuckDraw> queryAll(TLuckDraw tLuckDraw, Integer from , Integer end, Integer draw);
    Integer addTLuckDraw(TLuckDraw tLuckDraw);
    Integer delTLuckDraw(Integer id);
    Integer updateTLuckDraw(Integer id);
}
