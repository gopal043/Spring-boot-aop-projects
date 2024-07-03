package com.springboot.aopafterreturningadviceexample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountAspect {

	@AfterReturning(value="execution(* AccountServiceImple.*(..))",returning="account")
	public void afterReturning(JoinPoint joinPoint,Account account){
		System.out.println("After Returing method:"+joinPoint.getSignature());  
		System.out.println(account);  
	}
	
	//implementing after throwing advice      
	@AfterThrowing(value="execution(* AccountServiceImple.*(..))",throwing="ex")  
	public void afterThrowingAdvice(JoinPoint joinPoint, Exception ex)  
	{  
	System.out.println("After Throwing exception in method:"+joinPoint.getSignature());  
	System.out.println("Exception is:"+ex.getMessage());  
	}   
}
