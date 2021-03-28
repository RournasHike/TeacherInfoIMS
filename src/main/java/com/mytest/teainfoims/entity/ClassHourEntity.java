package com.mytest.teainfoims.entity;

import javax.validation.constraints.*;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/25
 */
public class ClassHourEntity {

    private Integer id;

    private String teacherName;

    private String courseNo;

    private String courseName;

    private String courseType;

    private Integer weekClassHour;

    private Integer teachClassHour;

    private Integer experimentClassHour;

    private Integer computerClassHour;

    private Integer otherClassHour;

    private Integer sumupClassHour;

    private Double credit;

    private Integer prescribedClassHour;

    private Integer actualClassHour;

    private Integer actualTeachClassHour;

    private Integer actualExperimentClassHour;

    private Integer actualComputerClassHour;

    private Integer actualOtherClassHour;

    private Integer actualSumupClassHour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public Integer getWeekClassHour() {
        return weekClassHour;
    }

    public void setWeekClassHour(Integer weekClassHour) {
        this.weekClassHour = weekClassHour;
    }

    public Integer getTeachClassHour() {
        return teachClassHour;
    }

    public void setTeachClassHour(Integer teachClassHour) {
        this.teachClassHour = teachClassHour;
    }

    public Integer getExperimentClassHour() {
        return experimentClassHour;
    }

    public void setExperimentClassHour(Integer experimentClassHour) {
        this.experimentClassHour = experimentClassHour;
    }

    public Integer getComputerClassHour() {
        return computerClassHour;
    }

    public void setComputerClassHour(Integer computerClassHour) {
        this.computerClassHour = computerClassHour;
    }

    public Integer getOtherClassHour() {
        return otherClassHour;
    }

    public void setOtherClassHour(Integer otherClassHour) {
        this.otherClassHour = otherClassHour;
    }

    public Integer getSumupClassHour() {
        return sumupClassHour;
    }

    public void setSumupClassHour(Integer sumupClassHour) {
        this.sumupClassHour = sumupClassHour;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
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
}
