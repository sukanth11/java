package com.bookapp.model;

public class Book {
		private String title;
	    private String author;
	    private Integer bookid;
	    private int price;

	    public Book() {
	    	super();
	    }

	    public Book(String title, String author, Integer bookid, int price) {
	        this.title = title;
	        this.author = author;
	        this.bookid = bookid;
	        this.price = price;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public Integer getBookid() {
	        return bookid;
	    }

	    public void setBookid(Integer bookid) {
	        this.bookid = bookid;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "Book{" +
	                "title='" + title + '\'' +
	                ", author='" + author + '\'' +
	                ", bookid=" + bookid +
	                ", price=" + price +
	                '}';
	    }

}
