package com.mytest.teainfoims.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class THonor {
    private Integer hid;

    private String hno;

    private Integer tid;

    private String teacherName;

    private String hname;

    private String participants;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hdate;

    private String hcompany;

    private String hdepartment;

    private String hgrade;

    private String hlevel;

    private String htype;

    private String kytype;

    private String haccessoryUrl;

    private Boolean haudit;

    private String message;

    private String remark;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno == null ? null : hno.trim();
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

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants == null ? null : participants.trim();
    }

    public Date getHdate() {
        return hdate;
    }

    public void setHdate(Date hdate) {
        this.hdate = hdate;
    }

    public String getHcompany() {
        return hcompany;
    }

    public void setHcompany(String hcompany) {
        this.hcompany = hcompany == null ? null : hcompany.trim();
    }

    public String getHdepartment() {
        return hdepartment;
    }

    public void setHdepartment(String hdepartment) {
        this.hdepartment = hdepartment == null ? null : hdepartment.trim();
    }

    public String getHgrade() {
        return hgrade;
    }

    public void setHgrade(String hgrade) {
        this.hgrade = hgrade == null ? null : hgrade.trim();
    }

    public String getHlevel() {
        return hlevel;
    }

    public void setHlevel(String hlevel) {
        this.hlevel = hlevel == null ? null : hlevel.trim();
    }

    public String getHtype() {
        return htype;
    }

    public void setHtype(String htype) {
        this.htype = htype == null ? null : htype.trim();
    }

    public String getKytype() {
        return kytype;
    }

    public void setKytype(String kytype) {
        this.kytype = kytype == null ? null : kytype.trim();
    }

    public String getHaccessoryUrl() {
        return haccessoryUrl;
    }

    public void setHaccessoryUrl(String haccessoryUrl) {
        this.haccessoryUrl = haccessoryUrl == null ? null : haccessoryUrl.trim();
    }

    public Boolean getHaudit() {
        return haudit;
    }

    public void setHaudit(Boolean haudit) {
        this.haudit = haudit;
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