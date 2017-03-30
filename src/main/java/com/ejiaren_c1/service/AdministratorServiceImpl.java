package com.ejiaren_c1.service;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.ejiaren_c1.mapper.BaseUserInfoMapper;
import com.ejiaren_c1.pojo.BaseUserInfo;
import com.ejiaren_c1.pojo.BaseUserInfoExample;
import com.ejiaren_c1.pojo.BaseUserInfoExample.Criteria;
import com.ejiaren_c1.pojo.EjiarenResult;
import com.ejiaren_c1.utils.CookieUtils;
import com.ejiaren_c1.utils.JedisClient;
import com.ejiaren_c1.utils.JsonUtils;

@Service
public class AdministratorServiceImpl implements AdministratorService {
	@Autowired
	private BaseUserInfoMapper userMapper;

	@Autowired
	private JedisClient jedisClient;

	@Value("${REDIS_USER_SESSION_KEY}")
	private String REDIS_USER_SESSION_KEY;
	@Value("${SSO_SESSION_EXPIRE}")
	private Integer SSO_SESSION_EXPIRE;

	@Override
	public EjiarenResult checkData(String content, Integer type) {
		BaseUserInfoExample example = new BaseUserInfoExample();
		Criteria criteria = example.createCriteria();

		if (1 == type) {
			criteria.andUserNameEqualTo(content);
		} else if (2 == type) {
			criteria.andMobileEqualTo(content);
		} else {
			criteria.andEmailEqualTo(content);
		}
		List<BaseUserInfo> list = userMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return EjiarenResult.ok(true);
		}
		return EjiarenResult.ok(false);
	}

	@Override
	public EjiarenResult createUser(BaseUserInfo user) {
		// md5加密
		user.setPasswd(DigestUtils.md5DigestAsHex(user.getPasswd().getBytes()));
		userMapper.insert(user);
		return EjiarenResult.ok();
	}

	/**
	 * 用户登录
	 * <p>
	 * Title: userLogin
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @see com.BaseUserService.sso.service.UserService#userLogin(java.lang.String,
	 *      java.lang.String)
	 */

	@Override
	public EjiarenResult userLogin(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {
		BaseUserInfoExample example = new BaseUserInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserNameEqualTo(username);
		List<BaseUserInfo> list = userMapper.selectByExample(example);
		if (null == list || list.size() == 0) {
			return EjiarenResult.build(400, "用户名或密码登陆错误");
		}

		BaseUserInfo user = list.get(0);

		if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPasswd())) {
			return EjiarenResult.build(400, "用户名或密码错误");
		}
		// 生成token
		String token = UUID.randomUUID().toString();
		// 保存用户之前，把用户对象中的密码清空。
		user.setPasswd(null);
		// 把用户信息写入redis
		jedisClient.set(REDIS_USER_SESSION_KEY + ":" + token, JsonUtils.objectToJson(user));
		// 设置session的过期时间
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
		// 添加cookie的逻辑，cookie的有效期是关闭浏览器就失效。
		// 设置session的过期时间
		
		System.out.println("token为" + REDIS_USER_SESSION_KEY + ":" + token);
		
		CookieUtils.setCookie(request, response, "EJ_TOKEN", token);
		return EjiarenResult.ok(token);
	}

	@Override
	public EjiarenResult getUserByToken(String token) {
		// 根据token从redis中查询用户信息
		String json = jedisClient.get(REDIS_USER_SESSION_KEY + ":" + token);
		// 判断是否为空
		if (StringUtils.isBlank(json)) {
			return EjiarenResult.build(400, "此session已经过期，请重新登陆");
		}
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
		return EjiarenResult.ok(JsonUtils.jsonToPojo(json, BaseUserInfo.class));
	}

}
