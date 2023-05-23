package com.antra.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@RequestMapping("/hello")
	public String hello(){
		return "hello world!!!";
	}
	
	@RequestMapping("")
	public String hello1(){
		return "please input /hello";
	}
	
}
