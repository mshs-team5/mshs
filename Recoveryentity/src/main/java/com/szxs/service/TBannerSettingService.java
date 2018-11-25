package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TBannerSetting;

import java.util.List;

public interface TBannerSettingService {

    JqueryTable<TBannerSetting> queryAll(TBannerSetting agent, Integer from , Integer end, Integer draw);
    Integer addTBannerSetting(TBannerSetting agent);
    Integer delTBannerSetting(Integer id);
    Integer updateTBannerSetting(Integer id);
}
