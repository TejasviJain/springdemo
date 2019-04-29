package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sevice.MailSenderInterface;

@RestController
public class DummyRestCont 
{
	
	@Autowired 
	MailSenderInterface SMTPEmailSender; //create reference of interface
	 
	@Autowired
	MailSenderInterface mockEmailSender;
	
	@Value("${useMock}")
	private boolean useMock;
	
	@RequestMapping("/test")
	public String Mail()
	{
		/*
		 * MailSenderInterface mailsender =new MockEmailSender(); return
		 * mailsender.sendMail();
		 */
		if(useMock)//if useMock value is true then it calls mockEmaliSender else it calls SMTPEmailSender the is declare in app.properties
		{
		return mockEmailSender.sendMail(); //call to mMockEmailSender Class
		}
		else
		{
		return SMTPEmailSender.sendMail(); //call to SMTPEmailSender class
		}
	}
}
