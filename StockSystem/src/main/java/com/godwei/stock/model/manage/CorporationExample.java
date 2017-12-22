package com.godwei.stock.model.manage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CorporationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CorporationExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberIsNull() {
            addCriterion("c_registerNumber is null");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberIsNotNull() {
            addCriterion("c_registerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberEqualTo(String value) {
            addCriterion("c_registerNumber =", value, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberNotEqualTo(String value) {
            addCriterion("c_registerNumber <>", value, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberGreaterThan(String value) {
            addCriterion("c_registerNumber >", value, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberGreaterThanOrEqualTo(String value) {
            addCriterion("c_registerNumber >=", value, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberLessThan(String value) {
            addCriterion("c_registerNumber <", value, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberLessThanOrEqualTo(String value) {
            addCriterion("c_registerNumber <=", value, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberLike(String value) {
            addCriterion("c_registerNumber like", value, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberNotLike(String value) {
            addCriterion("c_registerNumber not like", value, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberIn(List<String> values) {
            addCriterion("c_registerNumber in", values, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberNotIn(List<String> values) {
            addCriterion("c_registerNumber not in", values, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberBetween(String value1, String value2) {
            addCriterion("c_registerNumber between", value1, value2, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCRegisternumberNotBetween(String value1, String value2) {
            addCriterion("c_registerNumber not between", value1, value2, "cRegisternumber");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNull() {
            addCriterion("c_password is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("c_password is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("c_password =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("c_password <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("c_password >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("c_password >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("c_password <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("c_password <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("c_password like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("c_password not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("c_password in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("c_password not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("c_password between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("c_password not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCLicenseIsNull() {
            addCriterion("c_license is null");
            return (Criteria) this;
        }

        public Criteria andCLicenseIsNotNull() {
            addCriterion("c_license is not null");
            return (Criteria) this;
        }

        public Criteria andCLicenseEqualTo(String value) {
            addCriterion("c_license =", value, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseNotEqualTo(String value) {
            addCriterion("c_license <>", value, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseGreaterThan(String value) {
            addCriterion("c_license >", value, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("c_license >=", value, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseLessThan(String value) {
            addCriterion("c_license <", value, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseLessThanOrEqualTo(String value) {
            addCriterion("c_license <=", value, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseLike(String value) {
            addCriterion("c_license like", value, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseNotLike(String value) {
            addCriterion("c_license not like", value, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseIn(List<String> values) {
            addCriterion("c_license in", values, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseNotIn(List<String> values) {
            addCriterion("c_license not in", values, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseBetween(String value1, String value2) {
            addCriterion("c_license between", value1, value2, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCLicenseNotBetween(String value1, String value2) {
            addCriterion("c_license not between", value1, value2, "cLicense");
            return (Criteria) this;
        }

        public Criteria andCIdcardIsNull() {
            addCriterion("c_idcard is null");
            return (Criteria) this;
        }

        public Criteria andCIdcardIsNotNull() {
            addCriterion("c_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andCIdcardEqualTo(String value) {
            addCriterion("c_idcard =", value, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardNotEqualTo(String value) {
            addCriterion("c_idcard <>", value, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardGreaterThan(String value) {
            addCriterion("c_idcard >", value, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("c_idcard >=", value, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardLessThan(String value) {
            addCriterion("c_idcard <", value, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardLessThanOrEqualTo(String value) {
            addCriterion("c_idcard <=", value, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardLike(String value) {
            addCriterion("c_idcard like", value, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardNotLike(String value) {
            addCriterion("c_idcard not like", value, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardIn(List<String> values) {
            addCriterion("c_idcard in", values, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardNotIn(List<String> values) {
            addCriterion("c_idcard not in", values, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardBetween(String value1, String value2) {
            addCriterion("c_idcard between", value1, value2, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCIdcardNotBetween(String value1, String value2) {
            addCriterion("c_idcard not between", value1, value2, "cIdcard");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIsNull() {
            addCriterion("c_telephone is null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIsNotNull() {
            addCriterion("c_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneEqualTo(String value) {
            addCriterion("c_telephone =", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotEqualTo(String value) {
            addCriterion("c_telephone <>", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneGreaterThan(String value) {
            addCriterion("c_telephone >", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("c_telephone >=", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLessThan(String value) {
            addCriterion("c_telephone <", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLessThanOrEqualTo(String value) {
            addCriterion("c_telephone <=", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLike(String value) {
            addCriterion("c_telephone like", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotLike(String value) {
            addCriterion("c_telephone not like", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIn(List<String> values) {
            addCriterion("c_telephone in", values, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotIn(List<String> values) {
            addCriterion("c_telephone not in", values, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneBetween(String value1, String value2) {
            addCriterion("c_telephone between", value1, value2, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotBetween(String value1, String value2) {
            addCriterion("c_telephone not between", value1, value2, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCRecorddateIsNull() {
            addCriterion("c_recordDate is null");
            return (Criteria) this;
        }

        public Criteria andCRecorddateIsNotNull() {
            addCriterion("c_recordDate is not null");
            return (Criteria) this;
        }

        public Criteria andCRecorddateEqualTo(Date value) {
            addCriterion("c_recordDate =", value, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCRecorddateNotEqualTo(Date value) {
            addCriterion("c_recordDate <>", value, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCRecorddateGreaterThan(Date value) {
            addCriterion("c_recordDate >", value, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCRecorddateGreaterThanOrEqualTo(Date value) {
            addCriterion("c_recordDate >=", value, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCRecorddateLessThan(Date value) {
            addCriterion("c_recordDate <", value, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCRecorddateLessThanOrEqualTo(Date value) {
            addCriterion("c_recordDate <=", value, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCRecorddateIn(List<Date> values) {
            addCriterion("c_recordDate in", values, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCRecorddateNotIn(List<Date> values) {
            addCriterion("c_recordDate not in", values, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCRecorddateBetween(Date value1, Date value2) {
            addCriterion("c_recordDate between", value1, value2, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCRecorddateNotBetween(Date value1, Date value2) {
            addCriterion("c_recordDate not between", value1, value2, "cRecorddate");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNull() {
            addCriterion("c_address is null");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNotNull() {
            addCriterion("c_address is not null");
            return (Criteria) this;
        }

        public Criteria andCAddressEqualTo(String value) {
            addCriterion("c_address =", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotEqualTo(String value) {
            addCriterion("c_address <>", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThan(String value) {
            addCriterion("c_address >", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThanOrEqualTo(String value) {
            addCriterion("c_address >=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThan(String value) {
            addCriterion("c_address <", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThanOrEqualTo(String value) {
            addCriterion("c_address <=", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLike(String value) {
            addCriterion("c_address like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotLike(String value) {
            addCriterion("c_address not like", value, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressIn(List<String> values) {
            addCriterion("c_address in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotIn(List<String> values) {
            addCriterion("c_address not in", values, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressBetween(String value1, String value2) {
            addCriterion("c_address between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotBetween(String value1, String value2) {
            addCriterion("c_address not between", value1, value2, "cAddress");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andAIdcardIsNull() {
            addCriterion("a_idcard is null");
            return (Criteria) this;
        }

        public Criteria andAIdcardIsNotNull() {
            addCriterion("a_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andAIdcardEqualTo(String value) {
            addCriterion("a_idcard =", value, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardNotEqualTo(String value) {
            addCriterion("a_idcard <>", value, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardGreaterThan(String value) {
            addCriterion("a_idcard >", value, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("a_idcard >=", value, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardLessThan(String value) {
            addCriterion("a_idcard <", value, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardLessThanOrEqualTo(String value) {
            addCriterion("a_idcard <=", value, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardLike(String value) {
            addCriterion("a_idcard like", value, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardNotLike(String value) {
            addCriterion("a_idcard not like", value, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardIn(List<String> values) {
            addCriterion("a_idcard in", values, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardNotIn(List<String> values) {
            addCriterion("a_idcard not in", values, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardBetween(String value1, String value2) {
            addCriterion("a_idcard between", value1, value2, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andAIdcardNotBetween(String value1, String value2) {
            addCriterion("a_idcard not between", value1, value2, "aIdcard");
            return (Criteria) this;
        }

        public Criteria andATelephoneIsNull() {
            addCriterion("a_telephone is null");
            return (Criteria) this;
        }

        public Criteria andATelephoneIsNotNull() {
            addCriterion("a_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andATelephoneEqualTo(String value) {
            addCriterion("a_telephone =", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotEqualTo(String value) {
            addCriterion("a_telephone <>", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneGreaterThan(String value) {
            addCriterion("a_telephone >", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("a_telephone >=", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneLessThan(String value) {
            addCriterion("a_telephone <", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneLessThanOrEqualTo(String value) {
            addCriterion("a_telephone <=", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneLike(String value) {
            addCriterion("a_telephone like", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotLike(String value) {
            addCriterion("a_telephone not like", value, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneIn(List<String> values) {
            addCriterion("a_telephone in", values, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotIn(List<String> values) {
            addCriterion("a_telephone not in", values, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneBetween(String value1, String value2) {
            addCriterion("a_telephone between", value1, value2, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andATelephoneNotBetween(String value1, String value2) {
            addCriterion("a_telephone not between", value1, value2, "aTelephone");
            return (Criteria) this;
        }

        public Criteria andAAddressIsNull() {
            addCriterion("a_address is null");
            return (Criteria) this;
        }

        public Criteria andAAddressIsNotNull() {
            addCriterion("a_address is not null");
            return (Criteria) this;
        }

        public Criteria andAAddressEqualTo(String value) {
            addCriterion("a_address =", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotEqualTo(String value) {
            addCriterion("a_address <>", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressGreaterThan(String value) {
            addCriterion("a_address >", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressGreaterThanOrEqualTo(String value) {
            addCriterion("a_address >=", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressLessThan(String value) {
            addCriterion("a_address <", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressLessThanOrEqualTo(String value) {
            addCriterion("a_address <=", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressLike(String value) {
            addCriterion("a_address like", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotLike(String value) {
            addCriterion("a_address not like", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressIn(List<String> values) {
            addCriterion("a_address in", values, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotIn(List<String> values) {
            addCriterion("a_address not in", values, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressBetween(String value1, String value2) {
            addCriterion("a_address between", value1, value2, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotBetween(String value1, String value2) {
            addCriterion("a_address not between", value1, value2, "aAddress");
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

        public Criteria andCStatusIsNull() {
            addCriterion("c_status is null");
            return (Criteria) this;
        }

        public Criteria andCStatusIsNotNull() {
            addCriterion("c_status is not null");
            return (Criteria) this;
        }

        public Criteria andCStatusEqualTo(Integer value) {
            addCriterion("c_status =", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotEqualTo(Integer value) {
            addCriterion("c_status <>", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThan(Integer value) {
            addCriterion("c_status >", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_status >=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThan(Integer value) {
            addCriterion("c_status <", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusLessThanOrEqualTo(Integer value) {
            addCriterion("c_status <=", value, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusIn(List<Integer> values) {
            addCriterion("c_status in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotIn(List<Integer> values) {
            addCriterion("c_status not in", values, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusBetween(Integer value1, Integer value2) {
            addCriterion("c_status between", value1, value2, "cStatus");
            return (Criteria) this;
        }

        public Criteria andCStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("c_status not between", value1, value2, "cStatus");
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