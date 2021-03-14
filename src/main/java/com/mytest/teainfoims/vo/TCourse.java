package com.mytest.teainfoims.vo;


import javax.validation.constraints.*;

public class TCourse {
    private Integer id;

    @Pattern(regexp = "A\\d{8}",message = "课程编号格式不正确")
    private String courseNo;

    private String courseName;

    private String courseType;

    @Max(value = 5,message = "超出周学时范围")
    @Min(value = 1,message = "低于学时范围")
    private Integer weekClassHour;

    @Max(value = 50,message = "超出讲授学时范围")
    @Min(value = 1,message = "低于学时范围")
    private Integer teachClassHour;

    @Max(value = 50,message = "超出实验学时范围")
    @Min(value = 1,message = "低于学时范围")
    private Integer experimentClassHour;

    @Max(value = 50,message = "超出上机学时范围")
    @Min(value = 1,message = "低于学时范围")
    private Integer computerClassHour;

    @Max(value = 20,message = "超出其他学时范围")
    @Min(value = 1,message = "低于学时范围")
    private Integer otherClassHour;

    @Max(value = 100,message = "超出上机学时范围")
    @Min(value = 1,message = "低于学时范围")
    private Integer sumupClassHour;

    @DecimalMax(value = "5",message = "学分点超出范围")
    @DecimalMin(value = "1",message = "低于学分范围")
    private Double credit;

    private Boolean state;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo == null ? null : courseNo.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}