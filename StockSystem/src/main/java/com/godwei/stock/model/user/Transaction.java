package com.godwei.stock.model.user;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
    private Integer id;

    private Date dealdate;

    private Integer count;

    private BigDecimal price;

    private BigDecimal procedurecost;

    private String stockId;

    private String stockName;

    private Integer bankrollId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDealdate() {
        return dealdate;
    }

    public void setDealdate(Date dealdate) {
        this.dealdate = dealdate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getProcedurecost() {
        return procedurecost;
    }

    public void setProcedurecost(BigDecimal procedurecost) {
        this.procedurecost = procedurecost;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public Integer getBankrollId() {
        return bankrollId;
    }

    public void setBankrollId(Integer bankrollId) {
        this.bankrollId = bankrollId;
    }
}