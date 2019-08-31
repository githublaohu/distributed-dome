package com.dome.user.entity;

import lombok.Data;

@Data
public class UserInfo {

	private long ui_id;
	
	private String uiName;
	
	private String sex;
	
	private int isdelete;
}
