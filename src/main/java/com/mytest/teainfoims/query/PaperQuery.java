package com.mytest.teainfoims.query;

import com.mytest.teainfoims.query.base.BaseQuery;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/10
 */
public class PaperQuery extends BaseQuery {
    private String teacherName;
    private String paname;
    private Boolean paudit;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getPaname() {
        return paname;
    }

    public void setPaname(String paname) {
        this.paname = paname;
    }

    public Boolean getPaudit() {
        return paudit;
    }

    public void setPaudit(Boolean paudit) {
        this.paudit = paudit;
    }
}
