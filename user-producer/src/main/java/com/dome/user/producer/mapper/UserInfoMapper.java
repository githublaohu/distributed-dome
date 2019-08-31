package com.dome.user.producer.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dome.user.entity.UserInfo;

@Mapper
public interface UserInfoMapper {

	public int addUserInfo(UserInfo userInfo);
	
	public UserInfo queryUserInfo(UserInfo userInfo);
}
