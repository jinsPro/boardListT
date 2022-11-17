package com.example.hello.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data  @Alias("book")
public class BookInfoVO {
	
	private int bno;
	private String title;
	private String cont;

	
}
