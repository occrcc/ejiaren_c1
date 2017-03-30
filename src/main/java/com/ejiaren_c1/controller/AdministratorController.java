package com.ejiaren_c1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ejiaren_c1.pojo.BaseUserInfo;
import com.ejiaren_c1.pojo.EjiarenResult;
import com.ejiaren_c1.service.AdministratorService;
import com.ejiaren_c1.utils.ExceptionUtil;

@Controller
public class AdministratorController {

	@Autowired
	private AdministratorService administratorService;

	@RequestMapping("/check/{param}/{type}")
	@ResponseBody
	public Object checkData(@PathVariable String param, @PathVariable Integer type, String callback) {
		EjiarenResult result = null;
		System.out.println("进入该方法" + param + type);

		// 参数有效性校验
		if (StringUtils.isBlank(param)) {
			result = EjiarenResult.build(400, "校验内容不能为空");
		}
		if (type == null) {
			result = EjiarenResult.build(400, "校验内容类型不能为空");
		}
		if (type != 1 && type != 2 && type != 3) {
			result = EjiarenResult.build(400, "校验内容类型错误");
		}

		if (null != result) {
			if (null == callback) {
				MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
				mappingJacksonValue.setJsonpFunction(callback);
				return mappingJacksonValue;
			} else {
				return result;
			}
		}

		try {
			result = administratorService.checkData(param, type);
		} catch (Exception e) {
			result = EjiarenResult.build(500, ExceptionUtil.getStackTrace(e));
		}

		if (null != callback) {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		} else {
			return result;
		}

	}
	
	
	@RequestMapping("/registerTest")
	@ResponseBody
	public EjiarenResult createUserTest(){
		BaseUserInfo user = new BaseUserInfo();
		user.setLoginId("Ucpsls");
		user.setUserName("Ucpsls");
		user.setPasswd("521000");
		user.setIsused("0");
		user.setPs("管理员");
		user.setOffTel(null);
		user.setMobile(null);
		user.setEmail(null);
		user.setImg(null);
		user.setIsDefault("0");
		user.setIndexOrder(200);
		user.setTlUser("30332");
		user.setParentId("ucpsl");
		try {
			EjiarenResult result = administratorService.createUser(user);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return EjiarenResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	// 创建用户
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public EjiarenResult createUser(BaseUserInfo user) {
		try {
			EjiarenResult result = administratorService.createUser(user);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return EjiarenResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	// 用户登录
	@RequestMapping("/loding")
	@ResponseBody
	public EjiarenResult userLogin(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {

		System.out.println("用户登陆" + username + "	" + password);

		try {
			EjiarenResult result = administratorService.userLogin(username, password, request, response);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return EjiarenResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@RequestMapping("/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token, String callback) {
		EjiarenResult result = null;
		try {
			result = administratorService.getUserByToken(token);
		} catch (Exception e) {
			e.printStackTrace();
			result = EjiarenResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		if (StringUtils.isBlank(callback)) {
			return result;
		} else {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		}
	}
}
