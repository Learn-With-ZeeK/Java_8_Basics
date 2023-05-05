package com.java.lamda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(100, "Core Java", 500));
		books.add(new Book(101, "ZCore Java", 400));
		books.add(new Book(363, "Hibernate", 180));
		books.add(new Book(275, "Spring", 200));
		books.add(new Book(893, "WebService", 300));
		return books;
	 }

}
