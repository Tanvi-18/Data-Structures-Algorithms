package com.jsp.CollectionFramework;

import java.util.TreeSet;

public class MyTreeSet {
	
public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
	//	Insertion order is not maintained
	//	Duplicates are not allowed
		
		tree.add(240);
		tree.add(60);
		tree.add(184);
		tree.add(52);
		tree.add(560);
		tree.add(28);
		tree.add(5);
		
		System.out.println(tree);
		
	}

}
