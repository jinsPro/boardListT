package com.example.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.dao.BookDAO;
import com.example.hello.vo.BookInfoVO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookDAO;

	@Override
	public void add(BookInfoVO bi) {
		this.bookDAO.add(bi);
	}

	@Override
	public List<BookInfoVO> getBookList(BookInfoVO bi) {
		return this.bookDAO.getBookList(bi);
	}

	@Override
	public List<BookInfoVO> getDetailList(int bno) {
		return this.bookDAO.getDetailList(bno);
	}

	@Override
	public void editList(BookInfoVO bi) {
		this.bookDAO.editList(bi);
	}

	@Override
	public void delList(int bno) {
		this.bookDAO.delList(bno);
	}





}
