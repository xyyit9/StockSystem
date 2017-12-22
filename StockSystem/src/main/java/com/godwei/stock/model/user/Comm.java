package com.godwei.stock.model.user;

import java.math.BigDecimal;
import java.util.Date;

public class Comm {
    private Integer id;

    private Integer bankrollId;

    private String stockId;

    private String commStatus;

    private Integer commquantity;

    private Integer accomplishquantity;

    private BigDecimal commprice;

    private Date commdate;

    private Date accomplishdate;

    private String stockName;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBankrollId() {
        return bankrollId;
    }

    public void setBankrollId(Integer bankrollId) {
        this.bankrollId = bankrollId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public String getCommStatus() {
        return commStatus;
    }

    public void setCommStatus(String commStatus) {
        this.commStatus = commStatus == null ? null : commStatus.trim();
    }

    public Integer getCommquantity() {
        return commquantity;
    }

    public void setCommquantity(Integer commquantity) {
        this.commquantity = commquantity;
    }

    public Integer getAccomplishquantity() {
        return accomplishquantity;
    }

    public void setAccomplishquantity(Integer accomplishquantity) {
        this.accomplishquantity = accomplishquantity;
    }

    public BigDecimal getCommprice() {
        return commprice;
    }

    public void setCommprice(BigDecimal commprice) {
        this.commprice = commprice;
    }

    public Date getCommdate() {
        return commdate;
    }

    public void setCommdate(Date commdate) {
        this.commdate = commdate;
    }

    public Date getAccomplishdate() {
        return accomplishdate;
    }

    public void setAccomplishdate(Date accomplishdate) {
        this.accomplishdate = accomplishdate;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}