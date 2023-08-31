package com.jsp.MapFramework;

import java.util.Map;

import java.util.LinkedHashMap;

public class EmployeeMap {
	
public static void main(String[] args) {
		
		Map<Integer, Employee> map = new LinkedHashMap<>();
		
		map.put(150, new Employee(150, "ABC", "abc@mail.com"));
		map.put(2, new Employee(2, "LMN", "lmn@mail.com"));
		map.put(45, new Employee(45, "PQR", "pqr@mail.com"));
		map.put(5, new Employee(5, "EFG", "efg@mail.com"));
		map.put(36, new Employee(36, "XYZ", "xyz@mail.com"));
		
		System.out.println(map);
		
	}


}
