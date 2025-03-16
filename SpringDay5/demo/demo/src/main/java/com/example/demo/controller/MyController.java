package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value ="/hello2",method = RequestMethod.GET)
	public ResponseEntity<String> sayhello2() {
		return new ResponseEntity<String>("Welcome to Spring",HttpStatus.OK);
	}
	
	@GetMapping("/hello3")  //@RequestMapping(value="/hello3",method = RequestMethod.GET)
	public ResponseEntity<String> sayhello3() {
		return new ResponseEntity<String>("This is Spring Boot",HttpStatus.OK);
	}
	
	@GetMapping("/hello4")  
	public String sayhello4() {
		return"This is data";
	}
}










