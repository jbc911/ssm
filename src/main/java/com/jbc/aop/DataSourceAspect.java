package com.jbc.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.jbc.util.CustomerContextHolder;

@Component
@Aspect
public class DataSourceAspect {
	@Pointcut("execution(* com.jbc.controller.*.find*(..))||execution(* com.jbc.controller.*.list*(..))||execution(* com.jbc.controller.*.get*(..))")
	public void findMethod() {
	}

	@Before("findMethod()")
	public void beforefindMethod(JoinPoint joinPoint) {
		System.out.println("查询方法去从库");
		CustomerContextHolder.setCustomerType(CustomerContextHolder.SLAVE_DATA_SOURCE);
	}

	@Pointcut("execution(* com.jbc.controller.*.add*(..))||execution(* com.jbc.controller.*.save*(..))||execution(* com.jbc.controller.*.update*(..))||execution(* com.jbc.controller.*.edit*(..))||execution(* com.jbc.controller.*.delete*(..))")
	public void editMethod() {
	}

	@Before("editMethod()")
	public void beforeEditMethod(JoinPoint joinPoint) {
		System.out.println("增删改方法去主库");
		CustomerContextHolder.setCustomerType(CustomerContextHolder.MASTER_DATA_SOURCE);
	}
}
