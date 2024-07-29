package com.sample.circle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration // optional\
@Import(SecondWayUsingConfig2.class)
public class SecondWayUsingConfig {
	
	@Bean("o1")
	public Circle2 Circle2() {
		return new Circle2();
	}
}
