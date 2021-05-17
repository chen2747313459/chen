package com.ks.service;

import java.util.List;

import com.ks.entity.Book;

public interface BookService {
	//多条件模糊查询所有并分页（书名、出版社）来查询
	List<Book> getBookByMany(Book book);
	
	//根据id查询单条 书籍数据 详情
	Book selectById(Integer id);
	//2、正真修改书籍
	int updateBook(Book book);
	
	//根据id查询单条 书籍数据 删除
	int deleteBookById(Integer id);
	
	//添加书籍
	int addBook(Book book);

}
