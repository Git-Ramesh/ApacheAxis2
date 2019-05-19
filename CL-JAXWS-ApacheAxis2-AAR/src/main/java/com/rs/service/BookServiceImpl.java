package com.rs.service;

import javax.jws.WebService;

import com.rs.model.Book;

@WebService(endpointInterface = "com.rs.service.BookService")
public class BookServiceImpl implements BookService {

	@Override
	public Book registerBook(Book book) {
		System.out.println("registerBook");
		return book;
	}

	@Override
	public Book searchBook(String isbn) {
		return null;
	}

}
