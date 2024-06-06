package com.example.Innovamarkets_sendMails.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.util.List;

@Service
public class SendMailsService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String from, List<String> to, String subject, String body) {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper;

        try {
            helper = new MimeMessageHelper(message, true); // true indicates multipart message
            helper.setFrom(from);
            helper.setTo(to.toArray(new String[0])); // convert list to array
            helper.setSubject(subject);
            helper.setText(body, true); // true indicates body is HTML
            mailSender.send(message);
        } catch (MessagingException e) {
            System.out.println("Error while sending mail ..");
            e.printStackTrace();
        }

        System.out.println("Mail sent to: " + to);
    }
}