package com.example.hello.service;

import java.util.List;

import com.example.hello.vo.BookInfoVO;

public interface BookService {

	void add(BookInfoVO bi);

	List<BookInfoVO> getBookList(BookInfoVO bi);

	List<BookInfoVO> getDetailList(int bno);

	void editList(BookInfoVO bi);

	void delList(int bno);




}
