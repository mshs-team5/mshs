package com.szxs.entity;

import java.io.Serializable;

/**
 * 权限分配
 */
public class TUserRole implements Serializable {
  private String userId;
  private String roleId;
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

}
