package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.Recordcommission;

import java.util.List;

/**
 * 佣金提成记录
 */
public interface RecordcommissionService {

     JqueryTable<Recordcommission> queryAll(Recordcommission recordcommission, Integer from , Integer end, Integer draw);
     Integer addRecordcommission(Recordcommission recordcommission);
     Integer delRecordcommission(String id);
     Integer updateRecordcommission(Recordcommission recordcommission);
}
