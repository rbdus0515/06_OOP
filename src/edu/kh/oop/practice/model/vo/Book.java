package edu.kh.oop.practice.model.vo;

public class Book {
	
	private String title; // 도서명
	private int price; // 도서명
	private double discountRate; // 도서명
	private String author; // 도서명

	public void Book() {
		
	}
	
	public void Book(String title, int price, double discountRate, String author) {
		
	}
	
	public String toString() {
		return title + price + discountRate + author ;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
