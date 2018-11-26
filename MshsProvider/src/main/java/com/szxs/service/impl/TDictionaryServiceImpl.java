package com.szxs.service.impl;

import com.szxs.dao.TDictionaryDao;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TDevuser;
import com.szxs.entity.TDictionary;
import com.szxs.service.TDictionaryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TDictionaryServiceImpl implements TDictionaryService {
    @Resource
    public TDictionaryDao tDictionaryDao;
    public JqueryTable<TDictionary> queryAll(TDictionary tDictionary, Integer integer, Integer integer1, Integer integer2) {

        JqueryTable<TDictionary> table=new JqueryTable<TDictionary>();
        return table;
    }

    public Integer addttDictionary(TDictionary tDictionary) {
        return null;
    }

    public Integer delttDictionary(String s) {
        return null;
    }

    public Integer updatettDictionary(TDictionary tDictionary) {
        return null;
    }

    public TDictionary queryByid(String s) {
        return null;
    }

    public Integer queryttDictionaryRows(TDictionary tDictionary) {
        return null;
    }
}
