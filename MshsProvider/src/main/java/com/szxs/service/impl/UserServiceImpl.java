package com.szxs.service.impl;
import com.szxs.dao.TUserDao;
import com.szxs.entity.Agent;
import com.szxs.entity.JqueryTable;
import com.szxs.entity.TUsers;
import com.szxs.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
  @Resource
    private TUserDao tUserDao;
    public JqueryTable<TUsers> queryAll(TUsers tUsers, Integer from, Integer end, Integer draw) {
        JqueryTable<TUsers> table = new JqueryTable<TUsers> ();
        return table;
    }
    public Integer addTUsers(TUsers tUsers) {
        return null;
    }
    public Integer delTUsers(Integer integer) {
        return null;
    }
    public Integer updateTUsers(Integer integer) {
        return null;
    }
}
