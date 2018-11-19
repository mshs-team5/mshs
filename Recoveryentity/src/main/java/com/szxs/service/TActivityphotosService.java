package com.szxs.service;

import com.szxs.entity.TActivityphotos;

import java.util.List;

public interface TActivityphotosService {
    List<TActivityphotos> queryAll(TActivityphotos agent, Integer from , Integer end, Integer draw);
    Integer addTActivityphotos(TActivityphotos agent);
    Integer delTActivityphotos(Integer id);
    Integer updateTActivityphotos(Integer id);
}
