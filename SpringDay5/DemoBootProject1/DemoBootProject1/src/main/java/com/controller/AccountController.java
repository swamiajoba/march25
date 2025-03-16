package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Account;
import com.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@GetMapping("/accounts")
	public ResponseEntity<?> getAllAccounts(){
		List<Account> alist=accountService.findAllAccounts();
		if(alist.isEmpty()) {
			return new ResponseEntity<String>("No Accounts are there",HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Account>>(alist,HttpStatus.OK);
	}
	
	
	@PostMapping("/accounts")
	public ResponseEntity<?> insertAccount(@RequestBody Account acc){ // @RequestBody converts JSON object into java Account object
		Account ob=accountService.insertAccount(acc) ;
		if(ob==null) {
			return new ResponseEntity<String>("Can not insert account",
											HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Account>(ob,HttpStatus.CREATED);
	}
	
	//http://localhost:8083/api/accounts/106
	@PutMapping("/accounts/{aid}")
	public ResponseEntity<?> updateAccount(@RequestBody Account acc,
									@PathVariable("aid") int aid){ 
		Account ob=accountService.updateAccount(acc, aid);
		if(ob==null) {
			return new ResponseEntity<String>("Can not update account",
											HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<Account>(ob,HttpStatus.OK);
	}
	
	@DeleteMapping("/accounts/{aid}")
	public ResponseEntity<?> deleteAccount(	@PathVariable("aid") int aid){ 
		accountService.deleteAccount(aid);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}
	
	@GetMapping("/accounts/{aid}")
	public ResponseEntity<?> getAccountById(@PathVariable("aid") int aid){ 
		Account ob=accountService.findAccountById(aid) ;
		if(ob==null) {
			return new ResponseEntity<String>("Could not find account with aid ="+aid,
											HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Account>(ob,HttpStatus.OK);
	}
	
}









