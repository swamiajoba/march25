package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Account;
import com.repository.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	

	@Override
	public Account insertAccount(Account ac) {
		return accountRepository.insertAccount(ac);
	}

	@Override
	public Account updateAccount(Account ac, int aid) {
		// TODO Auto-generated method stub
		return accountRepository.updateAccount(ac, aid);
	}

	@Override
	public void deleteAccount(int aid) {
		accountRepository.deleteAccount(aid);
		
	}

	@Override
	public Account findAccountById(int aid) {
		return accountRepository.findAccountById(aid);
	}

	@Override
	public List<Account> findAllAccounts() {
		return accountRepository.findAllAccounts();
	}

}
