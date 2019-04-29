package com.example.temp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotInUseController
{
	@RequestMapping("/temp")
	public String NewCont()
	{
		return"new Controller";
	}
}
