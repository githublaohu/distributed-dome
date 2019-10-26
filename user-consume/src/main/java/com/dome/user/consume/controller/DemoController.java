package com.dome.user.consume.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dome.user.service.DemoService;

@RestController("demoController")
@RequestMapping("/demo")
public class DemoController {

	@Reference // 调用注解
    private DemoService demoService;
	
	@GetMapping("sayName")
	public String sayName() {
		return demoService.sayName("使用 apache的最新的调用成功了，dubbo是在apche里面的包");
	}
	
}
