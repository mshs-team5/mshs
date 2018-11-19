package com.szxs.entity;

import java.io.Serializable;

/**
 * 城市类
 */
public class TCity implements Serializable{
  private String uuid;
  private String province;
  private String city;
  private String pinyin;
  private String viewOrder;
  private String hot;
  private String createdBy;
  private String creationDate;
  private String lastUpdateBy;
  private String lastUpdateDate;
  private String extField1;
  private String extField2;
  private String memo;
  private String ll;
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getPinyin() {
    return pinyin;
  }

  public void setPinyin(String pinyin) {
    this.pinyin = pinyin;
  }


  public String getViewOrder() {
    return viewOrder;
  }

  public void setViewOrder(String viewOrder) {
    this.viewOrder = viewOrder;
  }


  public String getHot() {
    return hot;
  }

  public void setHot(String hot) {
    this.hot = hot;
  }


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }


  public String getLastUpdateBy() {
    return lastUpdateBy;
  }

  public void setLastUpdateBy(String lastUpdateBy) {
    this.lastUpdateBy = lastUpdateBy;
  }


  public String getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(String lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public String getExtField1() {
    return extField1;
  }

  public void setExtField1(String extField1) {
    this.extField1 = extField1;
  }


  public String getExtField2() {
    return extField2;
  }

  public void setExtField2(String extField2) {
    this.extField2 = extField2;
  }


  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  public String getLl() {
    return ll;
  }

  public void setLl(String ll) {
    this.ll = ll;
  }

}
