package com.voya.training;

import java.util.Arrays;
import java.util.List;

public class Calculator {
	

	public int sum(int a,int b) {
			return a+b;
	}		
	public int product(int a,int b) {
		return a*b;
		
	}
	public String greetMessage(String name) {
		return "Hii "+name;
	}
	public List<String> showCourse(){
		return Arrays.asList("java","Spring","html");
		
	}
}
	


