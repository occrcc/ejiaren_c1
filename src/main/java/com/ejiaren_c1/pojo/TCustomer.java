package com.ejiaren_c1.pojo;

import java.util.ArrayList;
import java.util.Map;

import com.ejiaren_c1.utils.Constants;

public class TCustomer {
	
	
    private String id;

    private String custname;

    private String contname;

    private String ps;

    private String contgender;

    private String status;

    private String levelId;

    private String mesTime;

    private String userId;

    private String customeraddress;

    private String customeraverageindoor;

    private String customeremail;

    private String customerintentcountry;

    private String customerintentdegree;

    private String customerintentskill;

    private String customerintenttime;

    private String customerlevel;

    private String customerphone;

    private String customerqq;

    private String customerschool;

    private String customerskillindoor;

    private String customertime;

    private String customerwechat;

    private String customerstate;

    private String meettime;

    private String telephone;

    private String customermeetstate;

    private String customergenius;

    private String opertiontime;

    private String resources;

    private String customerlanguage;

    private String customerlanguagescore;

    private String ext1;

    private String customerlanguage1;

    private String customerlanguagescore1;

    private Integer alert;

    private String alertmessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    public String getContname() {
        return contname;
    }

    public void setContname(String contname) {
        this.contname = contname == null ? null : contname.trim();
    }

    
    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps == null ? null : ps.trim();
    }

    public String getContgender() {
        return contgender;
    }

    public void setContgender(String contgender) {
        this.contgender = contgender == null ? null : contgender.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId == null ? null : levelId.trim();
    }

    public String getMesTime() {
        return mesTime;
    }

    public void setMesTime(String mesTime) {
        this.mesTime = mesTime == null ? null : mesTime.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress == null ? null : customeraddress.trim();
    }

    public String getCustomeraverageindoor() {
        return customeraverageindoor;
    }

    public void setCustomeraverageindoor(String customeraverageindoor) {
        this.customeraverageindoor = customeraverageindoor == null ? null : customeraverageindoor.trim();
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail == null ? null : customeremail.trim();
    }

    public String getCustomerintentcountry() {
        return customerintentcountry;
    }

    public void setCustomerintentcountry(String customerintentcountry) {
        this.customerintentcountry = customerintentcountry == null ? null : customerintentcountry.trim();
    }

    public String getCustomerintentdegree() {
        return customerintentdegree;
    }

    public void setCustomerintentdegree(String customerintentdegree) {
        this.customerintentdegree = customerintentdegree == null ? null : customerintentdegree.trim();
    }

    public String getCustomerintentskill() {
        return customerintentskill;
    }

    public void setCustomerintentskill(String customerintentskill) {
        this.customerintentskill = customerintentskill == null ? null : customerintentskill.trim();
    }

    public String getCustomerintenttime() {
        return customerintenttime;
    }

    public void setCustomerintenttime(String customerintenttime) {
        this.customerintenttime = customerintenttime == null ? null : customerintenttime.trim();
    }

    public String getCustomerlevel() {
        return customerlevel;
    }

    public void setCustomerlevel(String customerlevel) {
        this.customerlevel = customerlevel == null ? null : customerlevel.trim();
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone == null ? null : customerphone.trim();
    }

    public String getCustomerqq() {
        return customerqq;
    }

    public void setCustomerqq(String customerqq) {
        this.customerqq = customerqq == null ? null : customerqq.trim();
    }

    public String getCustomerschool() {
        return customerschool;
    }

    public void setCustomerschool(String customerschool) {
        this.customerschool = customerschool == null ? null : customerschool.trim();
    }

    public String getCustomerskillindoor() {
        return customerskillindoor;
    }

    public void setCustomerskillindoor(String customerskillindoor) {
        this.customerskillindoor = customerskillindoor == null ? null : customerskillindoor.trim();
    }

    public String getCustomertime() {
        return customertime;
    }

    public void setCustomertime(String customertime) {
        this.customertime = customertime == null ? null : customertime.trim();
    }

    public String getCustomerwechat() {
        return customerwechat;
    }

    public void setCustomerwechat(String customerwechat) {
        this.customerwechat = customerwechat == null ? null : customerwechat.trim();
    }

    public String getCustomerstate() {
        return customerstate;
    }

    public void setCustomerstate(String customerstate) {
        this.customerstate = customerstate == null ? null : customerstate.trim();
    }

    public String getMeettime() {
        return meettime;
    }

    public void setMeettime(String meettime) {
        this.meettime = meettime == null ? null : meettime.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getCustomermeetstate() {
        return customermeetstate;
    }

    public void setCustomermeetstate(String customermeetstate) {
        this.customermeetstate = customermeetstate == null ? null : customermeetstate.trim();
    }

    public String getCustomergenius() {
        return customergenius;
    }

    public void setCustomergenius(String customergenius) {
        this.customergenius = customergenius == null ? null : customergenius.trim();
    }

    public String getOpertiontime() {
        return opertiontime;
    }

    public void setOpertiontime(String opertiontime) {
        this.opertiontime = opertiontime == null ? null : opertiontime.trim();
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources == null ? null : resources.trim();
    }

    public String getCustomerlanguage() {
        return customerlanguage;
    }

    public void setCustomerlanguage(String customerlanguage) {
        this.customerlanguage = customerlanguage == null ? null : customerlanguage.trim();
    }

    public String getCustomerlanguagescore() {
        return customerlanguagescore;
    }

    public void setCustomerlanguagescore(String customerlanguagescore) {
        this.customerlanguagescore = customerlanguagescore == null ? null : customerlanguagescore.trim();
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getCustomerlanguage1() {
        return customerlanguage1;
    }

    public void setCustomerlanguage1(String customerlanguage1) {
        this.customerlanguage1 = customerlanguage1 == null ? null : customerlanguage1.trim();
    }

    public String getCustomerlanguagescore1() {
        return customerlanguagescore1;
    }

    public void setCustomerlanguagescore1(String customerlanguagescore1) {
        this.customerlanguagescore1 = customerlanguagescore1 == null ? null : customerlanguagescore1.trim();
    }

    public Integer getAlert() {
        return alert;
    }

    public void setAlert(Integer alert) {
        this.alert = alert;
    }

    public String getAlertmessage() {
        return alertmessage;
    }

    public void setAlertmessage(String alertmessage) {
        this.alertmessage = alertmessage == null ? null : alertmessage.trim();
    }
    
    //获取用户当前状态
    public String getCustomerLevelName(){
    	return (String) Constants.customer_level_map.get(this.customerstate);
    }
    
  //获取用户意向出国时间表
    public ArrayList<String> getCustomerCustomerIntentTime(){
    	return (ArrayList<String>) Constants.customer_intent_time;
    }
    
}