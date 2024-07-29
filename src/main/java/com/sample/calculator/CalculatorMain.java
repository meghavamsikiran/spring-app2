package com.sample.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/sample/calculator/configuration.xml");
		
		Calculator c = ctx.getBean(Calculator.class); // It is used when we have only one bean-id
//		Calculator hello = (Calculator)ctx.getBean("obj1"); // bean-id that we mentioned in the bean-tag
		//obj1 is called as 'bean'. A bean is an object in a spring specific project
		System.out.println("Addition: "+c.add(5, 5));
		System.out.println("Multiplication: "+c.multiply(5, 5));
	}
}

// In configuration.xml I have written two bean objects i.e, obj1 and obj2 that's why it is printing "In Controller" two times.