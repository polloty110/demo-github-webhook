package com.antra.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("hello world!!!");
		return "hello world!!!!!!!!!!!!!!!!!!!!!testing for docker out file";
	}
	
	@RequestMapping("")
	public String hello1(){
		System.out.println("please input /hello!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return "please input /hello docker created new image with existed java jar";
	}
	
}
