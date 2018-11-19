package com.szxs.service;

import com.szxs.entity.TBannerSetting;

import java.util.List;

public interface TBannerSettingService {

    List<TBannerSetting> queryAll(TBannerSetting agent, Integer from , Integer end, Integer draw);
    Integer addTBannerSetting(TBannerSetting agent);
    Integer delTBannerSetting(Integer id);
    Integer updateTBannerSetting(Integer id);
}
