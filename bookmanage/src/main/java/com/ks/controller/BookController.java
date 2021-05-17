package com.ks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ks.entity.Book;
import com.ks.entity.User;
import com.ks.service.BookService;

@Controller
public class BookController {
	//依赖注入
	@Autowired
	private BookService bService;
	
	//多条件模糊查询所有并分页（书名、出版社）来查询
	@RequestMapping("/bookList")
	public String getBookList(
			@RequestParam(value="pno",required=true,defaultValue="1")Integer pno,
			@RequestParam(value="psize",required=true,defaultValue="4")Integer psize,
			Book book,Model model){
		PageHelper.startPage(pno, psize, "id desc");//按 图书编号 降序  pno是当前页， psize是设置当前页即每页有4条数据
		List<Book> blist = bService.getBookByMany(book);  //获取图书所有数据
		PageInfo<Book> page = new PageInfo<Book>(blist);
		//将查询出来的各种数据放到model对象当中
		model.addAttribute("blist", blist);//书籍所有信息
		model.addAttribute("page", page);
		model.addAttribute("pno", pno);
		model.addAttribute("Name", book.getName()); //多条件查询 传递 书名 到前端
		model.addAttribute("publish", book.getPublish());//多条件查询 传递 出版社 到前端
		return "booklist"; 
	}
	
	/*
	 * 修改步骤：1、获取数据；2、正真修改用户
	 */
	//1、获取数据
	@GetMapping("/toUpdateBook/{id}")
	public String toUpdateBookPagae(@PathVariable("id")Integer id,Model model){
		//调用业务处理
		Book book = bService.selectById(id);
		//判断
		if(book!=null){
			model.addAttribute("book", book);
			return "updatebook";
		}
		return null;
	}
	//2、正真修改书籍
	@RequestMapping("/updateBook")
	public String updateBook(Book book){
		//调用业务处理
		int num = bService.updateBook(book);
		//判断
		if(num>0){
			return "redirect:/bookList"; //重定向到/ulist控制层
		}
		return null;
	}
	
	//根据id删除单条用户数据详情
	@RequestMapping("/deletelBook/{id}")
	public String deleteBookById(@PathVariable("id")Integer id,Model model){
		//调用业务处理
		int num = bService.deleteBookById(id);
		//判断
		if(num!=0){
			model.addAttribute("msg", "删除书籍成功");
			return "redirect:/bookList"; //重定向到/bookList控制层
		}
		return null;
	}
	
	//添加书籍
	@RequestMapping("/addBook")
	public String addBook(Book book,Model model){
		//调用业务处理
		int num = bService.addBook(book);
		//判断
		if(num>0){
			model.addAttribute("msg", "添加书籍成功");
			return "redirect:/bookList"; //重定向到/bookList控制层
		}
		return null;
	}

}
