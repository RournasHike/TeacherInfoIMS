package com.mytest.teainfoims.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class THonorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public THonorExample() {
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

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHnoIsNull() {
            addCriterion("hno is null");
            return (Criteria) this;
        }

        public Criteria andHnoIsNotNull() {
            addCriterion("hno is not null");
            return (Criteria) this;
        }

        public Criteria andHnoEqualTo(String value) {
            addCriterion("hno =", value, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoNotEqualTo(String value) {
            addCriterion("hno <>", value, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoGreaterThan(String value) {
            addCriterion("hno >", value, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoGreaterThanOrEqualTo(String value) {
            addCriterion("hno >=", value, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoLessThan(String value) {
            addCriterion("hno <", value, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoLessThanOrEqualTo(String value) {
            addCriterion("hno <=", value, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoLike(String value) {
            addCriterion("hno like", value, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoNotLike(String value) {
            addCriterion("hno not like", value, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoIn(List<String> values) {
            addCriterion("hno in", values, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoNotIn(List<String> values) {
            addCriterion("hno not in", values, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoBetween(String value1, String value2) {
            addCriterion("hno between", value1, value2, "hno");
            return (Criteria) this;
        }

        public Criteria andHnoNotBetween(String value1, String value2) {
            addCriterion("hno not between", value1, value2, "hno");
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

        public Criteria andHnameIsNull() {
            addCriterion("hname is null");
            return (Criteria) this;
        }

        public Criteria andHnameIsNotNull() {
            addCriterion("hname is not null");
            return (Criteria) this;
        }

        public Criteria andHnameEqualTo(String value) {
            addCriterion("hname =", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotEqualTo(String value) {
            addCriterion("hname <>", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThan(String value) {
            addCriterion("hname >", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameGreaterThanOrEqualTo(String value) {
            addCriterion("hname >=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThan(String value) {
            addCriterion("hname <", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLessThanOrEqualTo(String value) {
            addCriterion("hname <=", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameLike(String value) {
            addCriterion("hname like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotLike(String value) {
            addCriterion("hname not like", value, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameIn(List<String> values) {
            addCriterion("hname in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotIn(List<String> values) {
            addCriterion("hname not in", values, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameBetween(String value1, String value2) {
            addCriterion("hname between", value1, value2, "hname");
            return (Criteria) this;
        }

        public Criteria andHnameNotBetween(String value1, String value2) {
            addCriterion("hname not between", value1, value2, "hname");
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

        public Criteria andHdateIsNull() {
            addCriterion("hdate is null");
            return (Criteria) this;
        }

        public Criteria andHdateIsNotNull() {
            addCriterion("hdate is not null");
            return (Criteria) this;
        }

        public Criteria andHdateEqualTo(Date value) {
            addCriterionForJDBCDate("hdate =", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("hdate <>", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateGreaterThan(Date value) {
            addCriterionForJDBCDate("hdate >", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hdate >=", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateLessThan(Date value) {
            addCriterionForJDBCDate("hdate <", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("hdate <=", value, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateIn(List<Date> values) {
            addCriterionForJDBCDate("hdate in", values, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("hdate not in", values, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hdate between", value1, value2, "hdate");
            return (Criteria) this;
        }

        public Criteria andHdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("hdate not between", value1, value2, "hdate");
            return (Criteria) this;
        }

        public Criteria andHcompanyIsNull() {
            addCriterion("hcompany is null");
            return (Criteria) this;
        }

        public Criteria andHcompanyIsNotNull() {
            addCriterion("hcompany is not null");
            return (Criteria) this;
        }

        public Criteria andHcompanyEqualTo(String value) {
            addCriterion("hcompany =", value, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyNotEqualTo(String value) {
            addCriterion("hcompany <>", value, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyGreaterThan(String value) {
            addCriterion("hcompany >", value, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("hcompany >=", value, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyLessThan(String value) {
            addCriterion("hcompany <", value, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyLessThanOrEqualTo(String value) {
            addCriterion("hcompany <=", value, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyLike(String value) {
            addCriterion("hcompany like", value, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyNotLike(String value) {
            addCriterion("hcompany not like", value, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyIn(List<String> values) {
            addCriterion("hcompany in", values, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyNotIn(List<String> values) {
            addCriterion("hcompany not in", values, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyBetween(String value1, String value2) {
            addCriterion("hcompany between", value1, value2, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHcompanyNotBetween(String value1, String value2) {
            addCriterion("hcompany not between", value1, value2, "hcompany");
            return (Criteria) this;
        }

        public Criteria andHdepartmentIsNull() {
            addCriterion("hdepartment is null");
            return (Criteria) this;
        }

        public Criteria andHdepartmentIsNotNull() {
            addCriterion("hdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andHdepartmentEqualTo(String value) {
            addCriterion("hdepartment =", value, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentNotEqualTo(String value) {
            addCriterion("hdepartment <>", value, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentGreaterThan(String value) {
            addCriterion("hdepartment >", value, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("hdepartment >=", value, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentLessThan(String value) {
            addCriterion("hdepartment <", value, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentLessThanOrEqualTo(String value) {
            addCriterion("hdepartment <=", value, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentLike(String value) {
            addCriterion("hdepartment like", value, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentNotLike(String value) {
            addCriterion("hdepartment not like", value, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentIn(List<String> values) {
            addCriterion("hdepartment in", values, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentNotIn(List<String> values) {
            addCriterion("hdepartment not in", values, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentBetween(String value1, String value2) {
            addCriterion("hdepartment between", value1, value2, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHdepartmentNotBetween(String value1, String value2) {
            addCriterion("hdepartment not between", value1, value2, "hdepartment");
            return (Criteria) this;
        }

        public Criteria andHgradeIsNull() {
            addCriterion("hgrade is null");
            return (Criteria) this;
        }

        public Criteria andHgradeIsNotNull() {
            addCriterion("hgrade is not null");
            return (Criteria) this;
        }

        public Criteria andHgradeEqualTo(String value) {
            addCriterion("hgrade =", value, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeNotEqualTo(String value) {
            addCriterion("hgrade <>", value, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeGreaterThan(String value) {
            addCriterion("hgrade >", value, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeGreaterThanOrEqualTo(String value) {
            addCriterion("hgrade >=", value, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeLessThan(String value) {
            addCriterion("hgrade <", value, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeLessThanOrEqualTo(String value) {
            addCriterion("hgrade <=", value, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeLike(String value) {
            addCriterion("hgrade like", value, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeNotLike(String value) {
            addCriterion("hgrade not like", value, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeIn(List<String> values) {
            addCriterion("hgrade in", values, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeNotIn(List<String> values) {
            addCriterion("hgrade not in", values, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeBetween(String value1, String value2) {
            addCriterion("hgrade between", value1, value2, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHgradeNotBetween(String value1, String value2) {
            addCriterion("hgrade not between", value1, value2, "hgrade");
            return (Criteria) this;
        }

        public Criteria andHlevelIsNull() {
            addCriterion("hlevel is null");
            return (Criteria) this;
        }

        public Criteria andHlevelIsNotNull() {
            addCriterion("hlevel is not null");
            return (Criteria) this;
        }

        public Criteria andHlevelEqualTo(String value) {
            addCriterion("hlevel =", value, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelNotEqualTo(String value) {
            addCriterion("hlevel <>", value, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelGreaterThan(String value) {
            addCriterion("hlevel >", value, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelGreaterThanOrEqualTo(String value) {
            addCriterion("hlevel >=", value, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelLessThan(String value) {
            addCriterion("hlevel <", value, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelLessThanOrEqualTo(String value) {
            addCriterion("hlevel <=", value, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelLike(String value) {
            addCriterion("hlevel like", value, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelNotLike(String value) {
            addCriterion("hlevel not like", value, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelIn(List<String> values) {
            addCriterion("hlevel in", values, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelNotIn(List<String> values) {
            addCriterion("hlevel not in", values, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelBetween(String value1, String value2) {
            addCriterion("hlevel between", value1, value2, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHlevelNotBetween(String value1, String value2) {
            addCriterion("hlevel not between", value1, value2, "hlevel");
            return (Criteria) this;
        }

        public Criteria andHtypeIsNull() {
            addCriterion("htype is null");
            return (Criteria) this;
        }

        public Criteria andHtypeIsNotNull() {
            addCriterion("htype is not null");
            return (Criteria) this;
        }

        public Criteria andHtypeEqualTo(String value) {
            addCriterion("htype =", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeNotEqualTo(String value) {
            addCriterion("htype <>", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeGreaterThan(String value) {
            addCriterion("htype >", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeGreaterThanOrEqualTo(String value) {
            addCriterion("htype >=", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeLessThan(String value) {
            addCriterion("htype <", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeLessThanOrEqualTo(String value) {
            addCriterion("htype <=", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeLike(String value) {
            addCriterion("htype like", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeNotLike(String value) {
            addCriterion("htype not like", value, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeIn(List<String> values) {
            addCriterion("htype in", values, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeNotIn(List<String> values) {
            addCriterion("htype not in", values, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeBetween(String value1, String value2) {
            addCriterion("htype between", value1, value2, "htype");
            return (Criteria) this;
        }

        public Criteria andHtypeNotBetween(String value1, String value2) {
            addCriterion("htype not between", value1, value2, "htype");
            return (Criteria) this;
        }

        public Criteria andKytypeIsNull() {
            addCriterion("kytype is null");
            return (Criteria) this;
        }

        public Criteria andKytypeIsNotNull() {
            addCriterion("kytype is not null");
            return (Criteria) this;
        }

        public Criteria andKytypeEqualTo(String value) {
            addCriterion("kytype =", value, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeNotEqualTo(String value) {
            addCriterion("kytype <>", value, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeGreaterThan(String value) {
            addCriterion("kytype >", value, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeGreaterThanOrEqualTo(String value) {
            addCriterion("kytype >=", value, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeLessThan(String value) {
            addCriterion("kytype <", value, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeLessThanOrEqualTo(String value) {
            addCriterion("kytype <=", value, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeLike(String value) {
            addCriterion("kytype like", value, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeNotLike(String value) {
            addCriterion("kytype not like", value, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeIn(List<String> values) {
            addCriterion("kytype in", values, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeNotIn(List<String> values) {
            addCriterion("kytype not in", values, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeBetween(String value1, String value2) {
            addCriterion("kytype between", value1, value2, "kytype");
            return (Criteria) this;
        }

        public Criteria andKytypeNotBetween(String value1, String value2) {
            addCriterion("kytype not between", value1, value2, "kytype");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlIsNull() {
            addCriterion("haccessory_url is null");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlIsNotNull() {
            addCriterion("haccessory_url is not null");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlEqualTo(String value) {
            addCriterion("haccessory_url =", value, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlNotEqualTo(String value) {
            addCriterion("haccessory_url <>", value, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlGreaterThan(String value) {
            addCriterion("haccessory_url >", value, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlGreaterThanOrEqualTo(String value) {
            addCriterion("haccessory_url >=", value, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlLessThan(String value) {
            addCriterion("haccessory_url <", value, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlLessThanOrEqualTo(String value) {
            addCriterion("haccessory_url <=", value, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlLike(String value) {
            addCriterion("haccessory_url like", value, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlNotLike(String value) {
            addCriterion("haccessory_url not like", value, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlIn(List<String> values) {
            addCriterion("haccessory_url in", values, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlNotIn(List<String> values) {
            addCriterion("haccessory_url not in", values, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlBetween(String value1, String value2) {
            addCriterion("haccessory_url between", value1, value2, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHaccessoryUrlNotBetween(String value1, String value2) {
            addCriterion("haccessory_url not between", value1, value2, "haccessoryUrl");
            return (Criteria) this;
        }

        public Criteria andHauditIsNull() {
            addCriterion("haudit is null");
            return (Criteria) this;
        }

        public Criteria andHauditIsNotNull() {
            addCriterion("haudit is not null");
            return (Criteria) this;
        }

        public Criteria andHauditEqualTo(Boolean value) {
            addCriterion("haudit =", value, "haudit");
            return (Criteria) this;
        }

        public Criteria andHauditNotEqualTo(Boolean value) {
            addCriterion("haudit <>", value, "haudit");
            return (Criteria) this;
        }

        public Criteria andHauditGreaterThan(Boolean value) {
            addCriterion("haudit >", value, "haudit");
            return (Criteria) this;
        }

        public Criteria andHauditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("haudit >=", value, "haudit");
            return (Criteria) this;
        }

        public Criteria andHauditLessThan(Boolean value) {
            addCriterion("haudit <", value, "haudit");
            return (Criteria) this;
        }

        public Criteria andHauditLessThanOrEqualTo(Boolean value) {
            addCriterion("haudit <=", value, "haudit");
            return (Criteria) this;
        }

        public Criteria andHauditIn(List<Boolean> values) {
            addCriterion("haudit in", values, "haudit");
            return (Criteria) this;
        }

        public Criteria andHauditNotIn(List<Boolean> values) {
            addCriterion("haudit not in", values, "haudit");
            return (Criteria) this;
        }

        public Criteria andHauditBetween(Boolean value1, Boolean value2) {
            addCriterion("haudit between", value1, value2, "haudit");
            return (Criteria) this;
        }

        public Criteria andHauditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("haudit not between", value1, value2, "haudit");
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