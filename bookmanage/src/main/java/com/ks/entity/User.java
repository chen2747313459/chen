package com.ks.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@Table(name="user")
public class User {
	@Id
    @KeySql(useGeneratedKeys=true)
	private Integer id;
	private String name;
	private String password;
	private Integer age;
	private Integer sex;
	private String nickname;
	private Integer usertype;
	

}
