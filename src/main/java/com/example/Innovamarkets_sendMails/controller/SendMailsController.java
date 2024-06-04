 package com.example.Innovamarkets_sendMails.controller;

import com.example.Innovamarkets_sendMails.service.SendMailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v4/mails")
public class SendMailsController {

    private final SendMailsService sendMailsService;

    @Autowired
    public SendMailsController(SendMailsService sendMailsService) {
        this.sendMailsService = sendMailsService;
    }

    @PostMapping("/send")
    public String sendMail(@RequestParam String from , @RequestParam String to, @RequestParam String subject, @RequestParam String body) {
        sendMailsService.sendMail(from,to, subject, body);
        return "Mail sent to: " + to;
    }
}