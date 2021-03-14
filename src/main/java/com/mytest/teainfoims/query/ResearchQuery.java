package com.mytest.teainfoims.query;

import com.mytest.teainfoims.query.base.BaseQuery;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/10
 */
public class ResearchQuery extends BaseQuery {
    private String teacherName;
    private String researchTitle;
    private Boolean paudit;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getResearchTitle() {
        return researchTitle;
    }

    public void setResearchTitle(String researchTitle) {
        this.researchTitle = researchTitle;
    }

    public Boolean getPaudit() {
        return paudit;
    }

    public void setPaudit(Boolean paudit) {
        this.paudit = paudit;
    }
}
