package com.example.pwcspring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopAdvice {
	
//	@Before(value="execution(* com.example.pwcspring.GreetingsImpl.sayGreetings(..))")
//	public void callBefore() {
//		System.out.println("callig before");
//	}
//	"callig before"
//	@After(value="execution(* com.example.pwcspring.GreetingsImpl.sayHello(..))")
//	public void callAfter() {
//		System.out.println("callig after");
//	}
	
	@Around(value="execution(* com.example.pwcspring.GreetingsImpl.sayHello(..))")
	public void callAround(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("callig before");
		pj.proceed();
		System.out.println("callig after");
	}

}
