package com.sample.circle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Circle2Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SecondWayUsingConfig.class);
		Circle2 c = (Circle2)ctx.getBean("o1");
		System.out.println("Area: "+c.area(3));
		System.out.println("Perimeter: "+c.perimeter(7));
		
		System.out.println("===> Imported spring2.xml");
		Circle2 c2 = (Circle2) ctx.getBean("o2");
		System.out.println("Imported Area: "+c2.area(4));
		ctx.close();
	}
}
