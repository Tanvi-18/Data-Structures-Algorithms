package com.jsp.CollectionFramework;

public class MyLinkedListDriver {
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		Node<Integer> head = new Node(50);
		
		ll.add(head, 20);
		ll.add(head, 40);
		ll.add(head, 60);
		ll.add(head, 25);
		ll.add(head, 45);
		ll.add(head, 68);
		
		ll.print(head);

		
	}
	
	
	
	
	
	

}
