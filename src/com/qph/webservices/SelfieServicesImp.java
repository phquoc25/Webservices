package com.qph.webservices;

import javax.jws.WebService;

import com.qph.webservices.entity.User;

@WebService(endpointInterface="com.qph.webservices.SelfieServices")
public class SelfieServicesImp implements SelfieServices{
	@Override
	public int initServices() {
		UserDatabase.initUsers();
		return 0;
	}

	@Override
	public User getUserInfos(String userName) {
		for(User u : UserDatabase.users){
			if(u.getUserName().equalsIgnoreCase(userName)){
				return u;
			}
		}
		return null;
	}
}
