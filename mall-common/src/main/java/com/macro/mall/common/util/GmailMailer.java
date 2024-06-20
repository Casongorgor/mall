package com.macro.mall.common.util;

import lombok.extern.slf4j.Slf4j;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
@Slf4j
public class GmailMailer {
    final public static String username = "xxxx@gmail.com";
    final public static String password = "xxxx";// Gmail password
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

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(content);

            Transport.send(message);

            System.out.println("Email sent successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            String toEmail = "to_mail";
            String verCode = "Kn9871";
            String content = EmailTemplate.REGISTRATION.replace("#{send_email}",toEmail).replace("#{verify_code}",verCode);
            sendMail(toEmail, "Registration verification code", content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
