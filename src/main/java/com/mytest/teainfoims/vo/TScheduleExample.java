package com.mytest.teainfoims.vo;

import java.util.ArrayList;
import java.util.List;

public class TScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TScheduleExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andClassYearIsNull() {
            addCriterion("class_year is null");
            return (Criteria) this;
        }

        public Criteria andClassYearIsNotNull() {
            addCriterion("class_year is not null");
            return (Criteria) this;
        }

        public Criteria andClassYearEqualTo(String value) {
            addCriterion("class_year =", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearNotEqualTo(String value) {
            addCriterion("class_year <>", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearGreaterThan(String value) {
            addCriterion("class_year >", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearGreaterThanOrEqualTo(String value) {
            addCriterion("class_year >=", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearLessThan(String value) {
            addCriterion("class_year <", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearLessThanOrEqualTo(String value) {
            addCriterion("class_year <=", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearLike(String value) {
            addCriterion("class_year like", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearNotLike(String value) {
            addCriterion("class_year not like", value, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearIn(List<String> values) {
            addCriterion("class_year in", values, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearNotIn(List<String> values) {
            addCriterion("class_year not in", values, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearBetween(String value1, String value2) {
            addCriterion("class_year between", value1, value2, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassYearNotBetween(String value1, String value2) {
            addCriterion("class_year not between", value1, value2, "classYear");
            return (Criteria) this;
        }

        public Criteria andClassTermIsNull() {
            addCriterion("class_term is null");
            return (Criteria) this;
        }

        public Criteria andClassTermIsNotNull() {
            addCriterion("class_term is not null");
            return (Criteria) this;
        }

        public Criteria andClassTermEqualTo(String value) {
            addCriterion("class_term =", value, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermNotEqualTo(String value) {
            addCriterion("class_term <>", value, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermGreaterThan(String value) {
            addCriterion("class_term >", value, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermGreaterThanOrEqualTo(String value) {
            addCriterion("class_term >=", value, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermLessThan(String value) {
            addCriterion("class_term <", value, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermLessThanOrEqualTo(String value) {
            addCriterion("class_term <=", value, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermLike(String value) {
            addCriterion("class_term like", value, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermNotLike(String value) {
            addCriterion("class_term not like", value, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermIn(List<String> values) {
            addCriterion("class_term in", values, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermNotIn(List<String> values) {
            addCriterion("class_term not in", values, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermBetween(String value1, String value2) {
            addCriterion("class_term between", value1, value2, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassTermNotBetween(String value1, String value2) {
            addCriterion("class_term not between", value1, value2, "classTerm");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayIsNull() {
            addCriterion("class_work_day is null");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayIsNotNull() {
            addCriterion("class_work_day is not null");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayEqualTo(String value) {
            addCriterion("class_work_day =", value, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayNotEqualTo(String value) {
            addCriterion("class_work_day <>", value, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayGreaterThan(String value) {
            addCriterion("class_work_day >", value, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayGreaterThanOrEqualTo(String value) {
            addCriterion("class_work_day >=", value, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayLessThan(String value) {
            addCriterion("class_work_day <", value, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayLessThanOrEqualTo(String value) {
            addCriterion("class_work_day <=", value, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayLike(String value) {
            addCriterion("class_work_day like", value, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayNotLike(String value) {
            addCriterion("class_work_day not like", value, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayIn(List<String> values) {
            addCriterion("class_work_day in", values, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayNotIn(List<String> values) {
            addCriterion("class_work_day not in", values, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayBetween(String value1, String value2) {
            addCriterion("class_work_day between", value1, value2, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassWorkDayNotBetween(String value1, String value2) {
            addCriterion("class_work_day not between", value1, value2, "classWorkDay");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNull() {
            addCriterion("class_num is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNotNull() {
            addCriterion("class_num is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumEqualTo(String value) {
            addCriterion("class_num =", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotEqualTo(String value) {
            addCriterion("class_num <>", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThan(String value) {
            addCriterion("class_num >", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThanOrEqualTo(String value) {
            addCriterion("class_num >=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThan(String value) {
            addCriterion("class_num <", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThanOrEqualTo(String value) {
            addCriterion("class_num <=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLike(String value) {
            addCriterion("class_num like", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotLike(String value) {
            addCriterion("class_num not like", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIn(List<String> values) {
            addCriterion("class_num in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotIn(List<String> values) {
            addCriterion("class_num not in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumBetween(String value1, String value2) {
            addCriterion("class_num between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotBetween(String value1, String value2) {
            addCriterion("class_num not between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andStartWeekIsNull() {
            addCriterion("start_week is null");
            return (Criteria) this;
        }

        public Criteria andStartWeekIsNotNull() {
            addCriterion("start_week is not null");
            return (Criteria) this;
        }

        public Criteria andStartWeekEqualTo(Integer value) {
            addCriterion("start_week =", value, "startWeek");
            return (Criteria) this;
        }

        public Criteria andStartWeekNotEqualTo(Integer value) {
            addCriterion("start_week <>", value, "startWeek");
            return (Criteria) this;
        }

        public Criteria andStartWeekGreaterThan(Integer value) {
            addCriterion("start_week >", value, "startWeek");
            return (Criteria) this;
        }

        public Criteria andStartWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_week >=", value, "startWeek");
            return (Criteria) this;
        }

        public Criteria andStartWeekLessThan(Integer value) {
            addCriterion("start_week <", value, "startWeek");
            return (Criteria) this;
        }

        public Criteria andStartWeekLessThanOrEqualTo(Integer value) {
            addCriterion("start_week <=", value, "startWeek");
            return (Criteria) this;
        }

        public Criteria andStartWeekIn(List<Integer> values) {
            addCriterion("start_week in", values, "startWeek");
            return (Criteria) this;
        }

        public Criteria andStartWeekNotIn(List<Integer> values) {
            addCriterion("start_week not in", values, "startWeek");
            return (Criteria) this;
        }

        public Criteria andStartWeekBetween(Integer value1, Integer value2) {
            addCriterion("start_week between", value1, value2, "startWeek");
            return (Criteria) this;
        }

        public Criteria andStartWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("start_week not between", value1, value2, "startWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekIsNull() {
            addCriterion("class_week is null");
            return (Criteria) this;
        }

        public Criteria andClassWeekIsNotNull() {
            addCriterion("class_week is not null");
            return (Criteria) this;
        }

        public Criteria andClassWeekEqualTo(Integer value) {
            addCriterion("class_week =", value, "classWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekNotEqualTo(Integer value) {
            addCriterion("class_week <>", value, "classWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekGreaterThan(Integer value) {
            addCriterion("class_week >", value, "classWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_week >=", value, "classWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekLessThan(Integer value) {
            addCriterion("class_week <", value, "classWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekLessThanOrEqualTo(Integer value) {
            addCriterion("class_week <=", value, "classWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekIn(List<Integer> values) {
            addCriterion("class_week in", values, "classWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekNotIn(List<Integer> values) {
            addCriterion("class_week not in", values, "classWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekBetween(Integer value1, Integer value2) {
            addCriterion("class_week between", value1, value2, "classWeek");
            return (Criteria) this;
        }

        public Criteria andClassWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("class_week not between", value1, value2, "classWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekIsNull() {
            addCriterion("is_single_week is null");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekIsNotNull() {
            addCriterion("is_single_week is not null");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekEqualTo(Boolean value) {
            addCriterion("is_single_week =", value, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekNotEqualTo(Boolean value) {
            addCriterion("is_single_week <>", value, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekGreaterThan(Boolean value) {
            addCriterion("is_single_week >", value, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_single_week >=", value, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekLessThan(Boolean value) {
            addCriterion("is_single_week <", value, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekLessThanOrEqualTo(Boolean value) {
            addCriterion("is_single_week <=", value, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekIn(List<Boolean> values) {
            addCriterion("is_single_week in", values, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekNotIn(List<Boolean> values) {
            addCriterion("is_single_week not in", values, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekBetween(Boolean value1, Boolean value2) {
            addCriterion("is_single_week between", value1, value2, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsSingleWeekNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_single_week not between", value1, value2, "isSingleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekIsNull() {
            addCriterion("is_double_week is null");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekIsNotNull() {
            addCriterion("is_double_week is not null");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekEqualTo(Boolean value) {
            addCriterion("is_double_week =", value, "isDoubleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekNotEqualTo(Boolean value) {
            addCriterion("is_double_week <>", value, "isDoubleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekGreaterThan(Boolean value) {
            addCriterion("is_double_week >", value, "isDoubleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_double_week >=", value, "isDoubleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekLessThan(Boolean value) {
            addCriterion("is_double_week <", value, "isDoubleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekLessThanOrEqualTo(Boolean value) {
            addCriterion("is_double_week <=", value, "isDoubleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekIn(List<Boolean> values) {
            addCriterion("is_double_week in", values, "isDoubleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekNotIn(List<Boolean> values) {
            addCriterion("is_double_week not in", values, "isDoubleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekBetween(Boolean value1, Boolean value2) {
            addCriterion("is_double_week between", value1, value2, "isDoubleWeek");
            return (Criteria) this;
        }

        public Criteria andIsDoubleWeekNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_double_week not between", value1, value2, "isDoubleWeek");
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