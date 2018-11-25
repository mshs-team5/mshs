package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TCoupon;

import java.util.List;

public interface TCouponService {

    JqueryTable<TCoupon> queryAll(TCoupon tCoupon, Integer from , Integer end, Integer draw);
    Integer addTCoupon(TCoupon tCoupon);
    Integer delTCoupon(Integer id);
    Integer updateTCoupon(Integer id);
}
