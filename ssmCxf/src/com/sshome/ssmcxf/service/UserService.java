package com.sshome.ssmcxf.service;

import com.sshome.ssmcxf.entity.User;

public interface UserService {

	public User getUser(String userName , String password);
	
}
