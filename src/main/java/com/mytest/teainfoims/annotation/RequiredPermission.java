package com.mytest.teainfoims.annotation;

import java.lang.annotation.*;

/**
 * 定义方法需要的对应资源的权限码
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@SuppressWarnings("all")
public @interface RequiredPermission {
    /**
     * 权限码
     */
    String code() default "";
}
