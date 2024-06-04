package com.example.Innovamarkets_sendMails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.Innovamarkets_sendMails.service.SendMailsService;


@SpringBootApplication
public class InnovamarketsSendMailsApplication {
	@Autowired
	private SendMailsService sendMailsService;

	public static void main(String[] args) {
		SpringApplication.run(InnovamarketsSendMailsApplication.class, args);
	}

	// @EventListener(ApplicationReadyEvent.class)
	// public void triggerMail()  {
		
	// 	sendMailsService.sendMail("iheblazhary@gmail.com","hamzahajmtir2002@gmail.com",
	// 			"This is email subject",
	// 			"Hello iheb how are you ?");
		
	// }

}
