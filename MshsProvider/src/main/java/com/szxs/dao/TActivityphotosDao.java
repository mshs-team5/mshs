package com.szxs.dao;

import com.szxs.entity.TActivityphotos;

import java.util.List;

public interface TActivityphotosDao {
    List<TActivityphotos> queryAll(TActivityphotos agent, Integer from , Integer end, Integer draw);
}
