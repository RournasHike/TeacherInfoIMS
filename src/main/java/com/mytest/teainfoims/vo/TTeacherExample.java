package com.mytest.teainfoims.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTeacherExample() {
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

        public Criteria andTeachPhonumIsNull() {
            addCriterion("teach_phonum is null");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumIsNotNull() {
            addCriterion("teach_phonum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumEqualTo(String value) {
            addCriterion("teach_phonum =", value, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumNotEqualTo(String value) {
            addCriterion("teach_phonum <>", value, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumGreaterThan(String value) {
            addCriterion("teach_phonum >", value, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumGreaterThanOrEqualTo(String value) {
            addCriterion("teach_phonum >=", value, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumLessThan(String value) {
            addCriterion("teach_phonum <", value, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumLessThanOrEqualTo(String value) {
            addCriterion("teach_phonum <=", value, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumLike(String value) {
            addCriterion("teach_phonum like", value, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumNotLike(String value) {
            addCriterion("teach_phonum not like", value, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumIn(List<String> values) {
            addCriterion("teach_phonum in", values, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumNotIn(List<String> values) {
            addCriterion("teach_phonum not in", values, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumBetween(String value1, String value2) {
            addCriterion("teach_phonum between", value1, value2, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andTeachPhonumNotBetween(String value1, String value2) {
            addCriterion("teach_phonum not between", value1, value2, "teachPhonum");
            return (Criteria) this;
        }

        public Criteria andPaswdIsNull() {
            addCriterion("paswd is null");
            return (Criteria) this;
        }

        public Criteria andPaswdIsNotNull() {
            addCriterion("paswd is not null");
            return (Criteria) this;
        }

        public Criteria andPaswdEqualTo(String value) {
            addCriterion("paswd =", value, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdNotEqualTo(String value) {
            addCriterion("paswd <>", value, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdGreaterThan(String value) {
            addCriterion("paswd >", value, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdGreaterThanOrEqualTo(String value) {
            addCriterion("paswd >=", value, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdLessThan(String value) {
            addCriterion("paswd <", value, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdLessThanOrEqualTo(String value) {
            addCriterion("paswd <=", value, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdLike(String value) {
            addCriterion("paswd like", value, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdNotLike(String value) {
            addCriterion("paswd not like", value, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdIn(List<String> values) {
            addCriterion("paswd in", values, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdNotIn(List<String> values) {
            addCriterion("paswd not in", values, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdBetween(String value1, String value2) {
            addCriterion("paswd between", value1, value2, "paswd");
            return (Criteria) this;
        }

        public Criteria andPaswdNotBetween(String value1, String value2) {
            addCriterion("paswd not between", value1, value2, "paswd");
            return (Criteria) this;
        }

        public Criteria andTeachNameIsNull() {
            addCriterion("teach_name is null");
            return (Criteria) this;
        }

        public Criteria andTeachNameIsNotNull() {
            addCriterion("teach_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeachNameEqualTo(String value) {
            addCriterion("teach_name =", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameNotEqualTo(String value) {
            addCriterion("teach_name <>", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameGreaterThan(String value) {
            addCriterion("teach_name >", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameGreaterThanOrEqualTo(String value) {
            addCriterion("teach_name >=", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameLessThan(String value) {
            addCriterion("teach_name <", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameLessThanOrEqualTo(String value) {
            addCriterion("teach_name <=", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameLike(String value) {
            addCriterion("teach_name like", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameNotLike(String value) {
            addCriterion("teach_name not like", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameIn(List<String> values) {
            addCriterion("teach_name in", values, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameNotIn(List<String> values) {
            addCriterion("teach_name not in", values, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameBetween(String value1, String value2) {
            addCriterion("teach_name between", value1, value2, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameNotBetween(String value1, String value2) {
            addCriterion("teach_name not between", value1, value2, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachBirthIsNull() {
            addCriterion("teach_birth is null");
            return (Criteria) this;
        }

        public Criteria andTeachBirthIsNotNull() {
            addCriterion("teach_birth is not null");
            return (Criteria) this;
        }

        public Criteria andTeachBirthEqualTo(Date value) {
            addCriterionForJDBCDate("teach_birth =", value, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("teach_birth <>", value, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("teach_birth >", value, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("teach_birth >=", value, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachBirthLessThan(Date value) {
            addCriterionForJDBCDate("teach_birth <", value, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("teach_birth <=", value, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachBirthIn(List<Date> values) {
            addCriterionForJDBCDate("teach_birth in", values, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("teach_birth not in", values, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("teach_birth between", value1, value2, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("teach_birth not between", value1, value2, "teachBirth");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolIsNull() {
            addCriterion("teach_school is null");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolIsNotNull() {
            addCriterion("teach_school is not null");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolEqualTo(String value) {
            addCriterion("teach_school =", value, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolNotEqualTo(String value) {
            addCriterion("teach_school <>", value, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolGreaterThan(String value) {
            addCriterion("teach_school >", value, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("teach_school >=", value, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolLessThan(String value) {
            addCriterion("teach_school <", value, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolLessThanOrEqualTo(String value) {
            addCriterion("teach_school <=", value, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolLike(String value) {
            addCriterion("teach_school like", value, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolNotLike(String value) {
            addCriterion("teach_school not like", value, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolIn(List<String> values) {
            addCriterion("teach_school in", values, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolNotIn(List<String> values) {
            addCriterion("teach_school not in", values, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolBetween(String value1, String value2) {
            addCriterion("teach_school between", value1, value2, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachSchoolNotBetween(String value1, String value2) {
            addCriterion("teach_school not between", value1, value2, "teachSchool");
            return (Criteria) this;
        }

        public Criteria andTeachMajorIsNull() {
            addCriterion("teach_major is null");
            return (Criteria) this;
        }

        public Criteria andTeachMajorIsNotNull() {
            addCriterion("teach_major is not null");
            return (Criteria) this;
        }

        public Criteria andTeachMajorEqualTo(String value) {
            addCriterion("teach_major =", value, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorNotEqualTo(String value) {
            addCriterion("teach_major <>", value, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorGreaterThan(String value) {
            addCriterion("teach_major >", value, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorGreaterThanOrEqualTo(String value) {
            addCriterion("teach_major >=", value, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorLessThan(String value) {
            addCriterion("teach_major <", value, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorLessThanOrEqualTo(String value) {
            addCriterion("teach_major <=", value, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorLike(String value) {
            addCriterion("teach_major like", value, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorNotLike(String value) {
            addCriterion("teach_major not like", value, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorIn(List<String> values) {
            addCriterion("teach_major in", values, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorNotIn(List<String> values) {
            addCriterion("teach_major not in", values, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorBetween(String value1, String value2) {
            addCriterion("teach_major between", value1, value2, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachMajorNotBetween(String value1, String value2) {
            addCriterion("teach_major not between", value1, value2, "teachMajor");
            return (Criteria) this;
        }

        public Criteria andTeachSexIsNull() {
            addCriterion("teach_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeachSexIsNotNull() {
            addCriterion("teach_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeachSexEqualTo(String value) {
            addCriterion("teach_sex =", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexNotEqualTo(String value) {
            addCriterion("teach_sex <>", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexGreaterThan(String value) {
            addCriterion("teach_sex >", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexGreaterThanOrEqualTo(String value) {
            addCriterion("teach_sex >=", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexLessThan(String value) {
            addCriterion("teach_sex <", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexLessThanOrEqualTo(String value) {
            addCriterion("teach_sex <=", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexLike(String value) {
            addCriterion("teach_sex like", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexNotLike(String value) {
            addCriterion("teach_sex not like", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexIn(List<String> values) {
            addCriterion("teach_sex in", values, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexNotIn(List<String> values) {
            addCriterion("teach_sex not in", values, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexBetween(String value1, String value2) {
            addCriterion("teach_sex between", value1, value2, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexNotBetween(String value1, String value2) {
            addCriterion("teach_sex not between", value1, value2, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachIconIsNull() {
            addCriterion("teach_icon is null");
            return (Criteria) this;
        }

        public Criteria andTeachIconIsNotNull() {
            addCriterion("teach_icon is not null");
            return (Criteria) this;
        }

        public Criteria andTeachIconEqualTo(String value) {
            addCriterion("teach_icon =", value, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconNotEqualTo(String value) {
            addCriterion("teach_icon <>", value, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconGreaterThan(String value) {
            addCriterion("teach_icon >", value, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconGreaterThanOrEqualTo(String value) {
            addCriterion("teach_icon >=", value, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconLessThan(String value) {
            addCriterion("teach_icon <", value, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconLessThanOrEqualTo(String value) {
            addCriterion("teach_icon <=", value, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconLike(String value) {
            addCriterion("teach_icon like", value, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconNotLike(String value) {
            addCriterion("teach_icon not like", value, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconIn(List<String> values) {
            addCriterion("teach_icon in", values, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconNotIn(List<String> values) {
            addCriterion("teach_icon not in", values, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconBetween(String value1, String value2) {
            addCriterion("teach_icon between", value1, value2, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachIconNotBetween(String value1, String value2) {
            addCriterion("teach_icon not between", value1, value2, "teachIcon");
            return (Criteria) this;
        }

        public Criteria andTeachAddressIsNull() {
            addCriterion("teach_address is null");
            return (Criteria) this;
        }

        public Criteria andTeachAddressIsNotNull() {
            addCriterion("teach_address is not null");
            return (Criteria) this;
        }

        public Criteria andTeachAddressEqualTo(String value) {
            addCriterion("teach_address =", value, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressNotEqualTo(String value) {
            addCriterion("teach_address <>", value, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressGreaterThan(String value) {
            addCriterion("teach_address >", value, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressGreaterThanOrEqualTo(String value) {
            addCriterion("teach_address >=", value, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressLessThan(String value) {
            addCriterion("teach_address <", value, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressLessThanOrEqualTo(String value) {
            addCriterion("teach_address <=", value, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressLike(String value) {
            addCriterion("teach_address like", value, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressNotLike(String value) {
            addCriterion("teach_address not like", value, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressIn(List<String> values) {
            addCriterion("teach_address in", values, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressNotIn(List<String> values) {
            addCriterion("teach_address not in", values, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressBetween(String value1, String value2) {
            addCriterion("teach_address between", value1, value2, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachAddressNotBetween(String value1, String value2) {
            addCriterion("teach_address not between", value1, value2, "teachAddress");
            return (Criteria) this;
        }

        public Criteria andTeachExperIsNull() {
            addCriterion("teach_exper is null");
            return (Criteria) this;
        }

        public Criteria andTeachExperIsNotNull() {
            addCriterion("teach_exper is not null");
            return (Criteria) this;
        }

        public Criteria andTeachExperEqualTo(String value) {
            addCriterion("teach_exper =", value, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperNotEqualTo(String value) {
            addCriterion("teach_exper <>", value, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperGreaterThan(String value) {
            addCriterion("teach_exper >", value, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperGreaterThanOrEqualTo(String value) {
            addCriterion("teach_exper >=", value, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperLessThan(String value) {
            addCriterion("teach_exper <", value, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperLessThanOrEqualTo(String value) {
            addCriterion("teach_exper <=", value, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperLike(String value) {
            addCriterion("teach_exper like", value, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperNotLike(String value) {
            addCriterion("teach_exper not like", value, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperIn(List<String> values) {
            addCriterion("teach_exper in", values, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperNotIn(List<String> values) {
            addCriterion("teach_exper not in", values, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperBetween(String value1, String value2) {
            addCriterion("teach_exper between", value1, value2, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachExperNotBetween(String value1, String value2) {
            addCriterion("teach_exper not between", value1, value2, "teachExper");
            return (Criteria) this;
        }

        public Criteria andTeachSubIsNull() {
            addCriterion("teach_sub is null");
            return (Criteria) this;
        }

        public Criteria andTeachSubIsNotNull() {
            addCriterion("teach_sub is not null");
            return (Criteria) this;
        }

        public Criteria andTeachSubEqualTo(String value) {
            addCriterion("teach_sub =", value, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubNotEqualTo(String value) {
            addCriterion("teach_sub <>", value, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubGreaterThan(String value) {
            addCriterion("teach_sub >", value, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubGreaterThanOrEqualTo(String value) {
            addCriterion("teach_sub >=", value, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubLessThan(String value) {
            addCriterion("teach_sub <", value, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubLessThanOrEqualTo(String value) {
            addCriterion("teach_sub <=", value, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubLike(String value) {
            addCriterion("teach_sub like", value, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubNotLike(String value) {
            addCriterion("teach_sub not like", value, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubIn(List<String> values) {
            addCriterion("teach_sub in", values, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubNotIn(List<String> values) {
            addCriterion("teach_sub not in", values, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubBetween(String value1, String value2) {
            addCriterion("teach_sub between", value1, value2, "teachSub");
            return (Criteria) this;
        }

        public Criteria andTeachSubNotBetween(String value1, String value2) {
            addCriterion("teach_sub not between", value1, value2, "teachSub");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andTstatusIsNull() {
            addCriterion("tstatus is null");
            return (Criteria) this;
        }

        public Criteria andTstatusIsNotNull() {
            addCriterion("tstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTstatusEqualTo(String value) {
            addCriterion("tstatus =", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotEqualTo(String value) {
            addCriterion("tstatus <>", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusGreaterThan(String value) {
            addCriterion("tstatus >", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusGreaterThanOrEqualTo(String value) {
            addCriterion("tstatus >=", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusLessThan(String value) {
            addCriterion("tstatus <", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusLessThanOrEqualTo(String value) {
            addCriterion("tstatus <=", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusLike(String value) {
            addCriterion("tstatus like", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotLike(String value) {
            addCriterion("tstatus not like", value, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusIn(List<String> values) {
            addCriterion("tstatus in", values, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotIn(List<String> values) {
            addCriterion("tstatus not in", values, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusBetween(String value1, String value2) {
            addCriterion("tstatus between", value1, value2, "tstatus");
            return (Criteria) this;
        }

        public Criteria andTstatusNotBetween(String value1, String value2) {
            addCriterion("tstatus not between", value1, value2, "tstatus");
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