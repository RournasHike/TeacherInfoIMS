package com.mytest.teainfoims.utils;

import com.mytest.teainfoims.vo.SysMailMessage;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/10
 */
public class SysMessageUtil {
//    private static Properties properties;
//
//    static {
//        properties = new Properties();
//        try {
//            properties.load(SysMessageUtil.class.getResourceAsStream("classpath:mail.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    public static Properties getMailProperties(){
//        return properties;
//    }

    public static SysMailMessage getMailMessage(SysMailMessage message,String account, String password){
        String content = message.getContents() + message.getAccount()+ account + "," + message.getPassword() + password +","+ message.getLink();
        message.setContents(content);
        return message;
    }
}
