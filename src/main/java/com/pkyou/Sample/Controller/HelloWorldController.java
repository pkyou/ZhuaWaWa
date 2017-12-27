package com.pkyou.Sample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@RequestMapping("/say.html")
	public @ResponseBody String Say() {
		return "Hello the whole world";
	}
}
