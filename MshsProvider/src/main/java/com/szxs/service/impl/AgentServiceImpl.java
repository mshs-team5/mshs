package com.szxs.service.impl;

import com.szxs.dao.AgentDao;
import com.szxs.entity.Agent;
import com.szxs.entity.JqueryTable;
import com.szxs.service.AgentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class AgentServiceImpl implements AgentService {
    @Resource
    private AgentDao agentDao;
    public JqueryTable queryAll(Agent agent, Integer from, Integer end, Integer draw) {
        JqueryTable table = new JqueryTable();
        table.setDraw(draw);
        table.setRecordsTotal(agentDao.queryAgentsRows(agent));
        table.setRecordsFiltered(table.getRecordsTotal());
        table.setData(agentDao.queryAll(agent,from,end));
        return table ;
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

    public Agent queryByid(Integer integer) {
        return null;
    }

    public Integer queryAgentsRows(Agent agent) {
        return agentDao.queryAgentsRows(agent) ;
    }
}
