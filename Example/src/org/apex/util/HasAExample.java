package org.apex.util;

public class HasAExample {
	public static void main(String[] args) {
		Address address = new Address("Fremont", 94538);
		Employee employee = new Employee("Apex", address);
		System.out.println(address, );
		System.out.println(employee);
	}

}
