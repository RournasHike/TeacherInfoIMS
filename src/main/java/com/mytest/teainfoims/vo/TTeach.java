package com.mytest.teainfoims.vo;

public class TTeach {
    private Integer id;

    private Integer tid;

    private Integer cid;

    private Integer sid;

    private String teacherName;

    private String courseName;

    private String teachRoomName;

    private String teachType;

    private String teachClassYear;

    private String teachClassTerm;

    private String teachGrade;

    private String teachMajor;

    private String startCollege;

    private String startDept;

    private Integer prescribedClassHour;

    private Integer actualClassHour;

    private Integer actualTeachClassHour;

    private Integer actualExperimentClassHour;

    private Integer actualComputerClassHour;

    private Integer actualOtherClassHour;

    private Integer actualSumupClassHour;

    private Boolean auditState;

    private String message;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getTeachRoomName() {
        return teachRoomName;
    }

    public void setTeachRoomName(String teachRoomName) {
        this.teachRoomName = teachRoomName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeachType() {
        return teachType;
    }

    public void setTeachType(String teachType) {
        this.teachType = teachType == null ? null : teachType.trim();
    }

    public String getTeachClassYear() {
        return teachClassYear;
    }

    public void setTeachClassYear(String teachClassYear) {
        this.teachClassYear = teachClassYear == null ? null : teachClassYear.trim();
    }

    public String getTeachClassTerm() {
        return teachClassTerm;
    }

    public void setTeachClassTerm(String teachClassTerm) {
        this.teachClassTerm = teachClassTerm == null ? null : teachClassTerm.trim();
    }

    public String getTeachGrade() {
        return teachGrade;
    }

    public void setTeachGrade(String teachGrade) {
        this.teachGrade = teachGrade == null ? null : teachGrade.trim();
    }

    public String getTeachMajor() {
        return teachMajor;
    }

    public void setTeachMajor(String teachMajor) {
        this.teachMajor = teachMajor == null ? null : teachMajor.trim();
    }

    public String getStartCollege() {
        return startCollege;
    }

    public void setStartCollege(String startCollege) {
        this.startCollege = startCollege == null ? null : startCollege.trim();
    }

    public String getStartDept() {
        return startDept;
    }

    public void setStartDept(String startDept) {
        this.startDept = startDept == null ? null : startDept.trim();
    }

    public Integer getPrescribedClassHour() {
        return prescribedClassHour;
    }

    public void setPrescribedClassHour(Integer prescribedClassHour) {
        this.prescribedClassHour = prescribedClassHour;
    }

    public Integer getActualClassHour() {
        return actualClassHour;
    }

    public void setActualClassHour(Integer actualClassHour) {
        this.actualClassHour = actualClassHour;
    }

    public Integer getActualTeachClassHour() {
        return actualTeachClassHour;
    }

    public void setActualTeachClassHour(Integer actualTeachClassHour) {
        this.actualTeachClassHour = actualTeachClassHour;
    }

    public Integer getActualExperimentClassHour() {
        return actualExperimentClassHour;
    }

    public void setActualExperimentClassHour(Integer actualExperimentClassHour) {
        this.actualExperimentClassHour = actualExperimentClassHour;
    }

    public Integer getActualComputerClassHour() {
        return actualComputerClassHour;
    }

    public void setActualComputerClassHour(Integer actualComputerClassHour) {
        this.actualComputerClassHour = actualComputerClassHour;
    }

    public Integer getActualOtherClassHour() {
        return actualOtherClassHour;
    }

    public void setActualOtherClassHour(Integer actualOtherClassHour) {
        this.actualOtherClassHour = actualOtherClassHour;
    }

    public Integer getActualSumupClassHour() {
        return actualSumupClassHour;
    }

    public void setActualSumupClassHour(Integer actualSumupClassHour) {
        this.actualSumupClassHour = actualSumupClassHour;
    }

    public Boolean getAuditState() {
        return auditState;
    }

    public void setAuditState(Boolean auditState) {
        this.auditState = auditState;
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