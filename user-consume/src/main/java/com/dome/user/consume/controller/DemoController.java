package com.dome.user.consume.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dome.user.service.DemoService;

@RestController("demoController")
@RequestMapping("/demo")
public class DemoController {

	@Reference // 调用注解
    private DemoService demoService;
	
	@GetMapping("sayName")
	public String sayName() {
		return demoService.sayName("调用成功了");
	}
	
}
