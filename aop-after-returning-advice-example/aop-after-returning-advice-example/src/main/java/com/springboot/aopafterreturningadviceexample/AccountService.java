package com.springboot.aopafterreturningadviceexample;

public interface AccountService {

	public abstract Account getAccountByCustomerId(String customerId)  
			throws Exception; 
}
