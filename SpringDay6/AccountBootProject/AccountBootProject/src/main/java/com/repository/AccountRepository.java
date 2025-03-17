package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bean.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
		// @Query("FROM Account WHERE customer = ?1")
    	List<Account> findByCustomer(String customer);
 
    	//@Query("SELECT a FROM Account a WHERE balance between   :minbal AND :maxbal")
    	List<Account> findByBalanceBetween(double minbal, double maxbal);
    	
    	// select a from Account a where a.balance>?
    	List<Account> findByBalanceGreaterThan(double amount);
}















