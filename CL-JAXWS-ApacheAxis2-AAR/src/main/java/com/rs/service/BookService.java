package com.rs.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import com.rs.model.Book;

@WebService(targetNamespace = "http://service.rs.com")
@SOAPBinding(parameterStyle = ParameterStyle.BARE)
public interface BookService {
	@WebMethod(action = "http://service.rs.com/registerBook")
	@WebResult(targetNamespace = "http://model.rs.com", name = "RegisterBookOut", partName = "param")
	Book registerBook(
			@WebParam(partName = "book", name = "RegisterBookIn", targetNamespace = "http://model.rs.com") Book book);

	@WebMethod(action = "http://service.rs.com/searchBook")
	@WebResult(targetNamespace = "http://model.rs.com", name = "SearchBookOut", partName = "param")
	Book searchBook(@WebParam(partName = "isbn", name = "SearchBookIn") String isbn);
}
