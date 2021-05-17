package com.ks.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ks.entity.User;

import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User>{
	//用户登录
	@Select("select * from user where name=#{name} and password=#{password}")
	User doLogin(@Param("name")String name,@Param("password")String password);

}
