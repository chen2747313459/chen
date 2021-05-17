package com.ks.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ks.entity.User;
import com.ks.service.UserService;

@Controller
public class UserController {
	//依赖注入
	@Autowired
	private UserService uService;
	
	//用户登录
	@GetMapping("/doLogin")
	public String doLogin(@RequestParam(value="name",required = false)String name,
			@RequestParam(value="password",required = false)String password,
			Model model, HttpSession session,HttpServletRequest req){
		//调用业务处理
		User user = uService.doLogin(name, password);
		//判断
		if(user!=null){//登录去到首页
			session = req.getSession();
			session.setAttribute("usertype", user.getUsertype());//将当前登录用户的用户类型保存到session中去书籍列表booklist.html页面
			return "redirect:/bookList"; //重定向到/bookUlist请求-防止表单重复提交
		}else{//否则返回登录页面，并提示
			model.addAttribute("msg", "用户名或密码错误！");
			return "login";
		}
	}

}
