package com.sshome.ssmcxf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sshome.ssmcxf.dao.UserDao;
import com.sshome.ssmcxf.entity.User;
import com.sshome.ssmcxf.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUser(String userName, String password) {
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		return userDao.getUser(user);
	}

}
