package org.apex.util;

public class Sample {

	public static void main(String[] args) {

		Employee employee = new Employee();
		// employee.display();
		// DRY - Don't repeat yourself

		employee.name = "emp1";
		employee.yearOfBirth = 1990;
		employee.display();
		Employee.companyName = "Google"; // className.staicVariableName
		System.out.println(Employee.companyName); // className.staicVariableName

		Employee employee2 = new Employee("emp2", 1989);
		// employee2.display();
		// employee2.name = "emp2";
		// employee2.yearOfBirth = 1989;
		employee2.display();
		System.out.println(Employee.companyName); // className.staicVariableName

		// TODO Auto-generated method stub
		// to share data between 2 objects you should
		// save the data in the class and not in the method

		System.out.println();
	}

}

class Employee {
	// static or class level variables
	static String companyName = "Amzon";
	// static variables are compile time
	// class is like a package and comes with 2 things
	// Data
	// Local variables
	// instance variables
	// inside Class but outside Method
	// static variables
	// Methods
	// Constructors
	// main purpose is to initialize the object data
	// Methods

	// instance variable
	String name;
	int yearOfBirth;

	// Constructor
	// constructor name must be same as class name
	Employee() {
		name = "employee";
		yearOfBirth = -1;
	}

	// Employee (String n, int y) { //same name constructor but accepts arguments
	// name = n;
	// yearOfBirth = y;
	// }

	Employee(String name, int yearOfBirth) { // same name constructor but accepts arguments
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Year of Birth: " + yearOfBirth);
		System.out.println("Age: " + getAge());
	}

	int getAge() {
		int currentYear = 2017; // local variable
		int age = currentYear - yearOfBirth; // local variable
		return age;
	}

}