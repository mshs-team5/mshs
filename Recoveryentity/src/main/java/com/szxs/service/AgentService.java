package com.szxs.service;

import com.szxs.entity.Agent;
import com.szxs.entity.JqueryTable;

import java.util.List;

public interface AgentService{
    JqueryTable<Agent> queryAll(Agent agent, Integer from , Integer end, Integer draw);
    Integer addAgent(Agent agent);
    Integer delAgent(String uuid);
    Integer updateAgent(Agent agent);
    Agent queryByid(String uuid);
    Integer queryAgentsRows(Agent agent);
}
