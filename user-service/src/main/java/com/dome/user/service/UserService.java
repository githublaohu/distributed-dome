package com.dome.user.service;

import com.dome.user.entity.UserInfo;

public interface UserService {

	public int addUserInfo(UserInfo userInfo);
	
	public UserInfo queryUserInfo(UserInfo userInfo);
}
