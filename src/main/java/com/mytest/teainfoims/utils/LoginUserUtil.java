package com.mytest.teainfoims.utils;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * 乐字节：专注线上IT培训
 * 答疑老师微信：lezijie
 */
public class LoginUserUtil {

    /**
     * 从cookie中获取userId
     *
     *
     * 乐字节：专注线上IT培训
     * 答疑老师微信：lezijie
     * @param request
     * @return int
     */
    public static int releaseUserIdFromCookie(HttpServletRequest request) {
        String userIdString = CookieUtil.getCookieValue(request, "userIdStr");
        if (StringUtils.isBlank(userIdString)) {
            return 0;
        }
        Integer userId = UserBase64.decoderUserID(userIdString);
        return userId;
    }

    public static String releaseUserNameFromCookie(HttpServletRequest request) {
        String userNameString = CookieUtil.getCookieValue(request, "userName");
        if (StringUtils.isBlank(userNameString)) {
            return null;
        }
        String userName = UserBase64.decoderUserName(userNameString);
        return userName;
    }
}
