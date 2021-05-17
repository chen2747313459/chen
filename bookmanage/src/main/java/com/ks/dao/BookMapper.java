package com.ks.dao;

import java.util.List;

import com.ks.entity.Book;

import tk.mybatis.mapper.common.Mapper;

public interface BookMapper extends Mapper<Book>{
	
	//多条件模糊查询所有并分页（书名、出版社）来查询
	List<Book> selectBookByMany(Book book);
	

}
