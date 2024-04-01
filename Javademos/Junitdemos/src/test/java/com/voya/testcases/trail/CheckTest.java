package com.voya.testcases.trail;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CheckTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNull() {
		List<String> mylist=null;
		assertNull(mylist);
		
	}
	@Test
	@Tag("first")
	void testNotNull() {
		List<String> mylist=new  ArrayList<>();
		assertNotNull(mylist);
	}
	
	@Test
	@Tag("simple")
	void testSame() {
		String userName="sukanth";
		String nUserName="sukanth";
//		String nUserName=new String("sukanth");
		assertSame(userName,nUserName,"reference are not same");
	
	}
	

}
