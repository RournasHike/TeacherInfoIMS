package com.mytest.teainfoims.vo;

public class TSchedule {
    private Integer id;

    private Integer cid;

    private Integer tid;

    private Integer rid;

    private String teacherName;

    private String courseName;

    private String teachRoomName;

    private String classYear;

    private String classTerm;

    private String classWorkDay;

    private String classNum;

    private Integer startWeek;

    private Integer classWeek;

    private Boolean isSingleWeek;

    private Boolean isDoubleWeek;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
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

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear == null ? null : classYear.trim();
    }

    public String getClassTerm() {
        return classTerm;
    }

    public void setClassTerm(String classTerm) {
        this.classTerm = classTerm == null ? null : classTerm.trim();
    }

    public String getClassWorkDay() {
        return classWorkDay;
    }

    public void setClassWorkDay(String classWorkDay) {
        this.classWorkDay = classWorkDay == null ? null : classWorkDay.trim();
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum == null ? null : classNum.trim();
    }

    public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    public Integer getClassWeek() {
        return classWeek;
    }

    public void setClassWeek(Integer classWeek) {
        this.classWeek = classWeek;
    }

    public Boolean getIsSingleWeek() {
        return isSingleWeek;
    }

    public void setIsSingleWeek(Boolean isSingleWeek) {
        this.isSingleWeek = isSingleWeek;
    }

    public Boolean getIsDoubleWeek() {
        return isDoubleWeek;
    }

    public void setIsDoubleWeek(Boolean isDoubleWeek) {
        this.isDoubleWeek = isDoubleWeek;
    }
}