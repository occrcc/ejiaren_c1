package com.ejiaren_c1.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ejiaren_c1.pojo.BaseUserInfo;
import com.ejiaren_c1.pojo.EjiarenResult;

public interface AdministratorService {
	EjiarenResult checkData(String content, Integer type);
	EjiarenResult createUser(BaseUserInfo user);
	EjiarenResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);
	EjiarenResult getUserByToken(String token);
}
