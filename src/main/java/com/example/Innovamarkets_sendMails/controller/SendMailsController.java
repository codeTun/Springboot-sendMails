package com.example.Innovamarkets_sendMails.controller;

import com.example.Innovamarkets_sendMails.service.SendMailsService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v4/mails")
public class SendMailsController {

    private final SendMailsService sendMailsService;

    public SendMailsController(SendMailsService sendMailsService) {
        this.sendMailsService = sendMailsService;
    }

    @PostMapping("/send")
    public String sendMail(@RequestBody MailRequest mailRequest) {
        sendMailsService.sendMail(mailRequest.getFrom(), mailRequest.getTo(), mailRequest.getSubject(),
                mailRequest.getBody());
        return "Mail sent to : " + mailRequest.getTo();
    }
}