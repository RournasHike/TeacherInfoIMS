package com.mytest.teainfoims.query;

import com.mytest.teainfoims.query.base.BaseQuery;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/10
 */
public class PatentQuery extends BaseQuery {
    private String teacherName;
    private String patname;
    private Boolean paudit;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname;
    }

    public Boolean getPaudit() {
        return paudit;
    }

    public void setPaudit(Boolean paudit) {
        this.paudit = paudit;
    }
}
