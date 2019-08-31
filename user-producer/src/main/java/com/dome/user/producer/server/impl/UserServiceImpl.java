package com.dome.user.producer.server.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dome.user.entity.UserInfo;
import com.dome.user.producer.mapper.UserInfoMapper;
import com.dome.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	@Transactional
	public int addUserInfo(UserInfo userInfo) {
		
		return 0;
	}

	@Override
	@Transactional
	public UserInfo queryUserInfo(UserInfo userInfo) {
		
		return userInfoMapper.queryUserInfo(userInfo);
	}

}
