package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Account;
import com.repository.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepository;
	

	@Transactional
	@Override
	public Account insertAccount(Account ac) {
		return accountRepository.save(ac);
	}

	@Transactional
	@Override
	public Account updateAccount(Account ac, int aid) {
		Optional<Account> opd=accountRepository.findById(aid);
		if(opd.isPresent()) {
			Account ob=opd.get();
			ob.setCustomer(ac.getCustomer());
			ob.setBalance(ac.getBalance());
			ob.setEmail(ac.getEmail());
			Account upob=accountRepository.save(ob);
			return upob;
		}
		else {
			return null;
		}
		

	}

	@Transactional
	@Override
	public void deleteAccount(int aid) {
		accountRepository.deleteById(aid);
		
	}

	@Override
	public Account findAccountById(int aid) {
		Optional<Account> opd=accountRepository.findById(aid);
		if(opd.isPresent()) {
			Account ob=opd.get();
			return ob;
		}
		else {
			return null;
		}
	
	}

	@Override
	public List<Account> findAllAccounts() {
		return accountRepository.findAll();
	}

	@Override
	public List<Account> getAccountsByCustomer(String cust) {
		return accountRepository.findByCustomer(cust);
	}

	@Override
	public List<Account> getAccountsByBalanceRange(double minbal, double maxbal) {
		return accountRepository.findByBalanceBetween(minbal, maxbal);
	}

}
