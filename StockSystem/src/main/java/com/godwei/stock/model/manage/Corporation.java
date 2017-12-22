package com.godwei.stock.model.manage;

import java.util.Date;

public class Corporation {
    private Integer cId;

    private String cRegisternumber;

    private String cPassword;

    private String cLicense;

    private String cIdcard;

    private String cName;

    private String cTelephone;

    private Date cRecorddate;

    private String cAddress;

    private String aName;

    private String aIdcard;

    private String aTelephone;

    private String aAddress;

    private Integer bankrollId;

    private Integer cStatus;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcRegisternumber() {
        return cRegisternumber;
    }

    public void setcRegisternumber(String cRegisternumber) {
        this.cRegisternumber = cRegisternumber == null ? null : cRegisternumber.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public String getcLicense() {
        return cLicense;
    }

    public void setcLicense(String cLicense) {
        this.cLicense = cLicense == null ? null : cLicense.trim();
    }

    public String getcIdcard() {
        return cIdcard;
    }

    public void setcIdcard(String cIdcard) {
        this.cIdcard = cIdcard == null ? null : cIdcard.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone == null ? null : cTelephone.trim();
    }

    public Date getcRecorddate() {
        return cRecorddate;
    }

    public void setcRecorddate(Date cRecorddate) {
        this.cRecorddate = cRecorddate;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress == null ? null : cAddress.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaIdcard() {
        return aIdcard;
    }

    public void setaIdcard(String aIdcard) {
        this.aIdcard = aIdcard == null ? null : aIdcard.trim();
    }

    public String getaTelephone() {
        return aTelephone;
    }

    public void setaTelephone(String aTelephone) {
        this.aTelephone = aTelephone == null ? null : aTelephone.trim();
    }

    public String getaAddress() {
        return aAddress;
    }

    public void setaAddress(String aAddress) {
        this.aAddress = aAddress == null ? null : aAddress.trim();
    }

    public Integer getBankrollId() {
        return bankrollId;
    }

    public void setBankrollId(Integer bankrollId) {
        this.bankrollId = bankrollId;
    }

    public Integer getcStatus() {
        return cStatus;
    }

    public void setcStatus(Integer cStatus) {
        this.cStatus = cStatus;
    }
}