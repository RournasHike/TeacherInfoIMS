package com.mytest.teainfoims.vo;

import java.util.ArrayList;
import java.util.List;

public class TCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCourseExample() {
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

        public Criteria andCourseNoIsNull() {
            addCriterion("course_no is null");
            return (Criteria) this;
        }

        public Criteria andCourseNoIsNotNull() {
            addCriterion("course_no is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNoEqualTo(String value) {
            addCriterion("course_no =", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoNotEqualTo(String value) {
            addCriterion("course_no <>", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoGreaterThan(String value) {
            addCriterion("course_no >", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoGreaterThanOrEqualTo(String value) {
            addCriterion("course_no >=", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoLessThan(String value) {
            addCriterion("course_no <", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoLessThanOrEqualTo(String value) {
            addCriterion("course_no <=", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoLike(String value) {
            addCriterion("course_no like", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoNotLike(String value) {
            addCriterion("course_no not like", value, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoIn(List<String> values) {
            addCriterion("course_no in", values, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoNotIn(List<String> values) {
            addCriterion("course_no not in", values, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoBetween(String value1, String value2) {
            addCriterion("course_no between", value1, value2, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNoNotBetween(String value1, String value2) {
            addCriterion("course_no not between", value1, value2, "courseNo");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(String value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(String value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(String value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(String value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(String value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLike(String value) {
            addCriterion("course_type like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotLike(String value) {
            addCriterion("course_type not like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<String> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<String> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(String value1, String value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(String value1, String value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourIsNull() {
            addCriterion("week_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourIsNotNull() {
            addCriterion("week_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourEqualTo(Integer value) {
            addCriterion("week_class_hour =", value, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourNotEqualTo(Integer value) {
            addCriterion("week_class_hour <>", value, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourGreaterThan(Integer value) {
            addCriterion("week_class_hour >", value, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("week_class_hour >=", value, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourLessThan(Integer value) {
            addCriterion("week_class_hour <", value, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("week_class_hour <=", value, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourIn(List<Integer> values) {
            addCriterion("week_class_hour in", values, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourNotIn(List<Integer> values) {
            addCriterion("week_class_hour not in", values, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourBetween(Integer value1, Integer value2) {
            addCriterion("week_class_hour between", value1, value2, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andWeekClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("week_class_hour not between", value1, value2, "weekClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourIsNull() {
            addCriterion("teach_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourIsNotNull() {
            addCriterion("teach_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourEqualTo(Integer value) {
            addCriterion("teach_class_hour =", value, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourNotEqualTo(Integer value) {
            addCriterion("teach_class_hour <>", value, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourGreaterThan(Integer value) {
            addCriterion("teach_class_hour >", value, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("teach_class_hour >=", value, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourLessThan(Integer value) {
            addCriterion("teach_class_hour <", value, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("teach_class_hour <=", value, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourIn(List<Integer> values) {
            addCriterion("teach_class_hour in", values, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourNotIn(List<Integer> values) {
            addCriterion("teach_class_hour not in", values, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourBetween(Integer value1, Integer value2) {
            addCriterion("teach_class_hour between", value1, value2, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andTeachClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("teach_class_hour not between", value1, value2, "teachClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourIsNull() {
            addCriterion("experiment_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourIsNotNull() {
            addCriterion("experiment_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourEqualTo(Integer value) {
            addCriterion("experiment_class_hour =", value, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourNotEqualTo(Integer value) {
            addCriterion("experiment_class_hour <>", value, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourGreaterThan(Integer value) {
            addCriterion("experiment_class_hour >", value, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("experiment_class_hour >=", value, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourLessThan(Integer value) {
            addCriterion("experiment_class_hour <", value, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("experiment_class_hour <=", value, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourIn(List<Integer> values) {
            addCriterion("experiment_class_hour in", values, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourNotIn(List<Integer> values) {
            addCriterion("experiment_class_hour not in", values, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourBetween(Integer value1, Integer value2) {
            addCriterion("experiment_class_hour between", value1, value2, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andExperimentClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("experiment_class_hour not between", value1, value2, "experimentClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourIsNull() {
            addCriterion("computer_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourIsNotNull() {
            addCriterion("computer_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourEqualTo(Integer value) {
            addCriterion("computer_class_hour =", value, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourNotEqualTo(Integer value) {
            addCriterion("computer_class_hour <>", value, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourGreaterThan(Integer value) {
            addCriterion("computer_class_hour >", value, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("computer_class_hour >=", value, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourLessThan(Integer value) {
            addCriterion("computer_class_hour <", value, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("computer_class_hour <=", value, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourIn(List<Integer> values) {
            addCriterion("computer_class_hour in", values, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourNotIn(List<Integer> values) {
            addCriterion("computer_class_hour not in", values, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourBetween(Integer value1, Integer value2) {
            addCriterion("computer_class_hour between", value1, value2, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andComputerClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("computer_class_hour not between", value1, value2, "computerClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourIsNull() {
            addCriterion("other_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourIsNotNull() {
            addCriterion("other_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourEqualTo(Integer value) {
            addCriterion("other_class_hour =", value, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourNotEqualTo(Integer value) {
            addCriterion("other_class_hour <>", value, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourGreaterThan(Integer value) {
            addCriterion("other_class_hour >", value, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_class_hour >=", value, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourLessThan(Integer value) {
            addCriterion("other_class_hour <", value, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("other_class_hour <=", value, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourIn(List<Integer> values) {
            addCriterion("other_class_hour in", values, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourNotIn(List<Integer> values) {
            addCriterion("other_class_hour not in", values, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourBetween(Integer value1, Integer value2) {
            addCriterion("other_class_hour between", value1, value2, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andOtherClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("other_class_hour not between", value1, value2, "otherClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourIsNull() {
            addCriterion("sumup_class_hour is null");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourIsNotNull() {
            addCriterion("sumup_class_hour is not null");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourEqualTo(Integer value) {
            addCriterion("sumup_class_hour =", value, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourNotEqualTo(Integer value) {
            addCriterion("sumup_class_hour <>", value, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourGreaterThan(Integer value) {
            addCriterion("sumup_class_hour >", value, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourGreaterThanOrEqualTo(Integer value) {
            addCriterion("sumup_class_hour >=", value, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourLessThan(Integer value) {
            addCriterion("sumup_class_hour <", value, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourLessThanOrEqualTo(Integer value) {
            addCriterion("sumup_class_hour <=", value, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourIn(List<Integer> values) {
            addCriterion("sumup_class_hour in", values, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourNotIn(List<Integer> values) {
            addCriterion("sumup_class_hour not in", values, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourBetween(Integer value1, Integer value2) {
            addCriterion("sumup_class_hour between", value1, value2, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andSumupClassHourNotBetween(Integer value1, Integer value2) {
            addCriterion("sumup_class_hour not between", value1, value2, "sumupClassHour");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Double value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Double value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Double value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Double value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Double value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Double value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Double> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Double> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Double value1, Double value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Double value1, Double value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("state not between", value1, value2, "state");
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