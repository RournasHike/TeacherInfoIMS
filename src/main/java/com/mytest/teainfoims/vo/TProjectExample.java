package com.mytest.teainfoims.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProjectExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnoIsNull() {
            addCriterion("pno is null");
            return (Criteria) this;
        }

        public Criteria andPnoIsNotNull() {
            addCriterion("pno is not null");
            return (Criteria) this;
        }

        public Criteria andPnoEqualTo(String value) {
            addCriterion("pno =", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotEqualTo(String value) {
            addCriterion("pno <>", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThan(String value) {
            addCriterion("pno >", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoGreaterThanOrEqualTo(String value) {
            addCriterion("pno >=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThan(String value) {
            addCriterion("pno <", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLessThanOrEqualTo(String value) {
            addCriterion("pno <=", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoLike(String value) {
            addCriterion("pno like", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotLike(String value) {
            addCriterion("pno not like", value, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoIn(List<String> values) {
            addCriterion("pno in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotIn(List<String> values) {
            addCriterion("pno not in", values, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoBetween(String value1, String value2) {
            addCriterion("pno between", value1, value2, "pno");
            return (Criteria) this;
        }

        public Criteria andPnoNotBetween(String value1, String value2) {
            addCriterion("pno not between", value1, value2, "pno");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
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

        public Criteria andPgradeIsNull() {
            addCriterion("pgrade is null");
            return (Criteria) this;
        }

        public Criteria andPgradeIsNotNull() {
            addCriterion("pgrade is not null");
            return (Criteria) this;
        }

        public Criteria andPgradeEqualTo(String value) {
            addCriterion("pgrade =", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotEqualTo(String value) {
            addCriterion("pgrade <>", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeGreaterThan(String value) {
            addCriterion("pgrade >", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeGreaterThanOrEqualTo(String value) {
            addCriterion("pgrade >=", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLessThan(String value) {
            addCriterion("pgrade <", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLessThanOrEqualTo(String value) {
            addCriterion("pgrade <=", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeLike(String value) {
            addCriterion("pgrade like", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotLike(String value) {
            addCriterion("pgrade not like", value, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeIn(List<String> values) {
            addCriterion("pgrade in", values, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotIn(List<String> values) {
            addCriterion("pgrade not in", values, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeBetween(String value1, String value2) {
            addCriterion("pgrade between", value1, value2, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPgradeNotBetween(String value1, String value2) {
            addCriterion("pgrade not between", value1, value2, "pgrade");
            return (Criteria) this;
        }

        public Criteria andPkindIsNull() {
            addCriterion("pkind is null");
            return (Criteria) this;
        }

        public Criteria andPkindIsNotNull() {
            addCriterion("pkind is not null");
            return (Criteria) this;
        }

        public Criteria andPkindEqualTo(String value) {
            addCriterion("pkind =", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindNotEqualTo(String value) {
            addCriterion("pkind <>", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindGreaterThan(String value) {
            addCriterion("pkind >", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindGreaterThanOrEqualTo(String value) {
            addCriterion("pkind >=", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindLessThan(String value) {
            addCriterion("pkind <", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindLessThanOrEqualTo(String value) {
            addCriterion("pkind <=", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindLike(String value) {
            addCriterion("pkind like", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindNotLike(String value) {
            addCriterion("pkind not like", value, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindIn(List<String> values) {
            addCriterion("pkind in", values, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindNotIn(List<String> values) {
            addCriterion("pkind not in", values, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindBetween(String value1, String value2) {
            addCriterion("pkind between", value1, value2, "pkind");
            return (Criteria) this;
        }

        public Criteria andPkindNotBetween(String value1, String value2) {
            addCriterion("pkind not between", value1, value2, "pkind");
            return (Criteria) this;
        }

        public Criteria andPfundsIsNull() {
            addCriterion("pfunds is null");
            return (Criteria) this;
        }

        public Criteria andPfundsIsNotNull() {
            addCriterion("pfunds is not null");
            return (Criteria) this;
        }

        public Criteria andPfundsEqualTo(Double value) {
            addCriterion("pfunds =", value, "pfunds");
            return (Criteria) this;
        }

        public Criteria andPfundsNotEqualTo(Double value) {
            addCriterion("pfunds <>", value, "pfunds");
            return (Criteria) this;
        }

        public Criteria andPfundsGreaterThan(Double value) {
            addCriterion("pfunds >", value, "pfunds");
            return (Criteria) this;
        }

        public Criteria andPfundsGreaterThanOrEqualTo(Double value) {
            addCriterion("pfunds >=", value, "pfunds");
            return (Criteria) this;
        }

        public Criteria andPfundsLessThan(Double value) {
            addCriterion("pfunds <", value, "pfunds");
            return (Criteria) this;
        }

        public Criteria andPfundsLessThanOrEqualTo(Double value) {
            addCriterion("pfunds <=", value, "pfunds");
            return (Criteria) this;
        }

        public Criteria andPfundsIn(List<Double> values) {
            addCriterion("pfunds in", values, "pfunds");
            return (Criteria) this;
        }

        public Criteria andPfundsNotIn(List<Double> values) {
            addCriterion("pfunds not in", values, "pfunds");
            return (Criteria) this;
        }

        public Criteria andPfundsBetween(Double value1, Double value2) {
            addCriterion("pfunds between", value1, value2, "pfunds");
            return (Criteria) this;
        }

        public Criteria andPfundsNotBetween(Double value1, Double value2) {
            addCriterion("pfunds not between", value1, value2, "pfunds");
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

        public Criteria andPstatimeIsNull() {
            addCriterion("pstatime is null");
            return (Criteria) this;
        }

        public Criteria andPstatimeIsNotNull() {
            addCriterion("pstatime is not null");
            return (Criteria) this;
        }

        public Criteria andPstatimeEqualTo(Date value) {
            addCriterionForJDBCDate("pstatime =", value, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPstatimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pstatime <>", value, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPstatimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pstatime >", value, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPstatimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pstatime >=", value, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPstatimeLessThan(Date value) {
            addCriterionForJDBCDate("pstatime <", value, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPstatimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pstatime <=", value, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPstatimeIn(List<Date> values) {
            addCriterionForJDBCDate("pstatime in", values, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPstatimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pstatime not in", values, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPstatimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pstatime between", value1, value2, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPstatimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pstatime not between", value1, value2, "pstatime");
            return (Criteria) this;
        }

        public Criteria andPendtimeIsNull() {
            addCriterion("pendtime is null");
            return (Criteria) this;
        }

        public Criteria andPendtimeIsNotNull() {
            addCriterion("pendtime is not null");
            return (Criteria) this;
        }

        public Criteria andPendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("pendtime =", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pendtime <>", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pendtime >", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pendtime >=", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeLessThan(Date value) {
            addCriterionForJDBCDate("pendtime <", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pendtime <=", value, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("pendtime in", values, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pendtime not in", values, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pendtime between", value1, value2, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pendtime not between", value1, value2, "pendtime");
            return (Criteria) this;
        }

        public Criteria andPconditionIsNull() {
            addCriterion("pcondition is null");
            return (Criteria) this;
        }

        public Criteria andPconditionIsNotNull() {
            addCriterion("pcondition is not null");
            return (Criteria) this;
        }

        public Criteria andPconditionEqualTo(Boolean value) {
            addCriterion("pcondition =", value, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPconditionNotEqualTo(Boolean value) {
            addCriterion("pcondition <>", value, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPconditionGreaterThan(Boolean value) {
            addCriterion("pcondition >", value, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPconditionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pcondition >=", value, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPconditionLessThan(Boolean value) {
            addCriterion("pcondition <", value, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPconditionLessThanOrEqualTo(Boolean value) {
            addCriterion("pcondition <=", value, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPconditionIn(List<Boolean> values) {
            addCriterion("pcondition in", values, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPconditionNotIn(List<Boolean> values) {
            addCriterion("pcondition not in", values, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPconditionBetween(Boolean value1, Boolean value2) {
            addCriterion("pcondition between", value1, value2, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPconditionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pcondition not between", value1, value2, "pcondition");
            return (Criteria) this;
        }

        public Criteria andPsourceIsNull() {
            addCriterion("psource is null");
            return (Criteria) this;
        }

        public Criteria andPsourceIsNotNull() {
            addCriterion("psource is not null");
            return (Criteria) this;
        }

        public Criteria andPsourceEqualTo(String value) {
            addCriterion("psource =", value, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceNotEqualTo(String value) {
            addCriterion("psource <>", value, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceGreaterThan(String value) {
            addCriterion("psource >", value, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceGreaterThanOrEqualTo(String value) {
            addCriterion("psource >=", value, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceLessThan(String value) {
            addCriterion("psource <", value, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceLessThanOrEqualTo(String value) {
            addCriterion("psource <=", value, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceLike(String value) {
            addCriterion("psource like", value, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceNotLike(String value) {
            addCriterion("psource not like", value, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceIn(List<String> values) {
            addCriterion("psource in", values, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceNotIn(List<String> values) {
            addCriterion("psource not in", values, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceBetween(String value1, String value2) {
            addCriterion("psource between", value1, value2, "psource");
            return (Criteria) this;
        }

        public Criteria andPsourceNotBetween(String value1, String value2) {
            addCriterion("psource not between", value1, value2, "psource");
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

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
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

        public Criteria andPremarkIsNull() {
            addCriterion("premark is null");
            return (Criteria) this;
        }

        public Criteria andPremarkIsNotNull() {
            addCriterion("premark is not null");
            return (Criteria) this;
        }

        public Criteria andPremarkEqualTo(String value) {
            addCriterion("premark =", value, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkNotEqualTo(String value) {
            addCriterion("premark <>", value, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkGreaterThan(String value) {
            addCriterion("premark >", value, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkGreaterThanOrEqualTo(String value) {
            addCriterion("premark >=", value, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkLessThan(String value) {
            addCriterion("premark <", value, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkLessThanOrEqualTo(String value) {
            addCriterion("premark <=", value, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkLike(String value) {
            addCriterion("premark like", value, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkNotLike(String value) {
            addCriterion("premark not like", value, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkIn(List<String> values) {
            addCriterion("premark in", values, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkNotIn(List<String> values) {
            addCriterion("premark not in", values, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkBetween(String value1, String value2) {
            addCriterion("premark between", value1, value2, "premark");
            return (Criteria) this;
        }

        public Criteria andPremarkNotBetween(String value1, String value2) {
            addCriterion("premark not between", value1, value2, "premark");
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