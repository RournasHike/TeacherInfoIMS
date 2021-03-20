package com.mytest.teainfoims.vo;

import java.util.ArrayList;
import java.util.List;

public class TTeachExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTeachExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andTeachTypeIsNull() {
            addCriterion("teach_type is null");
            return (Criteria) this;
        }

        public Criteria andTeachTypeIsNotNull() {
            addCriterion("teach_type is not null");
            return (Criteria) this;
        }

        public Criteria andTeachTypeEqualTo(String value) {
            addCriterion("teach_type =", value, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeNotEqualTo(String value) {
            addCriterion("teach_type <>", value, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeGreaterThan(String value) {
            addCriterion("teach_type >", value, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeGreaterThanOrEqualTo(String value) {
            addCriterion("teach_type >=", value, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeLessThan(String value) {
            addCriterion("teach_type <", value, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeLessThanOrEqualTo(String value) {
            addCriterion("teach_type <=", value, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeLike(String value) {
            addCriterion("teach_type like", value, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeNotLike(String value) {
            addCriterion("teach_type not like", value, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeIn(List<String> values) {
            addCriterion("teach_type in", values, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeNotIn(List<String> values) {
            addCriterion("teach_type not in", values, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeBetween(String value1, String value2) {
            addCriterion("teach_type between", value1, value2, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachTypeNotBetween(String value1, String value2) {
            addCriterion("teach_type not between", value1, value2, "teachType");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearIsNull() {
            addCriterion("teach_class_year is null");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearIsNotNull() {
            addCriterion("teach_class_year is not null");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearEqualTo(String value) {
            addCriterion("teach_class_year =", value, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearNotEqualTo(String value) {
            addCriterion("teach_class_year <>", value, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearGreaterThan(String value) {
            addCriterion("teach_class_year >", value, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearGreaterThanOrEqualTo(String value) {
            addCriterion("teach_class_year >=", value, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearLessThan(String value) {
            addCriterion("teach_class_year <", value, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearLessThanOrEqualTo(String value) {
            addCriterion("teach_class_year <=", value, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearLike(String value) {
            addCriterion("teach_class_year like", value, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearNotLike(String value) {
            addCriterion("teach_class_year not like", value, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearIn(List<String> values) {
            addCriterion("teach_class_year in", values, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearNotIn(List<String> values) {
            addCriterion("teach_class_year not in", values, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearBetween(String value1, String value2) {
            addCriterion("teach_class_year between", value1, value2, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassYearNotBetween(String value1, String value2) {
            addCriterion("teach_class_year not between", value1, value2, "teachClassYear");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermIsNull() {
            addCriterion("teach_class_term is null");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermIsNotNull() {
            addCriterion("teach_class_term is not null");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermEqualTo(String value) {
            addCriterion("teach_class_term =", value, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermNotEqualTo(String value) {
            addCriterion("teach_class_term <>", value, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermGreaterThan(String value) {
            addCriterion("teach_class_term >", value, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermGreaterThanOrEqualTo(String value) {
            addCriterion("teach_class_term >=", value, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermLessThan(String value) {
            addCriterion("teach_class_term <", value, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermLessThanOrEqualTo(String value) {
            addCriterion("teach_class_term <=", value, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermLike(String value) {
            addCriterion("teach_class_term like", value, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermNotLike(String value) {
            addCriterion("teach_class_term not like", value, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermIn(List<String> values) {
            addCriterion("teach_class_term in", values, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermNotIn(List<String> values) {
            addCriterion("teach_class_term not in", values, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermBetween(String value1, String value2) {
            addCriterion("teach_class_term between", value1, value2, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachClassTermNotBetween(String value1, String value2) {
            addCriterion("teach_class_term not between", value1, value2, "teachClassTerm");
            return (Criteria) this;
        }

        public Criteria andTeachGradeIsNull() {
            addCriterion("teach_grade is null");
            return (Criteria) this;
        }

        public Criteria andTeachGradeIsNotNull() {
            addCriterion("teach_grade is not null");
            return (Criteria) this;
        }

        public Criteria andTeachGradeEqualTo(String value) {
            addCriterion("teach_grade =", value, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeNotEqualTo(String value) {
            addCriterion("teach_grade <>", value, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeGreaterThan(String value) {
            addCriterion("teach_grade >", value, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeGreaterThanOrEqualTo(String value) {
            addCriterion("teach_grade >=", value, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeLessThan(String value) {
            addCriterion("teach_grade <", value, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeLessThanOrEqualTo(String value) {
            addCriterion("teach_grade <=", value, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeLike(String value) {
            addCriterion("teach_grade like", value, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeNotLike(String value) {
            addCriterion("teach_grade not like", value, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeIn(List<String> values) {
            addCriterion("teach_grade in", values, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeNotIn(List<String> values) {
            addCriterion("teach_grade not in", values, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeBetween(String value1, String value2) {
            addCriterion("teach_grade between", value1, value2, "teachGrade");
            return (Criteria) this;
        }

        public Criteria andTeachGradeNotBetween(String value1, String value2) {
            addCriterion("teach_grade not between", value1, value2, "teachGrade");
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

        public Criteria andStartCollegeIsNull() {
            addCriterion("start_college is null");
            return (Criteria) this;
        }

        public Criteria andStartCollegeIsNotNull() {
            addCriterion("start_college is not null");
            return (Criteria) this;
        }

        public Criteria andStartCollegeEqualTo(String value) {
            addCriterion("start_college =", value, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeNotEqualTo(String value) {
            addCriterion("start_college <>", value, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeGreaterThan(String value) {
            addCriterion("start_college >", value, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("start_college >=", value, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeLessThan(String value) {
            addCriterion("start_college <", value, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeLessThanOrEqualTo(String value) {
            addCriterion("start_college <=", value, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeLike(String value) {
            addCriterion("start_college like", value, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeNotLike(String value) {
            addCriterion("start_college not like", value, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeIn(List<String> values) {
            addCriterion("start_college in", values, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeNotIn(List<String> values) {
            addCriterion("start_college not in", values, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeBetween(String value1, String value2) {
            addCriterion("start_college between", value1, value2, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartCollegeNotBetween(String value1, String value2) {
            addCriterion("start_college not between", value1, value2, "startCollege");
            return (Criteria) this;
        }

        public Criteria andStartDeptIsNull() {
            addCriterion("start_dept is null");
            return (Criteria) this;
        }

        public Criteria andStartDeptIsNotNull() {
            addCriterion("start_dept is not null");
            return (Criteria) this;
        }

        public Criteria andStartDeptEqualTo(String value) {
            addCriterion("start_dept =", value, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptNotEqualTo(String value) {
            addCriterion("start_dept <>", value, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptGreaterThan(String value) {
            addCriterion("start_dept >", value, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptGreaterThanOrEqualTo(String value) {
            addCriterion("start_dept >=", value, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptLessThan(String value) {
            addCriterion("start_dept <", value, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptLessThanOrEqualTo(String value) {
            addCriterion("start_dept <=", value, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptLike(String value) {
            addCriterion("start_dept like", value, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptNotLike(String value) {
            addCriterion("start_dept not like", value, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptIn(List<String> values) {
            addCriterion("start_dept in", values, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptNotIn(List<String> values) {
            addCriterion("start_dept not in", values, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptBetween(String value1, String value2) {
            addCriterion("start_dept between", value1, value2, "startDept");
            return (Criteria) this;
        }

        public Criteria andStartDeptNotBetween(String value1, String value2) {
            addCriterion("start_dept not between", value1, value2, "startDept");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourIsNull() {
            addCriterion("prescribed_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourIsNotNull() {
            addCriterion("prescribed_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourEqualTo(Integer value) {
            addCriterion("prescribed_class_hour =", value, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourNotEqualTo(Integer value) {
            addCriterion("prescribed_class_hour <>", value, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourGreaterThan(Integer value) {
            addCriterion("prescribed_class_hour >", value, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescribed_class_hour >=", value, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourLessThan(Integer value) {
            addCriterion("prescribed_class_hour <", value, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("prescribed_class_hour <=", value, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourIn(List<Integer> values) {
            addCriterion("prescribed_class_hour in", values, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourNotIn(List<Integer> values) {
            addCriterion("prescribed_class_hour not in", values, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourBetween(Integer value1, Integer value2) {
            addCriterion("prescribed_class_hour between", value1, value2, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andPrescribedClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("prescribed_class_hour not between", value1, value2, "prescribedClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourIsNull() {
            addCriterion("actual_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andActualClassHourIsNotNull() {
            addCriterion("actual_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andActualClassHourEqualTo(Integer value) {
            addCriterion("actual_class_hour =", value, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourNotEqualTo(Integer value) {
            addCriterion("actual_class_hour <>", value, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourGreaterThan(Integer value) {
            addCriterion("actual_class_hour >", value, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_class_hour >=", value, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourLessThan(Integer value) {
            addCriterion("actual_class_hour <", value, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("actual_class_hour <=", value, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourIn(List<Integer> values) {
            addCriterion("actual_class_hour in", values, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourNotIn(List<Integer> values) {
            addCriterion("actual_class_hour not in", values, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourBetween(Integer value1, Integer value2) {
            addCriterion("actual_class_hour between", value1, value2, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_class_hour not between", value1, value2, "actualClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourIsNull() {
            addCriterion("actual_teach_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourIsNotNull() {
            addCriterion("actual_teach_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourEqualTo(Integer value) {
            addCriterion("actual_teach_class_hour =", value, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourNotEqualTo(Integer value) {
            addCriterion("actual_teach_class_hour <>", value, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourGreaterThan(Integer value) {
            addCriterion("actual_teach_class_hour >", value, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_teach_class_hour >=", value, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourLessThan(Integer value) {
            addCriterion("actual_teach_class_hour <", value, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("actual_teach_class_hour <=", value, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourIn(List<Integer> values) {
            addCriterion("actual_teach_class_hour in", values, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourNotIn(List<Integer> values) {
            addCriterion("actual_teach_class_hour not in", values, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourBetween(Integer value1, Integer value2) {
            addCriterion("actual_teach_class_hour between", value1, value2, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualTeachClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_teach_class_hour not between", value1, value2, "actualTeachClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourIsNull() {
            addCriterion("actual_experiment_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourIsNotNull() {
            addCriterion("actual_experiment_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourEqualTo(Integer value) {
            addCriterion("actual_experiment_class_hour =", value, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourNotEqualTo(Integer value) {
            addCriterion("actual_experiment_class_hour <>", value, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourGreaterThan(Integer value) {
            addCriterion("actual_experiment_class_hour >", value, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_experiment_class_hour >=", value, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourLessThan(Integer value) {
            addCriterion("actual_experiment_class_hour <", value, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("actual_experiment_class_hour <=", value, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourIn(List<Integer> values) {
            addCriterion("actual_experiment_class_hour in", values, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourNotIn(List<Integer> values) {
            addCriterion("actual_experiment_class_hour not in", values, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourBetween(Integer value1, Integer value2) {
            addCriterion("actual_experiment_class_hour between", value1, value2, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualExperimentClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_experiment_class_hour not between", value1, value2, "actualExperimentClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourIsNull() {
            addCriterion("actual_computer_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourIsNotNull() {
            addCriterion("actual_computer_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourEqualTo(Integer value) {
            addCriterion("actual_computer_class_hour =", value, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourNotEqualTo(Integer value) {
            addCriterion("actual_computer_class_hour <>", value, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourGreaterThan(Integer value) {
            addCriterion("actual_computer_class_hour >", value, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_computer_class_hour >=", value, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourLessThan(Integer value) {
            addCriterion("actual_computer_class_hour <", value, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("actual_computer_class_hour <=", value, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourIn(List<Integer> values) {
            addCriterion("actual_computer_class_hour in", values, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourNotIn(List<Integer> values) {
            addCriterion("actual_computer_class_hour not in", values, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourBetween(Integer value1, Integer value2) {
            addCriterion("actual_computer_class_hour between", value1, value2, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualComputerClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_computer_class_hour not between", value1, value2, "actualComputerClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourIsNull() {
            addCriterion("actual_other_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourIsNotNull() {
            addCriterion("actual_other_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourEqualTo(Integer value) {
            addCriterion("actual_other_class_hour =", value, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourNotEqualTo(Integer value) {
            addCriterion("actual_other_class_hour <>", value, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourGreaterThan(Integer value) {
            addCriterion("actual_other_class_hour >", value, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_other_class_hour >=", value, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourLessThan(Integer value) {
            addCriterion("actual_other_class_hour <", value, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("actual_other_class_hour <=", value, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourIn(List<Integer> values) {
            addCriterion("actual_other_class_hour in", values, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourNotIn(List<Integer> values) {
            addCriterion("actual_other_class_hour not in", values, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourBetween(Integer value1, Integer value2) {
            addCriterion("actual_other_class_hour between", value1, value2, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualOtherClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_other_class_hour not between", value1, value2, "actualOtherClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourIsNull() {
            addCriterion("actual_sumup_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourIsNotNull() {
            addCriterion("actual_sumup_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourEqualTo(Integer value) {
            addCriterion("actual_sumup_class_hour =", value, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourNotEqualTo(Integer value) {
            addCriterion("actual_sumup_class_hour <>", value, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourGreaterThan(Integer value) {
            addCriterion("actual_sumup_class_hour >", value, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_sumup_class_hour >=", value, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourLessThan(Integer value) {
            addCriterion("actual_sumup_class_hour <", value, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("actual_sumup_class_hour <=", value, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourIn(List<Integer> values) {
            addCriterion("actual_sumup_class_hour in", values, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourNotIn(List<Integer> values) {
            addCriterion("actual_sumup_class_hour not in", values, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourBetween(Integer value1, Integer value2) {
            addCriterion("actual_sumup_class_hour between", value1, value2, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andActualSumupClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_sumup_class_hour not between", value1, value2, "actualSumupClassHour");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(Boolean value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(Boolean value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(Boolean value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(Boolean value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(Boolean value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<Boolean> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<Boolean> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(Boolean value1, Boolean value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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