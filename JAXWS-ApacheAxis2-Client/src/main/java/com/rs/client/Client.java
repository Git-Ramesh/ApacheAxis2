package com.rs.client;

import java.rmi.RemoteException;

import com.rs.service.BookServiceStub;
import com.rs.service.BookServiceStub.Book;
import com.rs.service.BookServiceStub.RegisterBookIn;
import com.rs.service.BookServiceStub.RegisterBookOut;

public class Client {

	public static void main(String[] args) throws RemoteException {
		Book book = new Book();
		book.setId(1);
		book.setIsbn(String.valueOf(101));
		book.setTitle("WebSrvices");
		book.setAuthor("Ramesh");
		book.setPrice(656.0f);
		RegisterBookIn registerBook = new RegisterBookIn();
		registerBook.setRegisterBookIn(book);
		BookServiceStub stub = new BookServiceStub();
		RegisterBookOut registerBook2 = stub.registerBook(registerBook);
		Book registerBookOut = registerBook2.getRegisterBookOut();
		System.out.println(registerBookOut.getId());
	}

}
