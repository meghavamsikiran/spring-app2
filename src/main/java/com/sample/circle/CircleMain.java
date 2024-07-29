package com.sample.circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/sample/circle/spring1.xml");
		Circle c1 = (Circle) ctx.getBean("obj1");
		System.out.println("Area: "+c1.area(3));
		System.out.println("Perimeter: "+c1.perimeter(5));
		
		System.out.println("===> Imported spring2.xml");
		Circle c2 = (Circle) ctx.getBean("obj3");
		System.out.println("Imported Area: "+c2.area(4));
	}
}
