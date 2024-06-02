package com.example.Innovamarkets_sendMails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.Innovamarkets_sendMails.service.SendMailsService;

@SpringBootApplication
public class InnovamarketsSendMailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InnovamarketsSendMailsApplication.class, args);
	}

	// Test send emails with the following data:
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		SendMailsService sendMailsService = new SendMailsService();
		sendMailsService.sendMail("iheblazhary@gmail.com", "Test the send mails ", "Hello from the test");
	}
}
