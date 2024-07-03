package com.springboot.aoparoundadviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopAroundAdviceExampleApplication {

	public static void main(String[] args) {
	   ConfigurableApplicationContext context = SpringApplication.run(AopAroundAdviceExampleApplication.class, args);
	                          BankService bean=context.getBean(BankService.class);
	                          
	                          bean.displayBalance("12345");
	                          
	                          context.close();
	}

}
