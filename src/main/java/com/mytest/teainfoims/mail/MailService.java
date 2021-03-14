package com.mytest.teainfoims.mail;

import javax.mail.MessagingException;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/10
 */
public interface MailService {
    void sendSimpleMail(String to, String subject, String content);
    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId) throws MessagingException;
    void sendHtmlMail(String to, String subject, String content) throws MessagingException;
    void sendAttachmentsMail(String to, String subject, String content, String filePath) throws MessagingException;
}
