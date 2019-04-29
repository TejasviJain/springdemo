package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.sevice.MailSenderInterface;

@RestController
public class NewController
{
	
	/*
	 * @Autowired MailSenderInterface SMTPEmailSender;
	 * 
	 * @RequestMapping("/demo") public String Test() { return
	 * SMTPEmailSender.toString(); }
	 */
	
	@Autowired
	@Qualifier("AdminUser")
	User abc;
	
	 @RequestMapping("/admin")
	 public User getadmin() { 
		return abc;
	 }
	
}
