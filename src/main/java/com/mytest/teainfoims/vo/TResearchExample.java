package com.mytest.teainfoims.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TResearchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TResearchExample() {
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

        public Criteria andResearchTitleIsNull() {
            addCriterion("research_title is null");
            return (Criteria) this;
        }

        public Criteria andResearchTitleIsNotNull() {
            addCriterion("research_title is not null");
            return (Criteria) this;
        }

        public Criteria andResearchTitleEqualTo(String value) {
            addCriterion("research_title =", value, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleNotEqualTo(String value) {
            addCriterion("research_title <>", value, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleGreaterThan(String value) {
            addCriterion("research_title >", value, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleGreaterThanOrEqualTo(String value) {
            addCriterion("research_title >=", value, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleLessThan(String value) {
            addCriterion("research_title <", value, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleLessThanOrEqualTo(String value) {
            addCriterion("research_title <=", value, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleLike(String value) {
            addCriterion("research_title like", value, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleNotLike(String value) {
            addCriterion("research_title not like", value, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleIn(List<String> values) {
            addCriterion("research_title in", values, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleNotIn(List<String> values) {
            addCriterion("research_title not in", values, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleBetween(String value1, String value2) {
            addCriterion("research_title between", value1, value2, "researchTitle");
            return (Criteria) this;
        }

        public Criteria andResearchTitleNotBetween(String value1, String value2) {
            addCriterion("research_title not between", value1, value2, "researchTitle");
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

        public Criteria andRetypeIsNull() {
            addCriterion("retype is null");
            return (Criteria) this;
        }

        public Criteria andRetypeIsNotNull() {
            addCriterion("retype is not null");
            return (Criteria) this;
        }

        public Criteria andRetypeEqualTo(String value) {
            addCriterion("retype =", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotEqualTo(String value) {
            addCriterion("retype <>", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeGreaterThan(String value) {
            addCriterion("retype >", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeGreaterThanOrEqualTo(String value) {
            addCriterion("retype >=", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeLessThan(String value) {
            addCriterion("retype <", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeLessThanOrEqualTo(String value) {
            addCriterion("retype <=", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeLike(String value) {
            addCriterion("retype like", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotLike(String value) {
            addCriterion("retype not like", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeIn(List<String> values) {
            addCriterion("retype in", values, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotIn(List<String> values) {
            addCriterion("retype not in", values, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeBetween(String value1, String value2) {
            addCriterion("retype between", value1, value2, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotBetween(String value1, String value2) {
            addCriterion("retype not between", value1, value2, "retype");
            return (Criteria) this;
        }

        public Criteria andScontentIsNull() {
            addCriterion("scontent is null");
            return (Criteria) this;
        }

        public Criteria andScontentIsNotNull() {
            addCriterion("scontent is not null");
            return (Criteria) this;
        }

        public Criteria andScontentEqualTo(String value) {
            addCriterion("scontent =", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentNotEqualTo(String value) {
            addCriterion("scontent <>", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentGreaterThan(String value) {
            addCriterion("scontent >", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentGreaterThanOrEqualTo(String value) {
            addCriterion("scontent >=", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentLessThan(String value) {
            addCriterion("scontent <", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentLessThanOrEqualTo(String value) {
            addCriterion("scontent <=", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentLike(String value) {
            addCriterion("scontent like", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentNotLike(String value) {
            addCriterion("scontent not like", value, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentIn(List<String> values) {
            addCriterion("scontent in", values, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentNotIn(List<String> values) {
            addCriterion("scontent not in", values, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentBetween(String value1, String value2) {
            addCriterion("scontent between", value1, value2, "scontent");
            return (Criteria) this;
        }

        public Criteria andScontentNotBetween(String value1, String value2) {
            addCriterion("scontent not between", value1, value2, "scontent");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andRestateIsNull() {
            addCriterion("restate is null");
            return (Criteria) this;
        }

        public Criteria andRestateIsNotNull() {
            addCriterion("restate is not null");
            return (Criteria) this;
        }

        public Criteria andRestateEqualTo(Boolean value) {
            addCriterion("restate =", value, "restate");
            return (Criteria) this;
        }

        public Criteria andRestateNotEqualTo(Boolean value) {
            addCriterion("restate <>", value, "restate");
            return (Criteria) this;
        }

        public Criteria andRestateGreaterThan(Boolean value) {
            addCriterion("restate >", value, "restate");
            return (Criteria) this;
        }

        public Criteria andRestateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("restate >=", value, "restate");
            return (Criteria) this;
        }

        public Criteria andRestateLessThan(Boolean value) {
            addCriterion("restate <", value, "restate");
            return (Criteria) this;
        }

        public Criteria andRestateLessThanOrEqualTo(Boolean value) {
            addCriterion("restate <=", value, "restate");
            return (Criteria) this;
        }

        public Criteria andRestateIn(List<Boolean> values) {
            addCriterion("restate in", values, "restate");
            return (Criteria) this;
        }

        public Criteria andRestateNotIn(List<Boolean> values) {
            addCriterion("restate not in", values, "restate");
            return (Criteria) this;
        }

        public Criteria andRestateBetween(Boolean value1, Boolean value2) {
            addCriterion("restate between", value1, value2, "restate");
            return (Criteria) this;
        }

        public Criteria andRestateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("restate not between", value1, value2, "restate");
            return (Criteria) this;
        }

        public Criteria andPauditIsNull() {
            addCriterion("paudit is null");
            return (Criteria) this;
        }

        public Criteria andPauditIsNotNull() {
            addCriterion("paudit is not null");
            return (Criteria) this;
        }

        public Criteria andPauditEqualTo(Boolean value) {
            addCriterion("paudit =", value, "paudit");
            return (Criteria) this;
        }

        public Criteria andPauditNotEqualTo(Boolean value) {
            addCriterion("paudit <>", value, "paudit");
            return (Criteria) this;
        }

        public Criteria andPauditGreaterThan(Boolean value) {
            addCriterion("paudit >", value, "paudit");
            return (Criteria) this;
        }

        public Criteria andPauditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("paudit >=", value, "paudit");
            return (Criteria) this;
        }

        public Criteria andPauditLessThan(Boolean value) {
            addCriterion("paudit <", value, "paudit");
            return (Criteria) this;
        }

        public Criteria andPauditLessThanOrEqualTo(Boolean value) {
            addCriterion("paudit <=", value, "paudit");
            return (Criteria) this;
        }

        public Criteria andPauditIn(List<Boolean> values) {
            addCriterion("paudit in", values, "paudit");
            return (Criteria) this;
        }

        public Criteria andPauditNotIn(List<Boolean> values) {
            addCriterion("paudit not in", values, "paudit");
            return (Criteria) this;
        }

        public Criteria andPauditBetween(Boolean value1, Boolean value2) {
            addCriterion("paudit between", value1, value2, "paudit");
            return (Criteria) this;
        }

        public Criteria andPauditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("paudit not between", value1, value2, "paudit");
            return (Criteria) this;
        }

        public Criteria andPaccessoryIsNull() {
            addCriterion("paccessory is null");
            return (Criteria) this;
        }

        public Criteria andPaccessoryIsNotNull() {
            addCriterion("paccessory is not null");
            return (Criteria) this;
        }

        public Criteria andPaccessoryEqualTo(String value) {
            addCriterion("paccessory =", value, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryNotEqualTo(String value) {
            addCriterion("paccessory <>", value, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryGreaterThan(String value) {
            addCriterion("paccessory >", value, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("paccessory >=", value, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryLessThan(String value) {
            addCriterion("paccessory <", value, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryLessThanOrEqualTo(String value) {
            addCriterion("paccessory <=", value, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryLike(String value) {
            addCriterion("paccessory like", value, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryNotLike(String value) {
            addCriterion("paccessory not like", value, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryIn(List<String> values) {
            addCriterion("paccessory in", values, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryNotIn(List<String> values) {
            addCriterion("paccessory not in", values, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryBetween(String value1, String value2) {
            addCriterion("paccessory between", value1, value2, "paccessory");
            return (Criteria) this;
        }

        public Criteria andPaccessoryNotBetween(String value1, String value2) {
            addCriterion("paccessory not between", value1, value2, "paccessory");
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