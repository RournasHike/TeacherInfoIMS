package com.mytest.teainfoims.vo;

public class TTeachRoom {
    private Integer id;

    private String teachRoomName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeachRoomName() {
        return teachRoomName;
    }

    public void setTeachRoomName(String teachRoomName) {
        this.teachRoomName = teachRoomName == null ? null : teachRoomName.trim();
    }
}