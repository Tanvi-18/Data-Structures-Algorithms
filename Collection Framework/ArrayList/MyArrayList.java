package com.jsp.CollectionFramework;

public class MyArrayList {
	
	private int data[];
	private int nextElement;
	
	
		// Constructors
		public MyArrayList() {
			data=new int[10];
			nextElement = 0;
		}
		
		public MyArrayList(int size) {
			data=new int[size];
			nextElement=0;
		}
		
		public MyArrayList(int newData[]) {
			data=new int[newData.length];
			for(int i=0; i<newData.length; i++) {
				data[i] = newData[i];
				nextElement++;
			}
		}
		
		
		@Override 
		public String toString() {
			System.out.print("[");
			for(int i=0; i<data.length; i++) {
				System.out.print(data[i] + ", ");
			}
			return "]";
		}
		
		
		public boolean isEmpty() {
			return nextElement==0;				
		}
		
		
		public int size() {
			return nextElement;
		}
		
		
		// to add element in MyArrayList
		public void add(int element) {
			if(nextElement == data.length) {
				incrementCapacity();
			}
			data[nextElement]=element;
			
			nextElement++;
		}
		
		
		// to increase current capacity
		private void incrementCapacity() {
			int temp[]=data;
			data = new int[temp.length*(3/2)+1];
			for(int i=0; i<temp.length; i++ ) {
				data[i]=temp[i];
			}
		}	
		
		
		
		// to remove last element from MyArrayList
		public int removeLast() {
			int temp = data[nextElement-1];
			data[nextElement-1]=0;
			nextElement--;
			return temp;
		}

}

