package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value = "/ajiesh",method = RequestMethod.GET)
	public String method1()
	{
		return("Hai All");
	}

}
