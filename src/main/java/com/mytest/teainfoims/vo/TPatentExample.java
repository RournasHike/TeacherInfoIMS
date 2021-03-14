package com.mytest.teainfoims.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPatentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPatentExample() {
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

        public Criteria andPatidIsNull() {
            addCriterion("patid is null");
            return (Criteria) this;
        }

        public Criteria andPatidIsNotNull() {
            addCriterion("patid is not null");
            return (Criteria) this;
        }

        public Criteria andPatidEqualTo(Integer value) {
            addCriterion("patid =", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotEqualTo(Integer value) {
            addCriterion("patid <>", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidGreaterThan(Integer value) {
            addCriterion("patid >", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("patid >=", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLessThan(Integer value) {
            addCriterion("patid <", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidLessThanOrEqualTo(Integer value) {
            addCriterion("patid <=", value, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidIn(List<Integer> values) {
            addCriterion("patid in", values, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotIn(List<Integer> values) {
            addCriterion("patid not in", values, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidBetween(Integer value1, Integer value2) {
            addCriterion("patid between", value1, value2, "patid");
            return (Criteria) this;
        }

        public Criteria andPatidNotBetween(Integer value1, Integer value2) {
            addCriterion("patid not between", value1, value2, "patid");
            return (Criteria) this;
        }

        public Criteria andPatnoIsNull() {
            addCriterion("patno is null");
            return (Criteria) this;
        }

        public Criteria andPatnoIsNotNull() {
            addCriterion("patno is not null");
            return (Criteria) this;
        }

        public Criteria andPatnoEqualTo(String value) {
            addCriterion("patno =", value, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoNotEqualTo(String value) {
            addCriterion("patno <>", value, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoGreaterThan(String value) {
            addCriterion("patno >", value, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoGreaterThanOrEqualTo(String value) {
            addCriterion("patno >=", value, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoLessThan(String value) {
            addCriterion("patno <", value, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoLessThanOrEqualTo(String value) {
            addCriterion("patno <=", value, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoLike(String value) {
            addCriterion("patno like", value, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoNotLike(String value) {
            addCriterion("patno not like", value, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoIn(List<String> values) {
            addCriterion("patno in", values, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoNotIn(List<String> values) {
            addCriterion("patno not in", values, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoBetween(String value1, String value2) {
            addCriterion("patno between", value1, value2, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnoNotBetween(String value1, String value2) {
            addCriterion("patno not between", value1, value2, "patno");
            return (Criteria) this;
        }

        public Criteria andPatnameIsNull() {
            addCriterion("patname is null");
            return (Criteria) this;
        }

        public Criteria andPatnameIsNotNull() {
            addCriterion("patname is not null");
            return (Criteria) this;
        }

        public Criteria andPatnameEqualTo(String value) {
            addCriterion("patname =", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameNotEqualTo(String value) {
            addCriterion("patname <>", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameGreaterThan(String value) {
            addCriterion("patname >", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameGreaterThanOrEqualTo(String value) {
            addCriterion("patname >=", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameLessThan(String value) {
            addCriterion("patname <", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameLessThanOrEqualTo(String value) {
            addCriterion("patname <=", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameLike(String value) {
            addCriterion("patname like", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameNotLike(String value) {
            addCriterion("patname not like", value, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameIn(List<String> values) {
            addCriterion("patname in", values, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameNotIn(List<String> values) {
            addCriterion("patname not in", values, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameBetween(String value1, String value2) {
            addCriterion("patname between", value1, value2, "patname");
            return (Criteria) this;
        }

        public Criteria andPatnameNotBetween(String value1, String value2) {
            addCriterion("patname not between", value1, value2, "patname");
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

        public Criteria andParticipantsIsNull() {
            addCriterion("participants is null");
            return (Criteria) this;
        }

        public Criteria andParticipantsIsNotNull() {
            addCriterion("participants is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantsEqualTo(String value) {
            addCriterion("participants =", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotEqualTo(String value) {
            addCriterion("participants <>", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsGreaterThan(String value) {
            addCriterion("participants >", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsGreaterThanOrEqualTo(String value) {
            addCriterion("participants >=", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsLessThan(String value) {
            addCriterion("participants <", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsLessThanOrEqualTo(String value) {
            addCriterion("participants <=", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsLike(String value) {
            addCriterion("participants like", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotLike(String value) {
            addCriterion("participants not like", value, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsIn(List<String> values) {
            addCriterion("participants in", values, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotIn(List<String> values) {
            addCriterion("participants not in", values, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsBetween(String value1, String value2) {
            addCriterion("participants between", value1, value2, "participants");
            return (Criteria) this;
        }

        public Criteria andParticipantsNotBetween(String value1, String value2) {
            addCriterion("participants not between", value1, value2, "participants");
            return (Criteria) this;
        }

        public Criteria andPatsnIsNull() {
            addCriterion("patsn is null");
            return (Criteria) this;
        }

        public Criteria andPatsnIsNotNull() {
            addCriterion("patsn is not null");
            return (Criteria) this;
        }

        public Criteria andPatsnEqualTo(String value) {
            addCriterion("patsn =", value, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnNotEqualTo(String value) {
            addCriterion("patsn <>", value, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnGreaterThan(String value) {
            addCriterion("patsn >", value, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnGreaterThanOrEqualTo(String value) {
            addCriterion("patsn >=", value, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnLessThan(String value) {
            addCriterion("patsn <", value, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnLessThanOrEqualTo(String value) {
            addCriterion("patsn <=", value, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnLike(String value) {
            addCriterion("patsn like", value, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnNotLike(String value) {
            addCriterion("patsn not like", value, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnIn(List<String> values) {
            addCriterion("patsn in", values, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnNotIn(List<String> values) {
            addCriterion("patsn not in", values, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnBetween(String value1, String value2) {
            addCriterion("patsn between", value1, value2, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatsnNotBetween(String value1, String value2) {
            addCriterion("patsn not between", value1, value2, "patsn");
            return (Criteria) this;
        }

        public Criteria andPatappdateIsNull() {
            addCriterion("patappdate is null");
            return (Criteria) this;
        }

        public Criteria andPatappdateIsNotNull() {
            addCriterion("patappdate is not null");
            return (Criteria) this;
        }

        public Criteria andPatappdateEqualTo(Date value) {
            addCriterionForJDBCDate("patappdate =", value, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatappdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("patappdate <>", value, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatappdateGreaterThan(Date value) {
            addCriterionForJDBCDate("patappdate >", value, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatappdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patappdate >=", value, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatappdateLessThan(Date value) {
            addCriterionForJDBCDate("patappdate <", value, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatappdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patappdate <=", value, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatappdateIn(List<Date> values) {
            addCriterionForJDBCDate("patappdate in", values, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatappdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("patappdate not in", values, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatappdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patappdate between", value1, value2, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatappdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patappdate not between", value1, value2, "patappdate");
            return (Criteria) this;
        }

        public Criteria andPatendateIsNull() {
            addCriterion("patendate is null");
            return (Criteria) this;
        }

        public Criteria andPatendateIsNotNull() {
            addCriterion("patendate is not null");
            return (Criteria) this;
        }

        public Criteria andPatendateEqualTo(Date value) {
            addCriterionForJDBCDate("patendate =", value, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatendateNotEqualTo(Date value) {
            addCriterionForJDBCDate("patendate <>", value, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatendateGreaterThan(Date value) {
            addCriterionForJDBCDate("patendate >", value, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatendateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patendate >=", value, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatendateLessThan(Date value) {
            addCriterionForJDBCDate("patendate <", value, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatendateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("patendate <=", value, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatendateIn(List<Date> values) {
            addCriterionForJDBCDate("patendate in", values, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatendateNotIn(List<Date> values) {
            addCriterionForJDBCDate("patendate not in", values, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatendateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patendate between", value1, value2, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatendateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("patendate not between", value1, value2, "patendate");
            return (Criteria) this;
        }

        public Criteria andPatgradeIsNull() {
            addCriterion("patgrade is null");
            return (Criteria) this;
        }

        public Criteria andPatgradeIsNotNull() {
            addCriterion("patgrade is not null");
            return (Criteria) this;
        }

        public Criteria andPatgradeEqualTo(String value) {
            addCriterion("patgrade =", value, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeNotEqualTo(String value) {
            addCriterion("patgrade <>", value, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeGreaterThan(String value) {
            addCriterion("patgrade >", value, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeGreaterThanOrEqualTo(String value) {
            addCriterion("patgrade >=", value, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeLessThan(String value) {
            addCriterion("patgrade <", value, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeLessThanOrEqualTo(String value) {
            addCriterion("patgrade <=", value, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeLike(String value) {
            addCriterion("patgrade like", value, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeNotLike(String value) {
            addCriterion("patgrade not like", value, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeIn(List<String> values) {
            addCriterion("patgrade in", values, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeNotIn(List<String> values) {
            addCriterion("patgrade not in", values, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeBetween(String value1, String value2) {
            addCriterion("patgrade between", value1, value2, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPatgradeNotBetween(String value1, String value2) {
            addCriterion("patgrade not between", value1, value2, "patgrade");
            return (Criteria) this;
        }

        public Criteria andPattypeIsNull() {
            addCriterion("pattype is null");
            return (Criteria) this;
        }

        public Criteria andPattypeIsNotNull() {
            addCriterion("pattype is not null");
            return (Criteria) this;
        }

        public Criteria andPattypeEqualTo(String value) {
            addCriterion("pattype =", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeNotEqualTo(String value) {
            addCriterion("pattype <>", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeGreaterThan(String value) {
            addCriterion("pattype >", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeGreaterThanOrEqualTo(String value) {
            addCriterion("pattype >=", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeLessThan(String value) {
            addCriterion("pattype <", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeLessThanOrEqualTo(String value) {
            addCriterion("pattype <=", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeLike(String value) {
            addCriterion("pattype like", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeNotLike(String value) {
            addCriterion("pattype not like", value, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeIn(List<String> values) {
            addCriterion("pattype in", values, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeNotIn(List<String> values) {
            addCriterion("pattype not in", values, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeBetween(String value1, String value2) {
            addCriterion("pattype between", value1, value2, "pattype");
            return (Criteria) this;
        }

        public Criteria andPattypeNotBetween(String value1, String value2) {
            addCriterion("pattype not between", value1, value2, "pattype");
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