package com.avans.servicediscovery.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerEx implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Eureka Server 2 Started");
	}

}
