package com.ks.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ks.dao.BookMapper;
import com.ks.entity.Book;
import com.ks.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	//依赖注入
	@Autowired
	private BookMapper bMapper;

	//多条件模糊查询所有并分页（书名、出版社）来查询
	@Override
	public List<Book> getBookByMany(Book book) {
		return bMapper.selectBookByMany(book);
	}

	//根据id查询单条 书籍数据 详情
	@Override
	public Book selectById(Integer id) {
		return bMapper.selectByPrimaryKey(id);
	}
	//2、正真修改书籍
	@Override
	public int updateBook(Book book) {
		return bMapper.updateByPrimaryKeySelective(book);
	}

	//根据id查询单条 书籍数据 删除
	@Transactional
	public int deleteBookById(Integer id) {
		return bMapper.deleteByPrimaryKey(id);
	}

	//添加书籍
	@Transactional
	public int addBook(Book book) {
		return bMapper.insertSelective(book);
	}

	

}
