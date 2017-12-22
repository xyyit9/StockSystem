package com.godwei.stock.model.manage;

import java.util.Date;

public class User {
    private Integer uId;

    private String uName;

    private String uPassword;

    private String uGender;

    private String uIdcard;

    private String uAddress;

    private String uJob;

    private String uEducation;

    private String uEmployer;

    private String uTelephone;

    private Date uRecorddate;

    private String uType;

    private String uElseidcard;

    private Integer uStatus;

    private Integer bankrollId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender == null ? null : uGender.trim();
    }

    public String getuIdcard() {
        return uIdcard;
    }

    public void setuIdcard(String uIdcard) {
        this.uIdcard = uIdcard == null ? null : uIdcard.trim();
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public String getuJob() {
        return uJob;
    }

    public void setuJob(String uJob) {
        this.uJob = uJob == null ? null : uJob.trim();
    }

    public String getuEducation() {
        return uEducation;
    }

    public void setuEducation(String uEducation) {
        this.uEducation = uEducation == null ? null : uEducation.trim();
    }

    public String getuEmployer() {
        return uEmployer;
    }

    public void setuEmployer(String uEmployer) {
        this.uEmployer = uEmployer == null ? null : uEmployer.trim();
    }

    public String getuTelephone() {
        return uTelephone;
    }

    public void setuTelephone(String uTelephone) {
        this.uTelephone = uTelephone == null ? null : uTelephone.trim();
    }

    public Date getuRecorddate() {
        return uRecorddate;
    }

    public void setuRecorddate(Date uRecorddate) {
        this.uRecorddate = uRecorddate;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType == null ? null : uType.trim();
    }

    public String getuElseidcard() {
        return uElseidcard;
    }

    public void setuElseidcard(String uElseidcard) {
        this.uElseidcard = uElseidcard == null ? null : uElseidcard.trim();
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    public Integer getBankrollId() {
        return bankrollId;
    }

    public void setBankrollId(Integer bankrollId) {
        this.bankrollId = bankrollId;
    }
}