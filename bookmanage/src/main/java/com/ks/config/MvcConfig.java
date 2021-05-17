package com.ks.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ks.interceptor.LoginInterceptor;

//扩展SpringMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer {
	//扩展视图控制器映射器
//	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		//浏览器发送/toLogin控制请求，到达login页面
		//去登录首页-方法二
		registry.addViewController("/toLogin").setViewName("login");
		//浏览器发送/bookList控制请求，到达bookulist页面
//		registry.addViewController("/bookList").setViewName("booklist");
		//浏览器发送/toAddBook控制请求，到达addBook页面
		registry.addViewController("/toAddBook").setViewName("addBook");
	}
	
	//拦截器-规则
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//	    registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*")
//	        .excludePathPatterns("/doLogin","/toLogin");
//	}

}
