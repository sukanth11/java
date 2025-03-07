package com.student.testcases;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.InvalidNumberException;
import com.voya.training.Student;

class StudentyTest {
	Student student=null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("called before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("called after all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		student=new Student();
		System.out.println("called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		student=null;
		System.out.println("called after each testcases");
	}

	@Test
	void testTotalMarks() {
		int actual=student.totalMarks(10,20,30);
		assertEquals(60, actual, "should be 60");
	}
	
	@Test
	@Tag("negetive")
	void testNegetiveMarks() {
		assertThrows(InvalidNumberException.class, ()->student.totalMarks(50, 80, -40));
		
	}
	
	@Test
	void testGreaterMarks() {
		assertThrows(InvalidNumberException.class, ()->student.totalMarks(150, 80, 240));
		
	}

}
