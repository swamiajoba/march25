package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Account;

@RestController
@RequestMapping("/api")
public class AccountController {
	
	//url = http://localhost:8082/api/acc1
	@GetMapping("/acc1")
	public ResponseEntity<Account> getAccount1(){
		return new ResponseEntity<Account>(new Account(101,"Ram",50000.00),
											HttpStatus.OK);
	}
	
	//url= http://localhost:8082/api/acc2
	@GetMapping("/acc2")
	public Account getAccount2() {
		return new Account(101,"Sham",75000.00);
	}
	
}












