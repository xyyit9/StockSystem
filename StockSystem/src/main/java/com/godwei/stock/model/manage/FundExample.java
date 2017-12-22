package com.godwei.stock.model.manage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundExample() {
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

        public Criteria andUsableIsNull() {
            addCriterion("usable is null");
            return (Criteria) this;
        }

        public Criteria andUsableIsNotNull() {
            addCriterion("usable is not null");
            return (Criteria) this;
        }

        public Criteria andUsableEqualTo(BigDecimal value) {
            addCriterion("usable =", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotEqualTo(BigDecimal value) {
            addCriterion("usable <>", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableGreaterThan(BigDecimal value) {
            addCriterion("usable >", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("usable >=", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableLessThan(BigDecimal value) {
            addCriterion("usable <", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("usable <=", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableIn(List<BigDecimal> values) {
            addCriterion("usable in", values, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotIn(List<BigDecimal> values) {
            addCriterion("usable not in", values, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usable between", value1, value2, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("usable not between", value1, value2, "usable");
            return (Criteria) this;
        }

        public Criteria andFreezedIsNull() {
            addCriterion("freezed is null");
            return (Criteria) this;
        }

        public Criteria andFreezedIsNotNull() {
            addCriterion("freezed is not null");
            return (Criteria) this;
        }

        public Criteria andFreezedEqualTo(BigDecimal value) {
            addCriterion("freezed =", value, "freezed");
            return (Criteria) this;
        }

        public Criteria andFreezedNotEqualTo(BigDecimal value) {
            addCriterion("freezed <>", value, "freezed");
            return (Criteria) this;
        }

        public Criteria andFreezedGreaterThan(BigDecimal value) {
            addCriterion("freezed >", value, "freezed");
            return (Criteria) this;
        }

        public Criteria andFreezedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("freezed >=", value, "freezed");
            return (Criteria) this;
        }

        public Criteria andFreezedLessThan(BigDecimal value) {
            addCriterion("freezed <", value, "freezed");
            return (Criteria) this;
        }

        public Criteria andFreezedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("freezed <=", value, "freezed");
            return (Criteria) this;
        }

        public Criteria andFreezedIn(List<BigDecimal> values) {
            addCriterion("freezed in", values, "freezed");
            return (Criteria) this;
        }

        public Criteria andFreezedNotIn(List<BigDecimal> values) {
            addCriterion("freezed not in", values, "freezed");
            return (Criteria) this;
        }

        public Criteria andFreezedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezed between", value1, value2, "freezed");
            return (Criteria) this;
        }

        public Criteria andFreezedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("freezed not between", value1, value2, "freezed");
            return (Criteria) this;
        }

        public Criteria andIncashIsNull() {
            addCriterion("incash is null");
            return (Criteria) this;
        }

        public Criteria andIncashIsNotNull() {
            addCriterion("incash is not null");
            return (Criteria) this;
        }

        public Criteria andIncashEqualTo(BigDecimal value) {
            addCriterion("incash =", value, "incash");
            return (Criteria) this;
        }

        public Criteria andIncashNotEqualTo(BigDecimal value) {
            addCriterion("incash <>", value, "incash");
            return (Criteria) this;
        }

        public Criteria andIncashGreaterThan(BigDecimal value) {
            addCriterion("incash >", value, "incash");
            return (Criteria) this;
        }

        public Criteria andIncashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("incash >=", value, "incash");
            return (Criteria) this;
        }

        public Criteria andIncashLessThan(BigDecimal value) {
            addCriterion("incash <", value, "incash");
            return (Criteria) this;
        }

        public Criteria andIncashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("incash <=", value, "incash");
            return (Criteria) this;
        }

        public Criteria andIncashIn(List<BigDecimal> values) {
            addCriterion("incash in", values, "incash");
            return (Criteria) this;
        }

        public Criteria andIncashNotIn(List<BigDecimal> values) {
            addCriterion("incash not in", values, "incash");
            return (Criteria) this;
        }

        public Criteria andIncashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incash between", value1, value2, "incash");
            return (Criteria) this;
        }

        public Criteria andIncashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incash not between", value1, value2, "incash");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTocalstockIsNull() {
            addCriterion("tocalStock is null");
            return (Criteria) this;
        }

        public Criteria andTocalstockIsNotNull() {
            addCriterion("tocalStock is not null");
            return (Criteria) this;
        }

        public Criteria andTocalstockEqualTo(BigDecimal value) {
            addCriterion("tocalStock =", value, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTocalstockNotEqualTo(BigDecimal value) {
            addCriterion("tocalStock <>", value, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTocalstockGreaterThan(BigDecimal value) {
            addCriterion("tocalStock >", value, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTocalstockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tocalStock >=", value, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTocalstockLessThan(BigDecimal value) {
            addCriterion("tocalStock <", value, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTocalstockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tocalStock <=", value, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTocalstockIn(List<BigDecimal> values) {
            addCriterion("tocalStock in", values, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTocalstockNotIn(List<BigDecimal> values) {
            addCriterion("tocalStock not in", values, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTocalstockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tocalStock between", value1, value2, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTocalstockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tocalStock not between", value1, value2, "tocalstock");
            return (Criteria) this;
        }

        public Criteria andTransactionpwIsNull() {
            addCriterion("transactionPw is null");
            return (Criteria) this;
        }

        public Criteria andTransactionpwIsNotNull() {
            addCriterion("transactionPw is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionpwEqualTo(String value) {
            addCriterion("transactionPw =", value, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwNotEqualTo(String value) {
            addCriterion("transactionPw <>", value, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwGreaterThan(String value) {
            addCriterion("transactionPw >", value, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwGreaterThanOrEqualTo(String value) {
            addCriterion("transactionPw >=", value, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwLessThan(String value) {
            addCriterion("transactionPw <", value, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwLessThanOrEqualTo(String value) {
            addCriterion("transactionPw <=", value, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwLike(String value) {
            addCriterion("transactionPw like", value, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwNotLike(String value) {
            addCriterion("transactionPw not like", value, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwIn(List<String> values) {
            addCriterion("transactionPw in", values, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwNotIn(List<String> values) {
            addCriterion("transactionPw not in", values, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwBetween(String value1, String value2) {
            addCriterion("transactionPw between", value1, value2, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andTransactionpwNotBetween(String value1, String value2) {
            addCriterion("transactionPw not between", value1, value2, "transactionpw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwIsNull() {
            addCriterion("withdrawalsPw is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwIsNotNull() {
            addCriterion("withdrawalsPw is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwEqualTo(String value) {
            addCriterion("withdrawalsPw =", value, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwNotEqualTo(String value) {
            addCriterion("withdrawalsPw <>", value, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwGreaterThan(String value) {
            addCriterion("withdrawalsPw >", value, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwGreaterThanOrEqualTo(String value) {
            addCriterion("withdrawalsPw >=", value, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwLessThan(String value) {
            addCriterion("withdrawalsPw <", value, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwLessThanOrEqualTo(String value) {
            addCriterion("withdrawalsPw <=", value, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwLike(String value) {
            addCriterion("withdrawalsPw like", value, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwNotLike(String value) {
            addCriterion("withdrawalsPw not like", value, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwIn(List<String> values) {
            addCriterion("withdrawalsPw in", values, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwNotIn(List<String> values) {
            addCriterion("withdrawalsPw not in", values, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwBetween(String value1, String value2) {
            addCriterion("withdrawalsPw between", value1, value2, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andWithdrawalspwNotBetween(String value1, String value2) {
            addCriterion("withdrawalsPw not between", value1, value2, "withdrawalspw");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
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