package com.mytest.teainfoims.entity;

import org.springframework.stereotype.Component;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/28
 */


@Component
public class UserEntity {
    private long readBytes =0L;
    private long allBytes=0L;
    private int currentIndex;

    public long getReadBytes() {
        return readBytes;
    }

    public void setReadBytes(long readBytes) {
        this.readBytes = readBytes;
    }

    public long getAllBytes() {
        return allBytes;
    }

    public void setAllBytes(long allBytes) {
        this.allBytes = allBytes;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "readBytes=" + readBytes +
                ", allBytes=" + allBytes +
                ", currentIndex=" + currentIndex +
                '}';
    }
}



