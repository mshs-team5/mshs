package com.szxs.service;
import com.szxs.entity.Invitationcommission;
import com.szxs.entity.JqueryTable;

import java.util.List;

public interface InvitationcommissionService {
    /**
     * 分页查询
     * @param invitationcommission
     * @param from
     * @param end
     * @param draw
     * @return list
     */
    JqueryTable<Invitationcommission> queryAll(Invitationcommission invitationcommission, Integer from , Integer end, Integer draw);

    /**
     * 添加
     * @param invitationcommission
     * @return  i
     */
    Integer addInvitationcommission (Invitationcommission  invitationcommission);

    /**
     * 删除
     * @param
     * @return i
     */
    Integer delInvitationcommission (String id);

    /**
     * 更新
     * @param
     * @return i
     */
    Integer updateInvitationcommission (Invitationcommission invitationcommission);

}
