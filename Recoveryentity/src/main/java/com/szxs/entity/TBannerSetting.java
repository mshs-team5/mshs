package com.szxs.entity;

import java.io.Serializable;

/**
 * banner设置
 */
public class TBannerSetting implements Serializable {
  private String uuid;
  private String subject;
  private String type;
  private String pictureId;
  private String viewOrder;
  private String url;
  private String createdBy;
  private String creationDate;
  private String lastUpdateBy;
  private String lastUpdateDate;
  private String extField1;
  private String extField2;
  private String memo;


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getPictureId() {
    return pictureId;
  }

  public void setPictureId(String pictureId) {
    this.pictureId = pictureId;
  }


  public String getViewOrder() {
    return viewOrder;
  }

  public void setViewOrder(String viewOrder) {
    this.viewOrder = viewOrder;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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

}
