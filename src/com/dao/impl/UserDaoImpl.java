package com.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.beans.UserInfo;
import com.dao.UserDao;

//HibernateDaoSupport是Spring对Hibernate的封装类
//HibernateDaoSupport是在spring-orm.jar带的工具类
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public UserInfo login(UserInfo user) {
		return (UserInfo) this.getSession().createQuery("select u from UserInfo u where u.userName=? and u.password=?")
		.setParameter(0, user.getUserName()).setParameter(1, user.getPassword()).uniqueResult();
	}
	
	

}
