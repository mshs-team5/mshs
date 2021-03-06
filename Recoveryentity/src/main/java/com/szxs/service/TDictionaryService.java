package com.szxs.service;

import com.szxs.entity.JqueryTable;
import com.szxs.entity.TDictionary;
public interface TDictionaryService {
    JqueryTable<TDictionary> queryAll(TDictionary tDictionary, Integer from , Integer end, Integer draw);
    Integer addttDictionary(TDictionary tDictionary);
    Integer delttDictionary(String  uuid);
    Integer updatettDictionary(TDictionary tDictionary);
    TDictionary queryByid(String id);
    Integer queryttDictionaryRows(TDictionary tDictionary);
}
