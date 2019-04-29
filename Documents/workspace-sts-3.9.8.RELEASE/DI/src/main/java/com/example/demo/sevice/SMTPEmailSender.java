package com.example.demo.sevice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

public class SMTPEmailSender implements MailSenderInterface {

	@Override
	public String sendMail() {
		// TODO Auto-generated method stub
		return "Sending To SMTP";
	}

}
