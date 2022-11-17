package com.example.hello.dao;

import java.util.List;

import com.example.hello.vo.BookInfoVO;

public interface BookDAO {

	void add(BookInfoVO bi);

	List<BookInfoVO> getBookList(BookInfoVO bi);

	List<BookInfoVO> getDetailList(int bno);

	void editList(BookInfoVO bi);

	void delList(int bno);





}
