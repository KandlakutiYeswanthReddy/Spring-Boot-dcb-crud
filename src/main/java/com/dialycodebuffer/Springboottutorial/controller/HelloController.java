package com.dialycodebuffer.Springboottutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@GetMapping("/")
	public String helloworld() {
		return " Hi welcome to Daily Code Buffer!! aaaaa" ;
		
	}
}
