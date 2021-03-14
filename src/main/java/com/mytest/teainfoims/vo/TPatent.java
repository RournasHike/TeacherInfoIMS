package com.mytest.teainfoims.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TPatent {
    private Integer patid;

    private String patno;

    private String patname;

    private Integer tid;

    private String teacherName;

    private String participants;

    private String patsn;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date patappdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date patendate;

    private String patgrade;

    private String pattype;

    private String paccessory;

    private Boolean paudit;

    private String message;

    private String remark;

    public Integer getPatid() {
        return patid;
    }

    public void setPatid(Integer patid) {
        this.patid = patid;
    }

    public String getPatno() {
        return patno;
    }

    public void setPatno(String patno) {
        this.patno = patno == null ? null : patno.trim();
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname == null ? null : patname.trim();
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

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants == null ? null : participants.trim();
    }

    public String getPatsn() {
        return patsn;
    }

    public void setPatsn(String patsn) {
        this.patsn = patsn == null ? null : patsn.trim();
    }

    public Date getPatappdate() {
        return patappdate;
    }

    public void setPatappdate(Date patappdate) {
        this.patappdate = patappdate;
    }

    public Date getPatendate() {
        return patendate;
    }

    public void setPatendate(Date patendate) {
        this.patendate = patendate;
    }

    public String getPatgrade() {
        return patgrade;
    }

    public void setPatgrade(String patgrade) {
        this.patgrade = patgrade == null ? null : patgrade.trim();
    }

    public String getPattype() {
        return pattype;
    }

    public void setPattype(String pattype) {
        this.pattype = pattype == null ? null : pattype.trim();
    }

    public String getPaccessory() {
        return paccessory;
    }

    public void setPaccessory(String paccessory) {
        this.paccessory = paccessory == null ? null : paccessory.trim();
    }

    public Boolean getPaudit() {
        return paudit;
    }

    public void setPaudit(Boolean paudit) {
        this.paudit = paudit;
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