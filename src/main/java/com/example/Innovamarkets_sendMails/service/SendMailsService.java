package com.example.Innovamarkets_sendMails.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SendMailsService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String from, List<String> to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to.toArray(new String[0])); // convert list to array
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);

        System.out.println("Mail sent to: " + to);
    }
}
