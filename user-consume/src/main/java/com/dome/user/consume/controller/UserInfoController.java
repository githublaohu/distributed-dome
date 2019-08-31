package com.dome.user.consume.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dome.user.entity.UserInfo;
import com.dome.user.service.UserService;

@RestController("useInfoContrcoller")
@RequestMapping("/userInfo")
public class UserInfoController {

	@Reference()
	private UserService userService;
	
	@PostMapping("addUserInfo")
	public int addUserInfo(@RequestBody UserInfo userInfo) {
		
		return userService.addUserInfo(userInfo);
	}

	@PostMapping("queryUserInfo")
	public UserInfo queryUserInfo(@RequestBody UserInfo userInfo) {
		return userService.queryUserInfo(userInfo);
	}
	
	@GetMapping("/queryUser")
	public UserInfo queryUserInfo() {
		return userService.queryUserInfo(null);
	}
}