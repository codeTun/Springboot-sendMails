package com.example.Innovamarkets_sendMails.controller;

import com.example.Innovamarkets_sendMails.service.SendMailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String sendMail(@RequestBody MailRequest mailRequest) {
        for (String recipient : mailRequest.getTo()) {
            sendMailsService.sendMail(mailRequest.getFrom(), recipient, mailRequest.getSubject(),
                    mailRequest.getBody());
        }
        return "Mail sent";
    }
}