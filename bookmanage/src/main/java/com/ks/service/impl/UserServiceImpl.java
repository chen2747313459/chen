package com.ks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ks.dao.UserMapper;
import com.ks.entity.User;
import com.ks.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	//依赖注入
	@Autowired
	private UserMapper uMapper;

	//用户登录
	@Override
	public User doLogin(String name, String password) {
		return uMapper.doLogin(name, password);
	}

}
