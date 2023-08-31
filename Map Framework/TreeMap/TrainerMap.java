package com.jsp.MapFramework;

import java.util.Map;

import java.util.TreeMap;

public class TrainerMap {
	
public static void main(String[] args) {
		
		Map<Integer, Trainer> map = new TreeMap<>();
		
		map.put(150, new Trainer(150, "ABC", "abc@mail.com"));
		map.put(2, new Trainer(2, "LMN", "lmn@mail.com"));
		map.put(45, new Trainer(45, "PQR", "pqr@mail.com"));
		map.put(5, new Trainer(5, "EFG", "efg@mail.com"));
		map.put(36, new Trainer(36, "XYZ", "xyz@mail.com"));
		
		System.out.println(map);
		
	}

}
