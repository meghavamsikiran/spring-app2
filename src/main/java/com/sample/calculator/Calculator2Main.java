package com.sample.calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Calculator2Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SecondWayUsingConfig.class);
		// the name of the class which contains @Bean methods.class goes here
		
		Calculator2 c = (Calculator2)ctx.getBean("h1");
		System.out.println("Addition: "+c.add(1, 5));
		System.out.println("Multiplication: "+c.multiply(5, 2));
		ctx.close();
	}
}
