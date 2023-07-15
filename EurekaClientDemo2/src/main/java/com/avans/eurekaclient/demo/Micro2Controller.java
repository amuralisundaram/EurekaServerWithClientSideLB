package com.avans.eurekaclient.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("micro2")
public class Micro2Controller {
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("name")
	public String getMicroserviceName() {
		return "My name is :: Micro2 :: port ::"+port;
	}
}
