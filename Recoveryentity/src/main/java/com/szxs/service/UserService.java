package com.szxs.service;


import com.szxs.entity.JqueryTable;
import com.szxs.entity.TUsers;


public interface UserService{

    JqueryTable<TUsers> queryAll(TUsers tUsers, Integer from , Integer end, Integer draw);
    Integer addTUsers(TUsers tUsers);
    Integer delTUsers(Integer id);
    Integer updateTUsers(Integer id);
}
