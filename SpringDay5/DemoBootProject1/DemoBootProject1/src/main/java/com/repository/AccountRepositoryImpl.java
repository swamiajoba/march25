package com.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Repository;
import com.bean.Account;
import com.model.Product;

@Repository("accountRepository")
public class AccountRepositoryImpl implements AccountRepository {
	List<Account> alist=new ArrayList<Account>();
	
	public AccountRepositoryImpl() {
		alist.add(new Account(101,"Ram",50000.00));
		alist.add(new Account(102,"Sham",54500.00));
		alist.add(new Account(103,"Krishna",76000.00));
		alist.add(new Account(104,"Ganesh",24400.00));
		alist.add(new Account(105,"Durga",33300.00));
	}

	@Override
	public Account insertAccount(Account ac) {
		boolean check=alist.add(ac);
		if(check==true) {
			return ac;
		}
		return null;
	}

	@Override
	public Account updateAccount(Account ac, int aid) {
		boolean flag=false;
		ListIterator<Account> listIterator= alist.listIterator();
		
		while(listIterator.hasNext()) {
			Account acc=listIterator.next();
			if(acc.getAid()==aid) {
				flag=true;
				listIterator.set(ac);
			}
		}
		if(flag)
			return ac;
		else
			return null;

	}

	@Override
	public void deleteAccount(int aid) {
		Account ac=findAccountById(aid);
		if(ac!=null) {
			alist.remove(ac);
		}
	}

	@Override
	public Account findAccountById(int aid) {
		for(Account ac:alist) {
			if(ac.getAid()==aid) {
				return ac;
			}
		}
		return null;
	}

	@Override
	public List<Account> findAllAccounts() {
		return alist;
	}

}
