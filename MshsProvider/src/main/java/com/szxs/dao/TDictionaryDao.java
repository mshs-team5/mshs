package com.szxs.dao;

import com.szxs.entity.TDictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TDictionaryDao {
    List<TDictionary> queryAll(@Param("tDictionary") TDictionary tDictionary,@Param("from")Integer from,@Param("end") Integer end);
    Integer addttDictionary(TDictionary tDictionary);
    Integer delttDictionary(String  uuid);
    Integer updatettDictionary(TDictionary tDictionary);
    TDictionary queryByid(String id);
    Integer queryttDictionaryRows(TDictionary tDictionary);
}
