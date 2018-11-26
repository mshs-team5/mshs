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

    /**
     * 分页查询
     * @param agent
     * @param from
     * @param end
     * @param draw
     * @return JqueryTable
     */
    public JqueryTable queryAll(Agent agent, Integer from, Integer end, Integer draw) {
        JqueryTable<Agent> table = new JqueryTable();
        table.setDraw(draw);
        table.setRecordsTotal(agentDao.queryAgentsRows(agent));
        table.setRecordsFiltered(table.getRecordsTotal());
        table.setData(agentDao.queryAll(agent,from,end));
        return table ;
    }

    /**
     *
     * 添加代理商
     * @param agent
     * @return i
     */
    public Integer addAgent(Agent agent) {
        return agentDao.addAgent(agent);
    }


    /**
     * 根据id 删除代理商
     * @param uuid
     * @return
     */
    public Integer delAgent(String uuid) {
        return agentDao.delAgent(uuid);
    }

    /**
     * 跟新代理商
     * @param agent
     * @return i
     */
    public Integer updateAgent(Agent agent) {
        return agentDao.updateAgent(agent);
    }


    /**
     * 根据id 查询
     * @param uuid
     * @return agent
     */
    public Agent queryByid(String uuid) {

        return agentDao.queryByid(uuid);
    }

    /**
     * 统计总行数
     * @param agent
     * @return i
     */
    public Integer queryAgentsRows(Agent agent) {
        return agentDao.queryAgentsRows(agent) ;
    }
}
