package com.jsp.CollectionFramework;

import java.util.Stack;

public class MyStack {
	
	public static void main(String[] args) {

		Stack<String> s = new Stack<String>();
		
	//	Insertion order is maintained
	//	Duplicates are allowed
		
		s.push("Book1");
		s.push("Book2");
		s.push("Book3");
		s.push("Book4");
		s.push("Book5");
		s.push("Book6");
		
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
		
	}

}
