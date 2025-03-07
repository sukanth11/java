package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
class OrderDetailsTest {
	@Mock
	IBookService bookSeervice;
	
	@InjectMocks
	OrderDetails orderDetails;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	List<Book> bookList;
	Book book1,book2,book3,book4,book5,book6;
	
	@BeforeEach
	void setUp() throws Exception {
		book1=new Book("java","sukanth",2000,2);
		book2=new Book("python","kishor",1400,1);
		book3=new Book("css","sukanth",500,1);
		book4=new Book("html","kalandhar",300,1);
		book5=new Book("c","sukanth",800,1);
		book6=new Book("c++","prajwal",1200,1);
		bookList =Arrays.asList(book1,book2,book3,book4,book5,book6);
		}

	@AfterEach
	void tearDown() throws Exception {
		orderDetails=null;
	}

	@Test
	void testShowBooks() {
		String author="sukanth";
		List<Book> booksByAuthor=Arrays.asList(book1,book3,book5);
		Mockito.when(bookSeervice.getByAuthor(author)).thenReturn(booksByAuthor);
		List<Book> expected=Arrays.asList(book5,book3,book1);
		List<Book> actual=orderDetails.showBooks(author);
		assertEquals(expected,actual);
	}
	@Test
	void testShowNoBooks() {
		String author="nikhal";
		Mockito.when(bookSeervice.getByAuthor(author)).thenReturn(new ArrayList<Book>());
		assertThrows(BookNotFoundException.class, ()->orderDetails.showBooks(author));
		
		
	}
	@Test
	void testExShowNoBooks() {
		String author="nikhal";
		Mockito.when(bookSeervice.getByAuthor(author)).thenThrow(BookNotFoundException.class);
		assertThrows(BookNotFoundException.class, ()->orderDetails.showBooks(author));
		
		
	}

}
