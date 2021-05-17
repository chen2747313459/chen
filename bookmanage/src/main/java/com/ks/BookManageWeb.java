package com.ks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;
/*
 * SpringBoot整合模板引擎Thymeleaf
 */

@SpringBootApplication
@MapperScan("com.ks.dao")
public class BookManageWeb {

	public static void main(String[] args) {
		SpringApplication.run(BookManageWeb.class, args);
	}

}
