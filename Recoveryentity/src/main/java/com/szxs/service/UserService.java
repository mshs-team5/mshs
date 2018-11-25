package com.szxs.service;

import com.szxs.entity.Agent;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TCooperation;
import com.szxs.entity.TUsers;
import sun.management.resources.agent;

import java.util.List;

public interface UserService{

    JqueryTable<TUsers> queryAll(TUsers tUsers, Integer from , Integer end, Integer draw);
    Integer addTUsers(TUsers tUsers);
    Integer delTUsers(Integer id);
    Integer updateTUsers(Integer id);
}
