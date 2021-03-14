package com.mytest.teainfoims.utils;

import com.mytest.teainfoims.exceptions.AuthException;
import com.mytest.teainfoims.exceptions.ParamsException;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/24
 */
public class AssertUtil {
    public  static void isTrue(Boolean flag,String msg){
        if(flag){
            throw  new ParamsException(msg);
        }
    }

    public static void isPermitted(Boolean flag,String msg){
        if(flag){
            throw  new AuthException(msg);
        }
    }
}
