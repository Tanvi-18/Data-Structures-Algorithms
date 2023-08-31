package com.jsp.MapFramework;

import java.util.Map;

import java.util.HashMap;

public class StudentMap {
	
	public static void main(String[] args) {
		
		Map<Integer, Student> map = new HashMap<>();
		
		map.put(150, new Student(150, "ABC", "abc@mail.com"));
		map.put(2, new Student(2, "LMN", "lmn@mail.com"));
		map.put(48, new Student(48, "PQR", "pqr@mail.com"));
		map.put(5, new Student(5, "EFG", "efg@mail.com"));
		map.put(74, new Student(74, "XYZ", "xyz@mail.com"));
		
		System.out.println(map);
		
	}

}
