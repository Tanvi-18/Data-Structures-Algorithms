package com.jsp.CollectionFramework;

import java.util.Queue;
import java.util.LinkedList;

public class MyQueue {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
	
	//	Insertion order is maintained
	//	Duplicates are allowed
		
		queue.add("Book1");
		queue.add("Book2");
		queue.add("Book3");
		queue.add("Book4");
		queue.add("Book5");
		
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

	}
}
