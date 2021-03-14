package com.mytest.teainfoims.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TPaper {
    private Integer paid;

    private String pano;

    private String paname;

    private Integer tid;

    private String teacherName;

    private String pagrade;

    private String papublish;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date padate;

    private String pakind;

    private String subject;

    private String content;

    private Integer letternum;

    private Integer pubYear;

    private Integer pubVolume;

    private Integer pubStage;

    private String dependency;

    private String paccesssory;

    private Boolean paudit;

    private String message;

    private String paremark;

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public String getPano() {
        return pano;
    }

    public void setPano(String pano) {
        this.pano = pano == null ? null : pano.trim();
    }

    public String getPaname() {
        return paname;
    }

    public void setPaname(String paname) {
        this.paname = paname == null ? null : paname.trim();
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

    public String getPagrade() {
        return pagrade;
    }

    public void setPagrade(String pagrade) {
        this.pagrade = pagrade == null ? null : pagrade.trim();
    }

    public String getPapublish() {
        return papublish;
    }

    public void setPapublish(String papublish) {
        this.papublish = papublish == null ? null : papublish.trim();
    }

    public Date getPadate() {
        return padate;
    }

    public void setPadate(Date padate) {
        this.padate = padate;
    }

    public String getPakind() {
        return pakind;
    }

    public void setPakind(String pakind) {
        this.pakind = pakind == null ? null : pakind.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getLetternum() {
        return letternum;
    }

    public void setLetternum(Integer letternum) {
        this.letternum = letternum;
    }

    public Integer getPubYear() {
        return pubYear;
    }

    public void setPubYear(Integer pubYear) {
        this.pubYear = pubYear;
    }

    public Integer getPubVolume() {
        return pubVolume;
    }

    public void setPubVolume(Integer pubVolume) {
        this.pubVolume = pubVolume;
    }

    public Integer getPubStage() {
        return pubStage;
    }

    public void setPubStage(Integer pubStage) {
        this.pubStage = pubStage;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency == null ? null : dependency.trim();
    }

    public String getPaccesssory() {
        return paccesssory;
    }

    public void setPaccesssory(String paccesssory) {
        this.paccesssory = paccesssory == null ? null : paccesssory.trim();
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

    public String getParemark() {
        return paremark;
    }

    public void setParemark(String paremark) {
        this.paremark = paremark == null ? null : paremark.trim();
    }
}