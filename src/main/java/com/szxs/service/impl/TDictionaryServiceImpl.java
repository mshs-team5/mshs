package com.szxs.service.impl;

import com.szxs.dao.TDictionaryDao;
import com.szxs.entity.TDictionary;
import com.szxs.service.TDictionaryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TDictionaryServiceImpl implements TDictionaryService {
    @Resource
    public TDictionaryDao tDictionaryDao;
    public List<TDictionary> queryAll(TDictionary tDictionary, Integer integer, Integer integer1, Integer integer2) {
        return tDictionaryDao.queryAll(tDictionary,integer,integer1,integer2);
    }
}
