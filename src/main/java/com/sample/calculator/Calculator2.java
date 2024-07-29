package com.sample.calculator;

import org.springframework.context.annotation.Configuration;

@Configuration // optional
public class Calculator2 {
	
	public Calculator2() {
		System.out.println("In Controller!");
	}
	
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	public int multiply(int n1, int n2) {
		return n1*n2;
	}
}
