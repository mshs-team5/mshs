package com.szxs.dao;

import com.szxs.entity.Agent;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface AgentDao {
       Integer addAgent(Agent agent);
       List<Agent> queryAll(@Param("agent") Agent agent,@Param("from") Integer from, @Param("end")Integer end);
       Integer updateAgent(Agent agent);
       Integer delAgent(Agent agent);
       Integer queryAgentsRows(Agent agent);
}
