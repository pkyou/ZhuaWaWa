package com.pkyou.Sample.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public  String hello() {
		String data = "Never trouble trouble untill trouble troubles you.";
		return data;
	}
}
