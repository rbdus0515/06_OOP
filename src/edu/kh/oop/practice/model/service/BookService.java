package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		Book b1 = new Book();
		
		b1.setTitle("");
		b1.setPrice(0);
		b1.setDiscountRate(0.0);
		b1.setAuthor("");
		
		System.out.println(b1.setTitle(null));
		System.out.println(b1.setPrice(0));
		System.out.println(b1.setDiscountRate(0.0));
		System.out.println(b1.setAuthor(null));
		
		Book b2 = new Book();

		b2.setTitle("자바의 정석");
		b2.setPrice(30000);
		b2.setDiscountRate(0.2);
		b2.setAuthor("남궁성");
		
		
	}

}
