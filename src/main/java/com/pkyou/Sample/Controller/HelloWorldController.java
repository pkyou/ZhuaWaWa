package com.pkyou.Sample.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ch.qos.logback.classic.Logger;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api("swagger ui 注释 api 级别")
public class HelloWorldController {

	private final  Logger logger = (Logger) LoggerFactory.getLogger(HelloWorldController.class);
	@ApiOperation("swagger ui 注释 方法级别")
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public  String hello() {
		
		String data = "Never trouble untill.";
		logger.info("this is debug info");
		return data;
	}
}