package com.mytest.teainfoims.query;

import com.mytest.teainfoims.query.base.BaseQuery;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/28
 */
public class ScheduleQuery extends BaseQuery {
    private String teacherName;
    private Integer rid;
    private String classYear;
    private String classTerm;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public String getClassTerm() {
        return classTerm;
    }

    public void setClassTerm(String classTerm) {
        this.classTerm = classTerm;
    }
}
