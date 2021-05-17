package com.ks.entity;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@Table(name="book")
public class Book {
	@Id
   @KeySql(useGeneratedKeys=true)
	private Integer id;
	private String Name;
	private String Author;
	private String publish;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date publishdate;
	private Integer Page;
	private Integer Price;
	private String Content;
	

}
