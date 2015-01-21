package com.qph.webservices;

import javax.jws.WebService;

import com.qph.webservices.entity.User;

@WebService(targetNamespace="http://webservices.qph.com")
public interface SelfieServices {
	public User getUserInfos(String userName);
	public int initServices();
}
