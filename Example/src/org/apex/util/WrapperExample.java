package org.apex.util;

public class WrapperExample {
	public static void main(String[] args) {
		Integer data = new Integer(23);
		data = 24; //boxing = primitive to object 
		int temp = data; // Autoboxing => object to primitive 
		
		Double d = 23.45;
		System.out.println(d.intValue());
	}
}

