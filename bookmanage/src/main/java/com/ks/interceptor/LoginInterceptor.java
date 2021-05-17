package com.ks.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ks.entity.User;

//登录拦截器
public class LoginInterceptor implements HandlerInterceptor {
	
//	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		User user=(User)request.getSession().getAttribute("user"); //拿到当前用户
		//判断并给其提示
		if(user==null) {//如果为空-重新登录返回false，否则放行返回true
			request.setAttribute("msg","请登录后访问!");
			//转发到去登录首页的url
			request.getRequestDispatcher("/toLogin").forward(request, response);
			return false;
		}else {
			return true;
		}
	}

//	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
//		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

//	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
//		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
