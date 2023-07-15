package com.avans.eurekaclient.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroService1App {
	public static void main(String[] args) {
		SpringApplication.run(MicroService1App.class,args);
	}
}
