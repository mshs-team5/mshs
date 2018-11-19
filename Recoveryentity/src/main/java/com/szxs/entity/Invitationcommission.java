package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * 邀请佣金类
 */
public class Invitationcommission implements Serializable {
  private String uuid;
  private String inviterbyid;//邀请人
  private String inviter;//被邀请人
  private String status;//状态
  private Date inviterdate;//邀请时间
  private String inviterprice;//邀请佣金
  private String extfield1;
  private String extfield2;


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public String getInviterbyid() {
    return inviterbyid;
  }

  public void setInviterbyid(String inviterbyid) {
    this.inviterbyid = inviterbyid;
  }


  public String getInviter() {
    return inviter;
  }

  public void setInviter(String inviter) {
    this.inviter = inviter;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Date getInviterdate() {
    return inviterdate;
  }

  public void setInviterdate(java.sql.Date inviterdate) {
    this.inviterdate = inviterdate;
  }


  public String getInviterprice() {
    return inviterprice;
  }

  public void setInviterprice(String inviterprice) {
    this.inviterprice = inviterprice;
  }


  public String getExtfield1() {
    return extfield1;
  }

  public void setExtfield1(String extfield1) {
    this.extfield1 = extfield1;
  }


  public String getExtfield2() {
    return extfield2;
  }

  public void setExtfield2(String extfield2) {
    this.extfield2 = extfield2;
  }

}
