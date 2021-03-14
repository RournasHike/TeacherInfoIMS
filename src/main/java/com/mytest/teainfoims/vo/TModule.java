package com.mytest.teainfoims.vo;

import java.util.Date;

public class TModule {
    private Integer id;

    private String moduleName;

    private String url;

    private Integer parentId;

    private String parentOptValue;

    private Integer grade;

    private String optValue;

    private Integer orders;

    private Boolean moduleState;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentOptValue() {
        return parentOptValue;
    }

    public void setParentOptValue(String parentOptValue) {
        this.parentOptValue = parentOptValue == null ? null : parentOptValue.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getOptValue() {
        return optValue;
    }

    public void setOptValue(String optValue) {
        this.optValue = optValue == null ? null : optValue.trim();
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Boolean getModuleState() {
        return moduleState;
    }

    public void setModuleState(Boolean moduleState) {
        this.moduleState = moduleState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}