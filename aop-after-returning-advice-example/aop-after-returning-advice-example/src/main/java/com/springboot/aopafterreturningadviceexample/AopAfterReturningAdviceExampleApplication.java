package com.springboot.aopafterreturningadviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AopAfterReturningAdviceExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(AopAfterReturningAdviceExampleApplication.class, args);
		AccountService bean = context.getBean("accountServiceImple",AccountServiceImple.class);
		
		Account account;  
		try   
		{  
		account = bean.getAccountByCustomerId("K2434567"); 
		account = bean.getAccountByCustomerId(null); 
		if(account != null)  
		System.out.println(account.getAccountNumber()+"\t"+account.getAccountType());  
		}   
		catch (Exception e)   
		{  
		System.out.println(e.getMessage());  
		}  
	}

}
