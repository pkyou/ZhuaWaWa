package com.pkyou.Sample.Controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pkyou.Sample.Entyties.IndoorCheckItemEntity;
import com.pkyou.Sample.ServiceImp.ControllerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/controller")
@Api("swagger ui 注释 api 级别")

public class HelloWorldController {

	private final  Logger logger = (Logger) LoggerFactory.getLogger(HelloWorldController.class);
	
	@ApiOperation("swagger ui 注释 方法级别")
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public  String hello() {
		
		String data = "this is 333 ";
		return data;
	}	
	@Resource
	private ControllerService service;
	@RequestMapping(value="/getIndoorCheckItemEntities",method=RequestMethod.GET)
	@ApiOperation("获取数据库内容")
	public ArrayList<IndoorCheckItemEntity> getIndoorCheckItemEntities(){
		logger.debug("start request data");
		return service.getIndoorCheckItemEntities();
	}
}



