package com.szxs.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * 抽奖类
 */
public class TLuckDraw implements Serializable {

  private String uuid;
  private Date drawdate;
  private String userid;
  private String prizetype;
  private String prizestatus;
  private String extfield1;
  private String extfield2;


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public Date getDrawdate() {
    return drawdate;
  }

  public void setDrawdate(java.sql.Date drawdate) {
    this.drawdate = drawdate;
  }


  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  public String getPrizetype() {
    return prizetype;
  }

  public void setPrizetype(String prizetype) {
    this.prizetype = prizetype;
  }


  public String getPrizestatus() {
    return prizestatus;
  }

  public void setPrizestatus(String prizestatus) {
    this.prizestatus = prizestatus;
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
