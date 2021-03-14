package com.mytest.teainfoims.query;

import com.mytest.teainfoims.query.base.BaseQuery;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/7
 */
public class HonorQuery extends BaseQuery {
    private String teacherName;
    private String hname;
    private Boolean haudit;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public Boolean getHaudit() {
        return haudit;
    }

    public void setHaudit(Boolean haudit) {
        this.haudit = haudit;
    }
}
