package com.sshome.ssmcxf.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface SsWebService {
	
	public String getUser(@WebParam(name="userName") String userName,@WebParam(name="password") String password);
	
}
