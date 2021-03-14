package com.mytest.teainfoims.utils;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/31
 */
public class ValidatorUtils {

    /**手机号正则:"^[1](([3][0-9])|([4][5-9])|([5][0-3,5-9])|([6][5,6])|([7][0-8])|([8][0-9])|([9][1,8,9]))[0-9]{8}$");
     * 网址正则: "((http|https):\\/\\/){1}[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?"
     * 预先定义,方便以后使用        手机号:
     */
    private static String PATTEN_REGEX_PHONE= "^[1](([3][0-9])|([4][5-9])|([5][0-3,5-9])|([6][5,6])|([7][0-8])|([8][0-9])|([9][1,8,9]))[0-9]{8}$";

    private static String PATTEN_REGEX_URL="((http|https):\\/\\/){1}[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?";

    public static boolean validatePhone(String telephone){
        if (!telephone.matches(PATTEN_REGEX_PHONE)) {
            return false;
        }
        return true;
    }

}
