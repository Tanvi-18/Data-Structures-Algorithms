package com.jsp.CollectionFramework;

public class MyArrayListDriver {
	
	public static void main(String[] args) {
		MyArrayList al = new MyArrayList();
		
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		System.out.println(al);

		al.add(51);
		al.add(52);
		al.add(53);
		al.add(54);
		al.add(55);
		al.add(56);
		al.add(57);
		al.add(58);
		
		System.out.println(al);
		al.removeLast();
		System.out.println(al);
		al.add(59);
		System.out.println(al);
		
	}

}
