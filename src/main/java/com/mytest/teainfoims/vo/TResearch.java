package com.mytest.teainfoims.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TResearch {
    private Integer id;

    private String researchTitle;

    private Integer tid;

    private String teacherName;

    private String retype;

    private String scontent;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date starttime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endtime;

    private Boolean restate;

    private Boolean paudit;

    private String paccessory;

    private String message;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResearchTitle() {
        return researchTitle;
    }

    public void setResearchTitle(String researchTitle) {
        this.researchTitle = researchTitle == null ? null : researchTitle.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getRetype() {
        return retype;
    }

    public void setRetype(String retype) {
        this.retype = retype == null ? null : retype.trim();
    }

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent == null ? null : scontent.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Boolean getRestate() {
        return restate;
    }

    public void setRestate(Boolean restate) {
        this.restate = restate;
    }

    public Boolean getPaudit() {
        return paudit;
    }

    public void setPaudit(Boolean paudit) {
        this.paudit = paudit;
    }

    public String getPaccessory() {
        return paccessory;
    }

    public void setPaccessory(String paccessory) {
        this.paccessory = paccessory == null ? null : paccessory.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}