package com.wy.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopTest {
	
	@Pointcut("execution(public java.lang.String com.wy.controller.TeacherController.updateTeacher(java.lang.Integer,org.springframework.ui.Model))")
	public void pointCut()
	{
		
	}
	
	@Before("pointCut()")
	public void beforeCalling(JoinPoint joint)
	{
		System.out.println("=====================Before method "+joint.getSignature().getName()+" calling");
	}
	
	@After("execution(public * com.wy.controller.TeacherController.updateTeacher(..))")
	public void afterCalling()
	{
		System.out.println("=====================After method calling");
	}
	
	public void afterExceptionThrowing()
	{
		System.out.println("After exception throwing");
	}
	
	@AfterReturning("pointCut()")
	public void afterReturning()
	{
		System.out.println("======================After returning method calling");
	}

}
