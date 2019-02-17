package com.action;

import com.beans.UserInfo;
import com.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private UserInfo user;
	private UserDao userDao;
	
	public String login(){
		UserInfo u=userDao.login(user);
		if(u!=null){
			return "loginSucc";
		}
		return "loginErro";
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
}
