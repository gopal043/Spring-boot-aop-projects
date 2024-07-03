package com.springboot.aopbeforeadviceexample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect  
@Component
public class EmployeeServiceAspect {
	
	public EmployeeServiceAspect() {
		super();
		System.out.println("EmployeeServiceAspect Contructor");
	}


	@Before(value = "execution(* EmployeeService.*(..)) and args(empId, fname, sname)")
	public void beforeAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
		System.out.println("Before method:" + joinPoint.getSignature());  
		System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
		}
	
	@After(value = "execution(* EmployeeService.*(..)) and args(empId, fname, sname)")  
	public void afterAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
	System.out.println("After method:" + joinPoint.getSignature());  
	System.out.println("Creating Employee with first name - " + fname + ", second name - " + sname + " and id - " + empId);  
	} 
	
	
}
