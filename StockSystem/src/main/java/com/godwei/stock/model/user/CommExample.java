package com.godwei.stock.model.user;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBankrollIdIsNull() {
            addCriterion("bankroll_id is null");
            return (Criteria) this;
        }

        public Criteria andBankrollIdIsNotNull() {
            addCriterion("bankroll_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankrollIdEqualTo(Integer value) {
            addCriterion("bankroll_id =", value, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andBankrollIdNotEqualTo(Integer value) {
            addCriterion("bankroll_id <>", value, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andBankrollIdGreaterThan(Integer value) {
            addCriterion("bankroll_id >", value, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andBankrollIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bankroll_id >=", value, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andBankrollIdLessThan(Integer value) {
            addCriterion("bankroll_id <", value, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andBankrollIdLessThanOrEqualTo(Integer value) {
            addCriterion("bankroll_id <=", value, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andBankrollIdIn(List<Integer> values) {
            addCriterion("bankroll_id in", values, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andBankrollIdNotIn(List<Integer> values) {
            addCriterion("bankroll_id not in", values, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andBankrollIdBetween(Integer value1, Integer value2) {
            addCriterion("bankroll_id between", value1, value2, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andBankrollIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bankroll_id not between", value1, value2, "bankrollId");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(String value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(String value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(String value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(String value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(String value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLike(String value) {
            addCriterion("stock_id like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotLike(String value) {
            addCriterion("stock_id not like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<String> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<String> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(String value1, String value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(String value1, String value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andCommStatusIsNull() {
            addCriterion("comm_status is null");
            return (Criteria) this;
        }

        public Criteria andCommStatusIsNotNull() {
            addCriterion("comm_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommStatusEqualTo(String value) {
            addCriterion("comm_status =", value, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusNotEqualTo(String value) {
            addCriterion("comm_status <>", value, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusGreaterThan(String value) {
            addCriterion("comm_status >", value, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusGreaterThanOrEqualTo(String value) {
            addCriterion("comm_status >=", value, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusLessThan(String value) {
            addCriterion("comm_status <", value, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusLessThanOrEqualTo(String value) {
            addCriterion("comm_status <=", value, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusLike(String value) {
            addCriterion("comm_status like", value, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusNotLike(String value) {
            addCriterion("comm_status not like", value, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusIn(List<String> values) {
            addCriterion("comm_status in", values, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusNotIn(List<String> values) {
            addCriterion("comm_status not in", values, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusBetween(String value1, String value2) {
            addCriterion("comm_status between", value1, value2, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommStatusNotBetween(String value1, String value2) {
            addCriterion("comm_status not between", value1, value2, "commStatus");
            return (Criteria) this;
        }

        public Criteria andCommquantityIsNull() {
            addCriterion("commQuantity is null");
            return (Criteria) this;
        }

        public Criteria andCommquantityIsNotNull() {
            addCriterion("commQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andCommquantityEqualTo(Integer value) {
            addCriterion("commQuantity =", value, "commquantity");
            return (Criteria) this;
        }

        public Criteria andCommquantityNotEqualTo(Integer value) {
            addCriterion("commQuantity <>", value, "commquantity");
            return (Criteria) this;
        }

        public Criteria andCommquantityGreaterThan(Integer value) {
            addCriterion("commQuantity >", value, "commquantity");
            return (Criteria) this;
        }

        public Criteria andCommquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("commQuantity >=", value, "commquantity");
            return (Criteria) this;
        }

        public Criteria andCommquantityLessThan(Integer value) {
            addCriterion("commQuantity <", value, "commquantity");
            return (Criteria) this;
        }

        public Criteria andCommquantityLessThanOrEqualTo(Integer value) {
            addCriterion("commQuantity <=", value, "commquantity");
            return (Criteria) this;
        }

        public Criteria andCommquantityIn(List<Integer> values) {
            addCriterion("commQuantity in", values, "commquantity");
            return (Criteria) this;
        }

        public Criteria andCommquantityNotIn(List<Integer> values) {
            addCriterion("commQuantity not in", values, "commquantity");
            return (Criteria) this;
        }

        public Criteria andCommquantityBetween(Integer value1, Integer value2) {
            addCriterion("commQuantity between", value1, value2, "commquantity");
            return (Criteria) this;
        }

        public Criteria andCommquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("commQuantity not between", value1, value2, "commquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityIsNull() {
            addCriterion("accomplishQuantity is null");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityIsNotNull() {
            addCriterion("accomplishQuantity is not null");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityEqualTo(Integer value) {
            addCriterion("accomplishQuantity =", value, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityNotEqualTo(Integer value) {
            addCriterion("accomplishQuantity <>", value, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityGreaterThan(Integer value) {
            addCriterion("accomplishQuantity >", value, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("accomplishQuantity >=", value, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityLessThan(Integer value) {
            addCriterion("accomplishQuantity <", value, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityLessThanOrEqualTo(Integer value) {
            addCriterion("accomplishQuantity <=", value, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityIn(List<Integer> values) {
            addCriterion("accomplishQuantity in", values, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityNotIn(List<Integer> values) {
            addCriterion("accomplishQuantity not in", values, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityBetween(Integer value1, Integer value2) {
            addCriterion("accomplishQuantity between", value1, value2, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andAccomplishquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("accomplishQuantity not between", value1, value2, "accomplishquantity");
            return (Criteria) this;
        }

        public Criteria andCommpriceIsNull() {
            addCriterion("commPrice is null");
            return (Criteria) this;
        }

        public Criteria andCommpriceIsNotNull() {
            addCriterion("commPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCommpriceEqualTo(BigDecimal value) {
            addCriterion("commPrice =", value, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommpriceNotEqualTo(BigDecimal value) {
            addCriterion("commPrice <>", value, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommpriceGreaterThan(BigDecimal value) {
            addCriterion("commPrice >", value, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commPrice >=", value, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommpriceLessThan(BigDecimal value) {
            addCriterion("commPrice <", value, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commPrice <=", value, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommpriceIn(List<BigDecimal> values) {
            addCriterion("commPrice in", values, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommpriceNotIn(List<BigDecimal> values) {
            addCriterion("commPrice not in", values, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commPrice between", value1, value2, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commPrice not between", value1, value2, "commprice");
            return (Criteria) this;
        }

        public Criteria andCommdateIsNull() {
            addCriterion("commDate is null");
            return (Criteria) this;
        }

        public Criteria andCommdateIsNotNull() {
            addCriterion("commDate is not null");
            return (Criteria) this;
        }

        public Criteria andCommdateEqualTo(Date value) {
            addCriterion("commDate =", value, "commdate");
            return (Criteria) this;
        }

        public Criteria andCommdateNotEqualTo(Date value) {
            addCriterion("commDate <>", value, "commdate");
            return (Criteria) this;
        }

        public Criteria andCommdateGreaterThan(Date value) {
            addCriterion("commDate >", value, "commdate");
            return (Criteria) this;
        }

        public Criteria andCommdateGreaterThanOrEqualTo(Date value) {
            addCriterion("commDate >=", value, "commdate");
            return (Criteria) this;
        }

        public Criteria andCommdateLessThan(Date value) {
            addCriterion("commDate <", value, "commdate");
            return (Criteria) this;
        }

        public Criteria andCommdateLessThanOrEqualTo(Date value) {
            addCriterion("commDate <=", value, "commdate");
            return (Criteria) this;
        }

        public Criteria andCommdateIn(List<Date> values) {
            addCriterion("commDate in", values, "commdate");
            return (Criteria) this;
        }

        public Criteria andCommdateNotIn(List<Date> values) {
            addCriterion("commDate not in", values, "commdate");
            return (Criteria) this;
        }

        public Criteria andCommdateBetween(Date value1, Date value2) {
            addCriterion("commDate between", value1, value2, "commdate");
            return (Criteria) this;
        }

        public Criteria andCommdateNotBetween(Date value1, Date value2) {
            addCriterion("commDate not between", value1, value2, "commdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateIsNull() {
            addCriterion("accomplishDate is null");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateIsNotNull() {
            addCriterion("accomplishDate is not null");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateEqualTo(Date value) {
            addCriterion("accomplishDate =", value, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateNotEqualTo(Date value) {
            addCriterion("accomplishDate <>", value, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateGreaterThan(Date value) {
            addCriterion("accomplishDate >", value, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateGreaterThanOrEqualTo(Date value) {
            addCriterion("accomplishDate >=", value, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateLessThan(Date value) {
            addCriterion("accomplishDate <", value, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateLessThanOrEqualTo(Date value) {
            addCriterion("accomplishDate <=", value, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateIn(List<Date> values) {
            addCriterion("accomplishDate in", values, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateNotIn(List<Date> values) {
            addCriterion("accomplishDate not in", values, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateBetween(Date value1, Date value2) {
            addCriterion("accomplishDate between", value1, value2, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andAccomplishdateNotBetween(Date value1, Date value2) {
            addCriterion("accomplishDate not between", value1, value2, "accomplishdate");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}