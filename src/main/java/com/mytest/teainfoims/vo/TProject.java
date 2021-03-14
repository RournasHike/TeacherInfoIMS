package com.mytest.teainfoims.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TProject {
    private Integer pid;

    private String pno;

    private String pname;

    private Integer tid;

    private String teacherName;

    private String pgrade;

    private String pkind;

    private Double pfunds;

    private String participants;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pstatime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pendtime;

    private Boolean pcondition;

    private String psource;

    private String paccessory;

    private String kytype;

    private String result;

    private Boolean paudit;

    private String message;

    private String premark;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno == null ? null : pno.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
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

    public String getPgrade() {
        return pgrade;
    }

    public void setPgrade(String pgrade) {
        this.pgrade = pgrade == null ? null : pgrade.trim();
    }

    public String getPkind() {
        return pkind;
    }

    public void setPkind(String pkind) {
        this.pkind = pkind == null ? null : pkind.trim();
    }

    public Double getPfunds() {
        return pfunds;
    }

    public void setPfunds(Double pfunds) {
        this.pfunds = pfunds;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        this.participants = participants == null ? null : participants.trim();
    }

    public Date getPstatime() {
        return pstatime;
    }

    public void setPstatime(Date pstatime) {
        this.pstatime = pstatime;
    }

    public Date getPendtime() {
        return pendtime;
    }

    public void setPendtime(Date pendtime) {
        this.pendtime = pendtime;
    }

    public Boolean getPcondition() {
        return pcondition;
    }

    public void setPcondition(Boolean pcondition) {
        this.pcondition = pcondition;
    }

    public String getPsource() {
        return psource;
    }

    public void setPsource(String psource) {
        this.psource = psource == null ? null : psource.trim();
    }

    public String getPaccessory() {
        return paccessory;
    }

    public void setPaccessory(String paccessory) {
        this.paccessory = paccessory == null ? null : paccessory.trim();
    }

    public String getKytype() {
        return kytype;
    }

    public void setKytype(String kytype) {
        this.kytype = kytype == null ? null : kytype.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
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

    public String getPremark() {
        return premark;
    }

    public void setPremark(String premark) {
        this.premark = premark == null ? null : premark.trim();
    }
}