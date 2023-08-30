package com.jsp.CollectionFramework;

import java.util.Vector;

public class MyVector {
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
	//	Insertion order is maintained
	//	Duplicates are allowed	
	
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		v.add(80);
		System.out.println(v);
		
	}

}
