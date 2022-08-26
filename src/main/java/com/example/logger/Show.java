package com.example.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Show {
	
	private String s;
	
	@Autowired
	private StringValue stringValue;
	
	
	public int addimpl(int value) {
		value = value + 5;
		this.s = "udhaya";
		System.out.println("addimpl " + value);
		String string = stringValue.get();
		System.out.println("another Method "+string);
		return value;
	}
	
	public static int   addimpl1() {
		return 77;
	}
	
	public String get() {
		return s;
	}
	
	

}
