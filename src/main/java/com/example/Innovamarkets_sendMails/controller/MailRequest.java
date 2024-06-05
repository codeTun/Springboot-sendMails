package com.example.Innovamarkets_sendMails.controller;

import lombok.Data;
import java.util.List;

@Data
public class MailRequest {
    private String from;
    private List<String> to;
    private String subject;
    private String body;

}
