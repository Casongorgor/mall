package com.macro.mall.common.util;

import com.macro.mall.common.exception.Asserts;
import lombok.extern.slf4j.Slf4j;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
@Slf4j
public class GmailMailer {
    final public static String username = "sunshine.sky.od@gmail.com";
    final public static String password = "hgwp xmrw njmb yyum";// Gmail password
    public static void sendMail(String recipient, String subject, String content) throws Exception {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
        message.setSubject(subject);
        message.setText(content);

        Transport.send(message);

    }

    public static void sendAuthCode(String toEmail, String authCode){
        try {
            String content = EmailTemplate.REGISTRATION.replace("#{send_email}",toEmail).replace("#{verify_code}",authCode);
            sendMail(toEmail, "Registration verification code", content);
        } catch (Exception e) {
            e.printStackTrace();
            Asserts.fail("發送驗證碼失敗");
        }
    }


    public static void main(String[] args) {
        try {
            String toEmail = "116815480@qq.com";
            String verCode = "Kn9871";
            String content = EmailTemplate.REGISTRATION.replace("#{send_email}",toEmail).replace("#{verify_code}",verCode);
            sendMail(toEmail, "Registration verification code", content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
