package com.mytest.teainfoims.query;

import com.mytest.teainfoims.query.base.BaseQuery;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/16
 */
public class UserQuery extends BaseQuery {
    private String username;
    private String usertruename;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertruename() {
        return usertruename;
    }

    public void setUsertruename(String usertruename) {
        this.usertruename = usertruename;
    }
}
