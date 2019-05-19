/**
 * BookServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.rs.service;

/**
 * BookServiceSkeleton java skeleton for the axisService
 */
public class BookServiceSkeleton {
	/**
	 * Auto generated method signature
	 *
	 * @param searchBookIn
	 * @return searchBookOut
	 */
	public com.rs.service.SearchBookOut searchBook(com.rs.service.SearchBookIn searchBookIn) {
		SearchBookOut searchBookOut = new SearchBookOut();
		searchBookOut.setSearchBookOut(null);
		return searchBookOut;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param registerBookIn
	 * @return registerBookOut
	 */
	public com.rs.service.RegisterBookOut registerBook(com.rs.service.RegisterBookIn registerBookIn) {
		Book book = registerBookIn.getRegisterBookIn();
		RegisterBookOut registerBookOut = new RegisterBookOut();
		registerBookOut.setRegisterBookOut(book);
		return registerBookOut;
	}
}
