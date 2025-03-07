package com.bookapp.service;

import java.util.Collections;
import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public class OrderDetails {
	private IBookService bookService;

	public void setBoookService(IBookService boookService) {
		this.bookService = boookService;
	}

	public List<Book> showBooks(String author) {
		List<Book> books=bookService.getByAuthor(author);
//		Collections.sort(books,(b1,b2)->b1.getTitle().compareTo(b2.getTitle()));
		if(books.isEmpty())
			throw new BookNotFoundException("book not found exception");
		return books;
	}
	
	public String orderBook(int bookId) {
		Book books=bookService.getById(bookId);
		return books.getTitle();
	}
	
	public double getTotalPriceDiscount(double price,int discountamount) {
		List<Book> books=bookService.getByLessPrice(price);
		return 0;
	}

}
