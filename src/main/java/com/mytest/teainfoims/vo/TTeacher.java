package com.mytest.teainfoims.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TTeacher {
    private Integer tid;

    private String teacherNo;

    private String teacherName;

    private String teacherEngname;

    private String sex;

//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    //出现日期转换问题(HTTP 400 https://blog.csdn.net/weixin_39633917/article/details/112929298)，使用spring这个注解解决
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    private String degree;

    private String major;

    private String school;

    private String phone;

    private String email;

    private String researchDirection;

    private String idNum;

    private String familyAddress;

    private String politicsStatus;

    private Boolean validState;

    private Integer collegeid;

    private TCollege tCollege;

    private Integer deptid;

    private TDept tDept;

    private String occupation;

    @JsonProperty("isForeign")
    private Boolean isForeign;

    private String photoUrl;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherEngname() {
        return teacherEngname;
    }

    public void setTeacherEngname(String teacherEngname) {
        this.teacherEngname = teacherEngname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResearchDirection() {
        return researchDirection;
    }

    public void setResearchDirection(String researchDirection) {
        this.researchDirection = researchDirection;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public Boolean getValidState() {
        return validState;
    }

    public void setValidState(Boolean validState) {
        this.validState = validState;
    }

    public Integer getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(Integer collegeid) {
        this.collegeid = collegeid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public TCollege gettCollege() {
        return tCollege;
    }

    public void settCollege(TCollege tCollege) {
        this.tCollege = tCollege;
    }

    public TDept gettDept() {
        return tDept;
    }

    public void settDept(TDept tDept) {
        this.tDept = tDept;
    }


    public Boolean getForeign() {
        return isForeign;
    }

    public void setForeign(Boolean foreign) {
        isForeign = foreign;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}