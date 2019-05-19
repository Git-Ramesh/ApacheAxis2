package com.rs.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book implements Serializable {
	private static final long serialVersionUID = -146701737831346790L;
	private long id;
	private String isbn;
	private String name;
	private String author;
	private float price;
}
