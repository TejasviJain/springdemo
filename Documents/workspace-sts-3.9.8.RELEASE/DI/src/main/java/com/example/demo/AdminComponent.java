package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.demo.models.User;

@Component
public class AdminComponent {

	@Bean
	public User AdminUser()
	{
		return new User(1,"pooja","pooja");
	}
	
	@Bean
	public User ManagerUser()
	{
		return new User(2,"payal","payal123");
	}
}
