package com.mytest.teainfoims.query;

import com.mytest.teainfoims.query.base.BaseQuery;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/20
 */
public class TeachQuery extends BaseQuery {
    private String teacherName;

    private String teachClassYear;

    private String teachClassTerm;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeachClassYear() {
        return teachClassYear;
    }

    public void setTeachClassYear(String teachClassYear) {
        this.teachClassYear = teachClassYear;
    }

    public String getTeachClassTerm() {
        return teachClassTerm;
    }

    public void setTeachClassTerm(String teachClassTerm) {
        this.teachClassTerm = teachClassTerm;
    }
}
