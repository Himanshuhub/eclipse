class Student3{
	int id = 11;
	String name = "Himanshu2";
}

public class InitializationThroughReference {
	public static void main(String[] args) {
		Student3 s2 = new Student3();
		s2.id = 101;
		s2.name = "Sonu";
		System.out.println(s2.id + " " + s2.name); // printing members with a white space
		
	}

}
