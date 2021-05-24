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
	

	@RequestMapping(value = "/gupta",method = RequestMethod.GET)
	public String method3()
	{
		return("Hai All from gupta");
	}

	@RequestMapping(value = "/revanth",method = RequestMethod.GET)
	public String method2()
	{
		return("Hai this is mwthod2 by revanth");

	}
	
	@RequestMapping(value = "/pavan",method = RequestMethod.GET)
	public String method7()
	{
		return("Hai this is mwthod7 by pavan");

	}

}
