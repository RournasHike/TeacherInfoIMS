package com.mytest.teainfoims.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TPaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPaperExample() {
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

        public Criteria andPaidIsNull() {
            addCriterion("paid is null");
            return (Criteria) this;
        }

        public Criteria andPaidIsNotNull() {
            addCriterion("paid is not null");
            return (Criteria) this;
        }

        public Criteria andPaidEqualTo(Integer value) {
            addCriterion("paid =", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotEqualTo(Integer value) {
            addCriterion("paid <>", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidGreaterThan(Integer value) {
            addCriterion("paid >", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paid >=", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidLessThan(Integer value) {
            addCriterion("paid <", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidLessThanOrEqualTo(Integer value) {
            addCriterion("paid <=", value, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidIn(List<Integer> values) {
            addCriterion("paid in", values, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotIn(List<Integer> values) {
            addCriterion("paid not in", values, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidBetween(Integer value1, Integer value2) {
            addCriterion("paid between", value1, value2, "paid");
            return (Criteria) this;
        }

        public Criteria andPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("paid not between", value1, value2, "paid");
            return (Criteria) this;
        }

        public Criteria andPanoIsNull() {
            addCriterion("pano is null");
            return (Criteria) this;
        }

        public Criteria andPanoIsNotNull() {
            addCriterion("pano is not null");
            return (Criteria) this;
        }

        public Criteria andPanoEqualTo(String value) {
            addCriterion("pano =", value, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoNotEqualTo(String value) {
            addCriterion("pano <>", value, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoGreaterThan(String value) {
            addCriterion("pano >", value, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoGreaterThanOrEqualTo(String value) {
            addCriterion("pano >=", value, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoLessThan(String value) {
            addCriterion("pano <", value, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoLessThanOrEqualTo(String value) {
            addCriterion("pano <=", value, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoLike(String value) {
            addCriterion("pano like", value, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoNotLike(String value) {
            addCriterion("pano not like", value, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoIn(List<String> values) {
            addCriterion("pano in", values, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoNotIn(List<String> values) {
            addCriterion("pano not in", values, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoBetween(String value1, String value2) {
            addCriterion("pano between", value1, value2, "pano");
            return (Criteria) this;
        }

        public Criteria andPanoNotBetween(String value1, String value2) {
            addCriterion("pano not between", value1, value2, "pano");
            return (Criteria) this;
        }

        public Criteria andPanameIsNull() {
            addCriterion("paname is null");
            return (Criteria) this;
        }

        public Criteria andPanameIsNotNull() {
            addCriterion("paname is not null");
            return (Criteria) this;
        }

        public Criteria andPanameEqualTo(String value) {
            addCriterion("paname =", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotEqualTo(String value) {
            addCriterion("paname <>", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameGreaterThan(String value) {
            addCriterion("paname >", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameGreaterThanOrEqualTo(String value) {
            addCriterion("paname >=", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameLessThan(String value) {
            addCriterion("paname <", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameLessThanOrEqualTo(String value) {
            addCriterion("paname <=", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameLike(String value) {
            addCriterion("paname like", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotLike(String value) {
            addCriterion("paname not like", value, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameIn(List<String> values) {
            addCriterion("paname in", values, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotIn(List<String> values) {
            addCriterion("paname not in", values, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameBetween(String value1, String value2) {
            addCriterion("paname between", value1, value2, "paname");
            return (Criteria) this;
        }

        public Criteria andPanameNotBetween(String value1, String value2) {
            addCriterion("paname not between", value1, value2, "paname");
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

        public Criteria andPagradeIsNull() {
            addCriterion("pagrade is null");
            return (Criteria) this;
        }

        public Criteria andPagradeIsNotNull() {
            addCriterion("pagrade is not null");
            return (Criteria) this;
        }

        public Criteria andPagradeEqualTo(String value) {
            addCriterion("pagrade =", value, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeNotEqualTo(String value) {
            addCriterion("pagrade <>", value, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeGreaterThan(String value) {
            addCriterion("pagrade >", value, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeGreaterThanOrEqualTo(String value) {
            addCriterion("pagrade >=", value, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeLessThan(String value) {
            addCriterion("pagrade <", value, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeLessThanOrEqualTo(String value) {
            addCriterion("pagrade <=", value, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeLike(String value) {
            addCriterion("pagrade like", value, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeNotLike(String value) {
            addCriterion("pagrade not like", value, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeIn(List<String> values) {
            addCriterion("pagrade in", values, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeNotIn(List<String> values) {
            addCriterion("pagrade not in", values, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeBetween(String value1, String value2) {
            addCriterion("pagrade between", value1, value2, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPagradeNotBetween(String value1, String value2) {
            addCriterion("pagrade not between", value1, value2, "pagrade");
            return (Criteria) this;
        }

        public Criteria andPapublishIsNull() {
            addCriterion("papublish is null");
            return (Criteria) this;
        }

        public Criteria andPapublishIsNotNull() {
            addCriterion("papublish is not null");
            return (Criteria) this;
        }

        public Criteria andPapublishEqualTo(String value) {
            addCriterion("papublish =", value, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishNotEqualTo(String value) {
            addCriterion("papublish <>", value, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishGreaterThan(String value) {
            addCriterion("papublish >", value, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishGreaterThanOrEqualTo(String value) {
            addCriterion("papublish >=", value, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishLessThan(String value) {
            addCriterion("papublish <", value, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishLessThanOrEqualTo(String value) {
            addCriterion("papublish <=", value, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishLike(String value) {
            addCriterion("papublish like", value, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishNotLike(String value) {
            addCriterion("papublish not like", value, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishIn(List<String> values) {
            addCriterion("papublish in", values, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishNotIn(List<String> values) {
            addCriterion("papublish not in", values, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishBetween(String value1, String value2) {
            addCriterion("papublish between", value1, value2, "papublish");
            return (Criteria) this;
        }

        public Criteria andPapublishNotBetween(String value1, String value2) {
            addCriterion("papublish not between", value1, value2, "papublish");
            return (Criteria) this;
        }

        public Criteria andPadateIsNull() {
            addCriterion("padate is null");
            return (Criteria) this;
        }

        public Criteria andPadateIsNotNull() {
            addCriterion("padate is not null");
            return (Criteria) this;
        }

        public Criteria andPadateEqualTo(Date value) {
            addCriterionForJDBCDate("padate =", value, "padate");
            return (Criteria) this;
        }

        public Criteria andPadateNotEqualTo(Date value) {
            addCriterionForJDBCDate("padate <>", value, "padate");
            return (Criteria) this;
        }

        public Criteria andPadateGreaterThan(Date value) {
            addCriterionForJDBCDate("padate >", value, "padate");
            return (Criteria) this;
        }

        public Criteria andPadateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("padate >=", value, "padate");
            return (Criteria) this;
        }

        public Criteria andPadateLessThan(Date value) {
            addCriterionForJDBCDate("padate <", value, "padate");
            return (Criteria) this;
        }

        public Criteria andPadateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("padate <=", value, "padate");
            return (Criteria) this;
        }

        public Criteria andPadateIn(List<Date> values) {
            addCriterionForJDBCDate("padate in", values, "padate");
            return (Criteria) this;
        }

        public Criteria andPadateNotIn(List<Date> values) {
            addCriterionForJDBCDate("padate not in", values, "padate");
            return (Criteria) this;
        }

        public Criteria andPadateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("padate between", value1, value2, "padate");
            return (Criteria) this;
        }

        public Criteria andPadateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("padate not between", value1, value2, "padate");
            return (Criteria) this;
        }

        public Criteria andPakindIsNull() {
            addCriterion("pakind is null");
            return (Criteria) this;
        }

        public Criteria andPakindIsNotNull() {
            addCriterion("pakind is not null");
            return (Criteria) this;
        }

        public Criteria andPakindEqualTo(String value) {
            addCriterion("pakind =", value, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindNotEqualTo(String value) {
            addCriterion("pakind <>", value, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindGreaterThan(String value) {
            addCriterion("pakind >", value, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindGreaterThanOrEqualTo(String value) {
            addCriterion("pakind >=", value, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindLessThan(String value) {
            addCriterion("pakind <", value, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindLessThanOrEqualTo(String value) {
            addCriterion("pakind <=", value, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindLike(String value) {
            addCriterion("pakind like", value, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindNotLike(String value) {
            addCriterion("pakind not like", value, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindIn(List<String> values) {
            addCriterion("pakind in", values, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindNotIn(List<String> values) {
            addCriterion("pakind not in", values, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindBetween(String value1, String value2) {
            addCriterion("pakind between", value1, value2, "pakind");
            return (Criteria) this;
        }

        public Criteria andPakindNotBetween(String value1, String value2) {
            addCriterion("pakind not between", value1, value2, "pakind");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andLetternumIsNull() {
            addCriterion("letternum is null");
            return (Criteria) this;
        }

        public Criteria andLetternumIsNotNull() {
            addCriterion("letternum is not null");
            return (Criteria) this;
        }

        public Criteria andLetternumEqualTo(Integer value) {
            addCriterion("letternum =", value, "letternum");
            return (Criteria) this;
        }

        public Criteria andLetternumNotEqualTo(Integer value) {
            addCriterion("letternum <>", value, "letternum");
            return (Criteria) this;
        }

        public Criteria andLetternumGreaterThan(Integer value) {
            addCriterion("letternum >", value, "letternum");
            return (Criteria) this;
        }

        public Criteria andLetternumGreaterThanOrEqualTo(Integer value) {
            addCriterion("letternum >=", value, "letternum");
            return (Criteria) this;
        }

        public Criteria andLetternumLessThan(Integer value) {
            addCriterion("letternum <", value, "letternum");
            return (Criteria) this;
        }

        public Criteria andLetternumLessThanOrEqualTo(Integer value) {
            addCriterion("letternum <=", value, "letternum");
            return (Criteria) this;
        }

        public Criteria andLetternumIn(List<Integer> values) {
            addCriterion("letternum in", values, "letternum");
            return (Criteria) this;
        }

        public Criteria andLetternumNotIn(List<Integer> values) {
            addCriterion("letternum not in", values, "letternum");
            return (Criteria) this;
        }

        public Criteria andLetternumBetween(Integer value1, Integer value2) {
            addCriterion("letternum between", value1, value2, "letternum");
            return (Criteria) this;
        }

        public Criteria andLetternumNotBetween(Integer value1, Integer value2) {
            addCriterion("letternum not between", value1, value2, "letternum");
            return (Criteria) this;
        }

        public Criteria andPubYearIsNull() {
            addCriterion("pub_year is null");
            return (Criteria) this;
        }

        public Criteria andPubYearIsNotNull() {
            addCriterion("pub_year is not null");
            return (Criteria) this;
        }

        public Criteria andPubYearEqualTo(Integer value) {
            addCriterion("pub_year =", value, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubYearNotEqualTo(Integer value) {
            addCriterion("pub_year <>", value, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubYearGreaterThan(Integer value) {
            addCriterion("pub_year >", value, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("pub_year >=", value, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubYearLessThan(Integer value) {
            addCriterion("pub_year <", value, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubYearLessThanOrEqualTo(Integer value) {
            addCriterion("pub_year <=", value, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubYearIn(List<Integer> values) {
            addCriterion("pub_year in", values, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubYearNotIn(List<Integer> values) {
            addCriterion("pub_year not in", values, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubYearBetween(Integer value1, Integer value2) {
            addCriterion("pub_year between", value1, value2, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubYearNotBetween(Integer value1, Integer value2) {
            addCriterion("pub_year not between", value1, value2, "pubYear");
            return (Criteria) this;
        }

        public Criteria andPubVolumeIsNull() {
            addCriterion("pub_volume is null");
            return (Criteria) this;
        }

        public Criteria andPubVolumeIsNotNull() {
            addCriterion("pub_volume is not null");
            return (Criteria) this;
        }

        public Criteria andPubVolumeEqualTo(Integer value) {
            addCriterion("pub_volume =", value, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubVolumeNotEqualTo(Integer value) {
            addCriterion("pub_volume <>", value, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubVolumeGreaterThan(Integer value) {
            addCriterion("pub_volume >", value, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pub_volume >=", value, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubVolumeLessThan(Integer value) {
            addCriterion("pub_volume <", value, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("pub_volume <=", value, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubVolumeIn(List<Integer> values) {
            addCriterion("pub_volume in", values, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubVolumeNotIn(List<Integer> values) {
            addCriterion("pub_volume not in", values, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubVolumeBetween(Integer value1, Integer value2) {
            addCriterion("pub_volume between", value1, value2, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("pub_volume not between", value1, value2, "pubVolume");
            return (Criteria) this;
        }

        public Criteria andPubStageIsNull() {
            addCriterion("pub_stage is null");
            return (Criteria) this;
        }

        public Criteria andPubStageIsNotNull() {
            addCriterion("pub_stage is not null");
            return (Criteria) this;
        }

        public Criteria andPubStageEqualTo(Integer value) {
            addCriterion("pub_stage =", value, "pubStage");
            return (Criteria) this;
        }

        public Criteria andPubStageNotEqualTo(Integer value) {
            addCriterion("pub_stage <>", value, "pubStage");
            return (Criteria) this;
        }

        public Criteria andPubStageGreaterThan(Integer value) {
            addCriterion("pub_stage >", value, "pubStage");
            return (Criteria) this;
        }

        public Criteria andPubStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("pub_stage >=", value, "pubStage");
            return (Criteria) this;
        }

        public Criteria andPubStageLessThan(Integer value) {
            addCriterion("pub_stage <", value, "pubStage");
            return (Criteria) this;
        }

        public Criteria andPubStageLessThanOrEqualTo(Integer value) {
            addCriterion("pub_stage <=", value, "pubStage");
            return (Criteria) this;
        }

        public Criteria andPubStageIn(List<Integer> values) {
            addCriterion("pub_stage in", values, "pubStage");
            return (Criteria) this;
        }

        public Criteria andPubStageNotIn(List<Integer> values) {
            addCriterion("pub_stage not in", values, "pubStage");
            return (Criteria) this;
        }

        public Criteria andPubStageBetween(Integer value1, Integer value2) {
            addCriterion("pub_stage between", value1, value2, "pubStage");
            return (Criteria) this;
        }

        public Criteria andPubStageNotBetween(Integer value1, Integer value2) {
            addCriterion("pub_stage not between", value1, value2, "pubStage");
            return (Criteria) this;
        }

        public Criteria andDependencyIsNull() {
            addCriterion("dependency is null");
            return (Criteria) this;
        }

        public Criteria andDependencyIsNotNull() {
            addCriterion("dependency is not null");
            return (Criteria) this;
        }

        public Criteria andDependencyEqualTo(String value) {
            addCriterion("dependency =", value, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyNotEqualTo(String value) {
            addCriterion("dependency <>", value, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyGreaterThan(String value) {
            addCriterion("dependency >", value, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyGreaterThanOrEqualTo(String value) {
            addCriterion("dependency >=", value, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyLessThan(String value) {
            addCriterion("dependency <", value, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyLessThanOrEqualTo(String value) {
            addCriterion("dependency <=", value, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyLike(String value) {
            addCriterion("dependency like", value, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyNotLike(String value) {
            addCriterion("dependency not like", value, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyIn(List<String> values) {
            addCriterion("dependency in", values, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyNotIn(List<String> values) {
            addCriterion("dependency not in", values, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyBetween(String value1, String value2) {
            addCriterion("dependency between", value1, value2, "dependency");
            return (Criteria) this;
        }

        public Criteria andDependencyNotBetween(String value1, String value2) {
            addCriterion("dependency not between", value1, value2, "dependency");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryIsNull() {
            addCriterion("paccesssory is null");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryIsNotNull() {
            addCriterion("paccesssory is not null");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryEqualTo(String value) {
            addCriterion("paccesssory =", value, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryNotEqualTo(String value) {
            addCriterion("paccesssory <>", value, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryGreaterThan(String value) {
            addCriterion("paccesssory >", value, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryGreaterThanOrEqualTo(String value) {
            addCriterion("paccesssory >=", value, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryLessThan(String value) {
            addCriterion("paccesssory <", value, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryLessThanOrEqualTo(String value) {
            addCriterion("paccesssory <=", value, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryLike(String value) {
            addCriterion("paccesssory like", value, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryNotLike(String value) {
            addCriterion("paccesssory not like", value, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryIn(List<String> values) {
            addCriterion("paccesssory in", values, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryNotIn(List<String> values) {
            addCriterion("paccesssory not in", values, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryBetween(String value1, String value2) {
            addCriterion("paccesssory between", value1, value2, "paccesssory");
            return (Criteria) this;
        }

        public Criteria andPaccesssoryNotBetween(String value1, String value2) {
            addCriterion("paccesssory not between", value1, value2, "paccesssory");
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

        public Criteria andParemarkIsNull() {
            addCriterion("paremark is null");
            return (Criteria) this;
        }

        public Criteria andParemarkIsNotNull() {
            addCriterion("paremark is not null");
            return (Criteria) this;
        }

        public Criteria andParemarkEqualTo(String value) {
            addCriterion("paremark =", value, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkNotEqualTo(String value) {
            addCriterion("paremark <>", value, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkGreaterThan(String value) {
            addCriterion("paremark >", value, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkGreaterThanOrEqualTo(String value) {
            addCriterion("paremark >=", value, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkLessThan(String value) {
            addCriterion("paremark <", value, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkLessThanOrEqualTo(String value) {
            addCriterion("paremark <=", value, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkLike(String value) {
            addCriterion("paremark like", value, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkNotLike(String value) {
            addCriterion("paremark not like", value, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkIn(List<String> values) {
            addCriterion("paremark in", values, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkNotIn(List<String> values) {
            addCriterion("paremark not in", values, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkBetween(String value1, String value2) {
            addCriterion("paremark between", value1, value2, "paremark");
            return (Criteria) this;
        }

        public Criteria andParemarkNotBetween(String value1, String value2) {
            addCriterion("paremark not between", value1, value2, "paremark");
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