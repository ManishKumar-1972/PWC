package com.service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;

@Service("service")
public class CalculatorService {
	
	@Autowired
	@Qualifier("fda")
	private InterestCalculator ic;

	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	public double service(double amount) {
		return ic.calculate(amount);
	}
	
	public CalculatorService() {
		System.out.println("service initilized");
	}
	
	@PostConstruct
	public void callInit() {
		System.out.println("init called");
	}
	
	@PreDestroy
	public void callDestroy() {
		System.out.println("destroy called");
	}

}
