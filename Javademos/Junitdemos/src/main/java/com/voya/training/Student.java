package com.voya.training;

public class Student {
	public int totalMarks(int marks1,int marks2,int marks3) {
		if(marks1<0 || marks2<0 || marks3<0) 
			throw new InvalidNumberException("marks is less than 0");
		if(marks1>100 || marks2>100 || marks3>100)
			throw new InvalidNumberException("marks is greater than 100");
		return marks1+marks2+marks3;
	}
}
