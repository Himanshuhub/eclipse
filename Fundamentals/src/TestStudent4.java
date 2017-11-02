class Student5{
	int rollno; //instance var
	String name; //instance var 
	
	void insertRecord(int r, String n) { //method
		rollno = r; //intance var pointing to input parameter 
		name = n; //intance var pointing to input parameter
	}
	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}
public class TestStudent4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student5 s5 = new Student5();
		Student5 s6 = new Student5();
		
		s5.insertRecord(201, "Kapil");
		s6.insertRecord(202, "Dyutee");
		
		s5.displayInformation();
		s6.displayInformation();
		

	}

}
