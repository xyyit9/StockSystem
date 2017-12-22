package com.godwei.stock.model.manage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("u_password =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("u_password >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("u_password <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("u_password like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("u_password not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("u_password in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNull() {
            addCriterion("u_gender is null");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNotNull() {
            addCriterion("u_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUGenderEqualTo(String value) {
            addCriterion("u_gender =", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotEqualTo(String value) {
            addCriterion("u_gender <>", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThan(String value) {
            addCriterion("u_gender >", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThanOrEqualTo(String value) {
            addCriterion("u_gender >=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThan(String value) {
            addCriterion("u_gender <", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThanOrEqualTo(String value) {
            addCriterion("u_gender <=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLike(String value) {
            addCriterion("u_gender like", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotLike(String value) {
            addCriterion("u_gender not like", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderIn(List<String> values) {
            addCriterion("u_gender in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotIn(List<String> values) {
            addCriterion("u_gender not in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderBetween(String value1, String value2) {
            addCriterion("u_gender between", value1, value2, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotBetween(String value1, String value2) {
            addCriterion("u_gender not between", value1, value2, "uGender");
            return (Criteria) this;
        }

        public Criteria andUIdcardIsNull() {
            addCriterion("u_idcard is null");
            return (Criteria) this;
        }

        public Criteria andUIdcardIsNotNull() {
            addCriterion("u_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUIdcardEqualTo(String value) {
            addCriterion("u_idcard =", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotEqualTo(String value) {
            addCriterion("u_idcard <>", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardGreaterThan(String value) {
            addCriterion("u_idcard >", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("u_idcard >=", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLessThan(String value) {
            addCriterion("u_idcard <", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLessThanOrEqualTo(String value) {
            addCriterion("u_idcard <=", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardLike(String value) {
            addCriterion("u_idcard like", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotLike(String value) {
            addCriterion("u_idcard not like", value, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardIn(List<String> values) {
            addCriterion("u_idcard in", values, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotIn(List<String> values) {
            addCriterion("u_idcard not in", values, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardBetween(String value1, String value2) {
            addCriterion("u_idcard between", value1, value2, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUIdcardNotBetween(String value1, String value2) {
            addCriterion("u_idcard not between", value1, value2, "uIdcard");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNull() {
            addCriterion("u_address is null");
            return (Criteria) this;
        }

        public Criteria andUAddressIsNotNull() {
            addCriterion("u_address is not null");
            return (Criteria) this;
        }

        public Criteria andUAddressEqualTo(String value) {
            addCriterion("u_address =", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotEqualTo(String value) {
            addCriterion("u_address <>", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThan(String value) {
            addCriterion("u_address >", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressGreaterThanOrEqualTo(String value) {
            addCriterion("u_address >=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThan(String value) {
            addCriterion("u_address <", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLessThanOrEqualTo(String value) {
            addCriterion("u_address <=", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressLike(String value) {
            addCriterion("u_address like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotLike(String value) {
            addCriterion("u_address not like", value, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressIn(List<String> values) {
            addCriterion("u_address in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotIn(List<String> values) {
            addCriterion("u_address not in", values, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressBetween(String value1, String value2) {
            addCriterion("u_address between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUAddressNotBetween(String value1, String value2) {
            addCriterion("u_address not between", value1, value2, "uAddress");
            return (Criteria) this;
        }

        public Criteria andUJobIsNull() {
            addCriterion("u_job is null");
            return (Criteria) this;
        }

        public Criteria andUJobIsNotNull() {
            addCriterion("u_job is not null");
            return (Criteria) this;
        }

        public Criteria andUJobEqualTo(String value) {
            addCriterion("u_job =", value, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobNotEqualTo(String value) {
            addCriterion("u_job <>", value, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobGreaterThan(String value) {
            addCriterion("u_job >", value, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobGreaterThanOrEqualTo(String value) {
            addCriterion("u_job >=", value, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobLessThan(String value) {
            addCriterion("u_job <", value, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobLessThanOrEqualTo(String value) {
            addCriterion("u_job <=", value, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobLike(String value) {
            addCriterion("u_job like", value, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobNotLike(String value) {
            addCriterion("u_job not like", value, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobIn(List<String> values) {
            addCriterion("u_job in", values, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobNotIn(List<String> values) {
            addCriterion("u_job not in", values, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobBetween(String value1, String value2) {
            addCriterion("u_job between", value1, value2, "uJob");
            return (Criteria) this;
        }

        public Criteria andUJobNotBetween(String value1, String value2) {
            addCriterion("u_job not between", value1, value2, "uJob");
            return (Criteria) this;
        }

        public Criteria andUEducationIsNull() {
            addCriterion("u_education is null");
            return (Criteria) this;
        }

        public Criteria andUEducationIsNotNull() {
            addCriterion("u_education is not null");
            return (Criteria) this;
        }

        public Criteria andUEducationEqualTo(String value) {
            addCriterion("u_education =", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationNotEqualTo(String value) {
            addCriterion("u_education <>", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationGreaterThan(String value) {
            addCriterion("u_education >", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationGreaterThanOrEqualTo(String value) {
            addCriterion("u_education >=", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationLessThan(String value) {
            addCriterion("u_education <", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationLessThanOrEqualTo(String value) {
            addCriterion("u_education <=", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationLike(String value) {
            addCriterion("u_education like", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationNotLike(String value) {
            addCriterion("u_education not like", value, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationIn(List<String> values) {
            addCriterion("u_education in", values, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationNotIn(List<String> values) {
            addCriterion("u_education not in", values, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationBetween(String value1, String value2) {
            addCriterion("u_education between", value1, value2, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEducationNotBetween(String value1, String value2) {
            addCriterion("u_education not between", value1, value2, "uEducation");
            return (Criteria) this;
        }

        public Criteria andUEmployerIsNull() {
            addCriterion("u_employer is null");
            return (Criteria) this;
        }

        public Criteria andUEmployerIsNotNull() {
            addCriterion("u_employer is not null");
            return (Criteria) this;
        }

        public Criteria andUEmployerEqualTo(String value) {
            addCriterion("u_employer =", value, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerNotEqualTo(String value) {
            addCriterion("u_employer <>", value, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerGreaterThan(String value) {
            addCriterion("u_employer >", value, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerGreaterThanOrEqualTo(String value) {
            addCriterion("u_employer >=", value, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerLessThan(String value) {
            addCriterion("u_employer <", value, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerLessThanOrEqualTo(String value) {
            addCriterion("u_employer <=", value, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerLike(String value) {
            addCriterion("u_employer like", value, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerNotLike(String value) {
            addCriterion("u_employer not like", value, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerIn(List<String> values) {
            addCriterion("u_employer in", values, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerNotIn(List<String> values) {
            addCriterion("u_employer not in", values, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerBetween(String value1, String value2) {
            addCriterion("u_employer between", value1, value2, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUEmployerNotBetween(String value1, String value2) {
            addCriterion("u_employer not between", value1, value2, "uEmployer");
            return (Criteria) this;
        }

        public Criteria andUTelephoneIsNull() {
            addCriterion("u_telephone is null");
            return (Criteria) this;
        }

        public Criteria andUTelephoneIsNotNull() {
            addCriterion("u_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andUTelephoneEqualTo(String value) {
            addCriterion("u_telephone =", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotEqualTo(String value) {
            addCriterion("u_telephone <>", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneGreaterThan(String value) {
            addCriterion("u_telephone >", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_telephone >=", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneLessThan(String value) {
            addCriterion("u_telephone <", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneLessThanOrEqualTo(String value) {
            addCriterion("u_telephone <=", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneLike(String value) {
            addCriterion("u_telephone like", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotLike(String value) {
            addCriterion("u_telephone not like", value, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneIn(List<String> values) {
            addCriterion("u_telephone in", values, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotIn(List<String> values) {
            addCriterion("u_telephone not in", values, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneBetween(String value1, String value2) {
            addCriterion("u_telephone between", value1, value2, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andUTelephoneNotBetween(String value1, String value2) {
            addCriterion("u_telephone not between", value1, value2, "uTelephone");
            return (Criteria) this;
        }

        public Criteria andURecorddateIsNull() {
            addCriterion("u_recordDate is null");
            return (Criteria) this;
        }

        public Criteria andURecorddateIsNotNull() {
            addCriterion("u_recordDate is not null");
            return (Criteria) this;
        }

        public Criteria andURecorddateEqualTo(Date value) {
            addCriterionForJDBCDate("u_recordDate =", value, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andURecorddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_recordDate <>", value, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andURecorddateGreaterThan(Date value) {
            addCriterionForJDBCDate("u_recordDate >", value, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andURecorddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_recordDate >=", value, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andURecorddateLessThan(Date value) {
            addCriterionForJDBCDate("u_recordDate <", value, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andURecorddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_recordDate <=", value, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andURecorddateIn(List<Date> values) {
            addCriterionForJDBCDate("u_recordDate in", values, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andURecorddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_recordDate not in", values, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andURecorddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_recordDate between", value1, value2, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andURecorddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_recordDate not between", value1, value2, "uRecorddate");
            return (Criteria) this;
        }

        public Criteria andUTypeIsNull() {
            addCriterion("u_type is null");
            return (Criteria) this;
        }

        public Criteria andUTypeIsNotNull() {
            addCriterion("u_type is not null");
            return (Criteria) this;
        }

        public Criteria andUTypeEqualTo(String value) {
            addCriterion("u_type =", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotEqualTo(String value) {
            addCriterion("u_type <>", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeGreaterThan(String value) {
            addCriterion("u_type >", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeGreaterThanOrEqualTo(String value) {
            addCriterion("u_type >=", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeLessThan(String value) {
            addCriterion("u_type <", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeLessThanOrEqualTo(String value) {
            addCriterion("u_type <=", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeLike(String value) {
            addCriterion("u_type like", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotLike(String value) {
            addCriterion("u_type not like", value, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeIn(List<String> values) {
            addCriterion("u_type in", values, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotIn(List<String> values) {
            addCriterion("u_type not in", values, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeBetween(String value1, String value2) {
            addCriterion("u_type between", value1, value2, "uType");
            return (Criteria) this;
        }

        public Criteria andUTypeNotBetween(String value1, String value2) {
            addCriterion("u_type not between", value1, value2, "uType");
            return (Criteria) this;
        }

        public Criteria andUElseidcardIsNull() {
            addCriterion("u_elseIdcard is null");
            return (Criteria) this;
        }

        public Criteria andUElseidcardIsNotNull() {
            addCriterion("u_elseIdcard is not null");
            return (Criteria) this;
        }

        public Criteria andUElseidcardEqualTo(String value) {
            addCriterion("u_elseIdcard =", value, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardNotEqualTo(String value) {
            addCriterion("u_elseIdcard <>", value, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardGreaterThan(String value) {
            addCriterion("u_elseIdcard >", value, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardGreaterThanOrEqualTo(String value) {
            addCriterion("u_elseIdcard >=", value, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardLessThan(String value) {
            addCriterion("u_elseIdcard <", value, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardLessThanOrEqualTo(String value) {
            addCriterion("u_elseIdcard <=", value, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardLike(String value) {
            addCriterion("u_elseIdcard like", value, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardNotLike(String value) {
            addCriterion("u_elseIdcard not like", value, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardIn(List<String> values) {
            addCriterion("u_elseIdcard in", values, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardNotIn(List<String> values) {
            addCriterion("u_elseIdcard not in", values, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardBetween(String value1, String value2) {
            addCriterion("u_elseIdcard between", value1, value2, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUElseidcardNotBetween(String value1, String value2) {
            addCriterion("u_elseIdcard not between", value1, value2, "uElseidcard");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNull() {
            addCriterion("u_status is null");
            return (Criteria) this;
        }

        public Criteria andUStatusIsNotNull() {
            addCriterion("u_status is not null");
            return (Criteria) this;
        }

        public Criteria andUStatusEqualTo(Integer value) {
            addCriterion("u_status =", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotEqualTo(Integer value) {
            addCriterion("u_status <>", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThan(Integer value) {
            addCriterion("u_status >", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_status >=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThan(Integer value) {
            addCriterion("u_status <", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusLessThanOrEqualTo(Integer value) {
            addCriterion("u_status <=", value, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusIn(List<Integer> values) {
            addCriterion("u_status in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotIn(List<Integer> values) {
            addCriterion("u_status not in", values, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusBetween(Integer value1, Integer value2) {
            addCriterion("u_status between", value1, value2, "uStatus");
            return (Criteria) this;
        }

        public Criteria andUStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("u_status not between", value1, value2, "uStatus");
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