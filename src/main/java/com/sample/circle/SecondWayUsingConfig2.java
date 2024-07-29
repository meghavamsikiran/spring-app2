package com.sample.circle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // optional
public class SecondWayUsingConfig2 {
	
	@Bean("o2")
	public Circle2 Circle2() {
		return new Circle2();
	}
	@Bean("o3")
	public Circle2 Circle3() {
		return new Circle2();
	}
}
