package com.szxs.entity;

import java.io.Serializable;

/**
 * 首页活动图片类
 */
public class TActivityphotos implements Serializable {
  private String uuid;
  private String picturid;
  private String extfield1;
  private String extfield2;
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }
  public String getPicturid() {
    return picturid;
  }
  public void setPicturid(String picturid) {
    this.picturid = picturid;
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
