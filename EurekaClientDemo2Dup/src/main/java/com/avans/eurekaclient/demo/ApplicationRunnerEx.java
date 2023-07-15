package com.avans.eurekaclient.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerEx implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		System.out.println("Eureka Client 2 - 2nd instance is up!");
	}

}
