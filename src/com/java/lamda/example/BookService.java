package com.java.lamda.example;

import java.util.Collections;
import java.util.List;

public class BookService {
	public List<Book> getBooksInSortByName() {
		List<Book> books = new BookDAO().getBooks();
		
		    //Sort to organize in ascending order of name(Format for dictionary)
		Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}

	public static void main(String[] args) {
		System.out.println(new BookService().getBooksInSortByName());
	}
}
