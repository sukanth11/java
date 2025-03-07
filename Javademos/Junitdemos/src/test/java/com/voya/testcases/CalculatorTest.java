package com.voya.testcases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.voya.training.Calculator;

public class CalculatorTest {
	Calculator calculator=null;

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
		calculator=new Calculator();
		System.out.println("called before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
		System.out.println("called after each testcases");
	}
	

	@Test
	void testSum() {
		int actual=calculator.sum(10,20);
		assertEquals(30, actual, "should be 30");
	}
	@Test
	void testProduct() {
		int actual=calculator.product(10,5);
		assertEquals(50, actual, "should be 50");
	}
	@Test
	void testString() {
		String actual= calculator.greetMessage("sukanth");
		assertEquals("Hii sukanth", actual, "not equal");
	}
	
	@Test
	@Tag("first")
	void testshowCourse() {
		List<String> actual= Arrays.asList("java","Spring","html");
		assertEquals(Arrays.asList("java","Spring","html"), actual, "array 3 values");
	}

}
