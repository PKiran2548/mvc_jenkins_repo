package com.RenuIT.model;

public class Book {
	
	private int bookId ;
	
	private String bookName ;
	
	private double bookPrize ;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrize() {
		return bookPrize;
	}

	public void setBookPrize(double bookPrize) {
		this.bookPrize = bookPrize;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrize=" + bookPrize + "]";
	}
	
	

}
