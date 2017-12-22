package com.godwei.stock.model.manage;

import java.math.BigDecimal;

public class Fund {
    private Integer id;

    private BigDecimal usable;

    private BigDecimal freezed;

    private BigDecimal incash;

    private BigDecimal total;

    private BigDecimal tocalstock;

    private String transactionpw;

    private String withdrawalspw;

    private String name;

    private String idcard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getUsable() {
        return usable;
    }

    public void setUsable(BigDecimal usable) {
        this.usable = usable;
    }

    public BigDecimal getFreezed() {
        return freezed;
    }

    public void setFreezed(BigDecimal freezed) {
        this.freezed = freezed;
    }

    public BigDecimal getIncash() {
        return incash;
    }

    public void setIncash(BigDecimal incash) {
        this.incash = incash;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTocalstock() {
        return tocalstock;
    }

    public void setTocalstock(BigDecimal tocalstock) {
        this.tocalstock = tocalstock;
    }

    public String getTransactionpw() {
        return transactionpw;
    }

    public void setTransactionpw(String transactionpw) {
        this.transactionpw = transactionpw == null ? null : transactionpw.trim();
    }

    public String getWithdrawalspw() {
        return withdrawalspw;
    }

    public void setWithdrawalspw(String withdrawalspw) {
        this.withdrawalspw = withdrawalspw == null ? null : withdrawalspw.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }
}