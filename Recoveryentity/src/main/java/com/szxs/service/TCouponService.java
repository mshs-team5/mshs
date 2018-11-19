package com.szxs.service;

import com.szxs.entity.TCoupon;

import java.util.List;

public interface TCouponService {

    List<TCoupon> queryAll(TCoupon tCoupon, Integer from , Integer end, Integer draw);
    Integer addTCoupon(TCoupon tCoupon);
    Integer delTCoupon(Integer id);
    Integer updateTCoupon(Integer id);
}
