package practiceJavaPrograms;

public class OOPDemo {
	public static void main(String[] args) {
		JobApplication.companyName = "Apex";

		JobApplication ram = new JobApplication();
		ram.firstName = "Ram";
		ram.middleName = "Sita";
		ram.lastName = "Chandra";
		

		ram.display();		
	}
}

class JobApplication {
	
	String firstName; //instance variable - individual for every instance/object
	String lastName; //instance variable
	String middleName; //instance variable
	int year; //instance variable
	double salary;//instance variable
	
	static String companyName;
	
	JobApplication(){ //Default Constructor - Same name as class name 
		firstName = "Ram Name";
		lastName = "Default Last Name";
		middleName = "Default Middle Name";
		year = 1900;
		salary = 100000.0000;
	}

	JobApplication(String firstName, String lastName, String middleName, int year, double salary){ //Parametrized Constructor - Same name as class name 
		this.firstName = "Ram Name";
		this.lastName = "Default Last Name";
		this.middleName = "Default Middle Name";
		this.year = 1900;
		this.salary = 100000.0000;
	}

	void display() { //method or function 
		int currentYear = 2018; //local variable 
		int age = currentYear - year; //local variable 
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Middle name: " + middleName);
		System.out.println("Year: " + year);
		System.out.println("Salary: " + salary);
		System.out.println("Age: " + currentYear);
		System.out.println(companyName);
	}
	
}