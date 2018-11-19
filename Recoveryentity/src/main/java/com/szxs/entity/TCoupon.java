package com.szxs.entity;

import java.io.Serializable;

/**
 * 优惠卷
 */
public class TCoupon implements Serializable {
  private String uuid;
  private String couponName;
  private String couponAmount;
  private String couponsStarttime;
  private String couponsEndtime;
  private String couponsType;
  private String couponsRestrictions;
  private String couponsExplain;
  private String createdBy;
  private String creationDate;
  private String lastUpdateBy;
  private String lastUpdateDate;
  private String memo;
  private String claimCode;
  private String useThreshold;
  private String phoneMobile;
  private String phoneBrand;
  private String id;
  private String userTypes;
  private String isgrant;


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public String getCouponName() {
    return couponName;
  }

  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }


  public String getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(String couponAmount) {
    this.couponAmount = couponAmount;
  }


  public String getCouponsStarttime() {
    return couponsStarttime;
  }

  public void setCouponsStarttime(String couponsStarttime) {
    this.couponsStarttime = couponsStarttime;
  }


  public String getCouponsEndtime() {
    return couponsEndtime;
  }

  public void setCouponsEndtime(String couponsEndtime) {
    this.couponsEndtime = couponsEndtime;
  }


  public String getCouponsType() {
    return couponsType;
  }

  public void setCouponsType(String couponsType) {
    this.couponsType = couponsType;
  }


  public String getCouponsRestrictions() {
    return couponsRestrictions;
  }

  public void setCouponsRestrictions(String couponsRestrictions) {
    this.couponsRestrictions = couponsRestrictions;
  }


  public String getCouponsExplain() {
    return couponsExplain;
  }

  public void setCouponsExplain(String couponsExplain) {
    this.couponsExplain = couponsExplain;
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


  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  public String getClaimCode() {
    return claimCode;
  }

  public void setClaimCode(String claimCode) {
    this.claimCode = claimCode;
  }


  public String getUseThreshold() {
    return useThreshold;
  }

  public void setUseThreshold(String useThreshold) {
    this.useThreshold = useThreshold;
  }


  public String getPhoneMobile() {
    return phoneMobile;
  }

  public void setPhoneMobile(String phoneMobile) {
    this.phoneMobile = phoneMobile;
  }


  public String getPhoneBrand() {
    return phoneBrand;
  }

  public void setPhoneBrand(String phoneBrand) {
    this.phoneBrand = phoneBrand;
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUserTypes() {
    return userTypes;
  }

  public void setUserTypes(String userTypes) {
    this.userTypes = userTypes;
  }


  public String getIsgrant() {
    return isgrant;
  }

  public void setIsgrant(String isgrant) {
    this.isgrant = isgrant;
  }

}
