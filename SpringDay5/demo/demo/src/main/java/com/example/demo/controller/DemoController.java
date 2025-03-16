package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@RequestMapping("/hello1")
	@ResponseBody
	public ResponseEntity<String> sayhello1() {
		return new ResponseEntity<String>("Hello EveryBody",HttpStatus.OK);
	}
	
}
