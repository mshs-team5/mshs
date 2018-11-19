package com.szxs.service.impl;

import com.szxs.dao.AgentDao;
import com.szxs.entity.Agent;
import com.szxs.service.AgentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AgentServiceImpl implements AgentService {
    @Resource
    private AgentDao agentDao;
    public List<Agent> queryAll(Agent agent, Integer from, Integer end, Integer draw) {
        return agentDao.queryAll(agent,from,end,draw);
    }

    public Integer addAgent(Agent agent) {
        return null;
    }
    public Integer delAgent(Integer integer) {
        return null;
    }
    public Integer updateAgent(Integer integer) {
        return null;
    }
}
