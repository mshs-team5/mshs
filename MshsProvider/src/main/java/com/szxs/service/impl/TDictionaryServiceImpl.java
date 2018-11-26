package com.szxs.service.impl;

import com.szxs.dao.TDictionaryDao;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TDictionary;
import com.szxs.entity.TRoles;
import com.szxs.service.TDictionaryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TDictionaryServiceImpl implements TDictionaryService {
    @Resource
    public TDictionaryDao tDictionaryDao;

    public JqueryTable<TDictionary> queryAll(TDictionary tDictionary,  Integer from, Integer end, Integer draw) {
        JqueryTable<TDictionary> table = new JqueryTable();
        table.setDraw(draw);
        table.setRecordsTotal(tDictionaryDao.queryttDictionaryRows(tDictionary));
        table.setRecordsFiltered(table.getRecordsTotal());
        table.setData(tDictionaryDao.queryAll(tDictionary,from,end));
        return table;
    }

    public Integer addttDictionary(TDictionary tDictionary) {
        return tDictionaryDao.addttDictionary(tDictionary);
    }

    public Integer delttDictionary(String s) {
        return tDictionaryDao.delttDictionary(s);
    }

    public Integer updatettDictionary(TDictionary tDictionary) {
        return tDictionaryDao.updatettDictionary(tDictionary);
    }

    public TDictionary queryByid(String s) {
        return null;
    }

    public Integer queryttDictionaryRows(TDictionary tDictionary) {
        return tDictionaryDao.queryttDictionaryRows(tDictionary);
    }
}
