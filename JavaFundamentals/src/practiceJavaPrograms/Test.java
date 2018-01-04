package practiceJavaPrograms;

public class Test{
	int x; //instance variable
	double d; //instance variable
	boolean b; //instance variable
	String s;//instance variable

	public static void main(String[] args) {
		Test t1=new Test(); //created object of the class to access instance variables 
		System.out.println(t1.x);
		System.out.println(t1.d);
		System.out.println(t1.b);
		System.out.println(t1.s);
		System.out.println(t1.x );
	}
}