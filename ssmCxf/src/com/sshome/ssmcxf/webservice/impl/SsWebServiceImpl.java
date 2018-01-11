package com.sshome.ssmcxf.webservice.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sshome.ssmcxf.service.UserService;
import com.sshome.ssmcxf.webservice.SsWebService;
@Transactional
@Service
@WebService(endpointInterface = "com.sshome.ssmcxf.webservice.SsWebService", serviceName = "SsWebService")
public class SsWebServiceImpl implements SsWebService {

	@Autowired
	private UserService userService;
	
	@Override
	public String getUser(String userName, String password) {
		return userService.getUser(userName, password).toString();
	}

}
