package com.p1;

import java.util.HashSet;

public class Library {
	public static void main(String[] args) {
		HashSet<Book> booksList=new HashSet<>();
		
		booksList.add(new Book(1,"Name1","Author1"));
		booksList.add(new Book(2,"Name2","Author1"));
		booksList.add(new Book(3,"Name1","Author1"));
		booksList.add(new Book(1,"Name4","Author2"));
		
		for(Book book:booksList) {
			System.out.println(book);
		}
	}
}
