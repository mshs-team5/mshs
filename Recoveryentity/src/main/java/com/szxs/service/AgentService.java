package com.szxs.service;

import com.szxs.entity.Agent;
import com.szxs.entity.JqueryTable;

import java.util.List;

public interface AgentService{
    JqueryTable queryAll(Agent agent, Integer from , Integer end, Integer draw);
    Integer addAgent(Agent agent);
    Integer delAgent(Integer id);
    Integer updateAgent(Integer id);
    Agent queryByid(Integer id);
    Integer queryAgentsRows(Agent agent);
}
