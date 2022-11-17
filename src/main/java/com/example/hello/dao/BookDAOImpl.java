package com.example.hello.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.hello.vo.BookInfoVO;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private SqlSession sqlsession;

	@Override
	public void add(BookInfoVO bi) {
		this.sqlsession.insert("book_add",bi);
	}

	@Override
	public List<BookInfoVO> getBookList(BookInfoVO bi) {
		return this.sqlsession.selectList("book_List",bi);
	}

	@Override
	public List<BookInfoVO> getDetailList(int bno) {
		return this.sqlsession.selectList("detail_List",bno);
	}

	@Override
	public void editList(BookInfoVO bi) {
		this.sqlsession.update("edit_List",bi);
	}

	@Override
	public void delList(int bno) {
		this.sqlsession.delete("del_List",bno);
	}





}

