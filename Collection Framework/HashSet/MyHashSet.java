package com.jsp.CollectionFramework;

import java.util.HashSet;

public class MyHashSet {
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
	
	//	Insertion order is not maintained
	//	Duplicates are not allowed
		
		hs.add("Virat");
		hs.add("Virat");
		hs.add("Dhoni");
		hs.add("Rohit");
		hs.add("Dhawan");
		
		System.out.println(hs);

	}

}