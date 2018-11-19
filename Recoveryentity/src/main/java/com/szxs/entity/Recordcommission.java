package com.szxs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 邀请佣金提成记录类
 */
public class Recordcommission implements Serializable {
  private String uuid;
  private String icid;//邀请佣金类id
  private Date createdate;//创建时间
  private String extfield1;
  private String extfield2;


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public String getIcid() {
    return icid;
  }

  public void setIcid(String icid) {
    this.icid = icid;
  }


  public Date getCreatedate() {
    return createdate;
  }

  public void setCreatedate(java.sql.Date createdate) {
    this.createdate = createdate;
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
