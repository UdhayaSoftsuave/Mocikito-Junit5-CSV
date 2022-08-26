package com.example.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	@Autowired
	private Show show ;
	
	@Autowired
	private sampleMock sampleMock;

	public void add(int first , int second) {
		
		int addimpl = show.addimpl(first + second);
		int integer = sampleMock.getInteger();
		System.out.println(addimpl + integer);
	}
	
//	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		c.add(1, 2);
//	}

}
