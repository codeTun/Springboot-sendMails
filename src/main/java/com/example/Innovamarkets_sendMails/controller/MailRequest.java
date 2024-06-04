package com.example.Innovamarkets_sendMails.controller;

import lombok.Data;

@Data
public class MailRequest {
    private String from;
    private String to;
    private String subject;
    private String body;

}
