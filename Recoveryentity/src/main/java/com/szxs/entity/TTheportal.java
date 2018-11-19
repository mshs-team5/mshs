package com.szxs.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 门店类
 */
public class TTheportal implements Serializable {

  private String id;
  private String nameportal;
  private String addressportal;
  private Date portaltime;
  private String extfield1;
  private String extfield2;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getNameportal() {
    return nameportal;
  }

  public void setNameportal(String nameportal) {
    this.nameportal = nameportal;
  }


  public String getAddressportal() {
    return addressportal;
  }

  public void setAddressportal(String addressportal) {
    this.addressportal = addressportal;
  }


  public Date getPortaltime() {
    return portaltime;
  }

  public void setPortaltime(java.sql.Date portaltime) {
    this.portaltime = portaltime;
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
