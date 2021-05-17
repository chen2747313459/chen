package com.ks.service;

import com.ks.entity.User;

public interface UserService {
	//用户登录
	User doLogin(String name,String password);

}
