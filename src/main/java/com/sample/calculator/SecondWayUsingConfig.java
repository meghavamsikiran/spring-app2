package com.sample.calculator;
// Instead of creating .xml file we can also create Java Configuration file like this.
import org.springframework.context.annotation.Bean;

public class SecondWayUsingConfig {
	
	@Bean("h1")
	public Calculator2 firstBean() {
		return new Calculator2();
	}
	
//	If you want you can create more beans like below
//	@Bean("h2")
//	public Calculator2 secondBean() {
//		return new Calculator2();
//	}
}
