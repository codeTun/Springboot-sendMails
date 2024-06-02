package com.example.Innovamarkets_sendMails.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMailsService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String from, String to, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
    
        mailSender.send(message);
    
        System.out.println("Mail sent to: " + to);
    }
}
