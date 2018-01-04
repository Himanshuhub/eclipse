package practiceJavaPrograms;

public class TestStatic {
	static int x=10;
	public static void main(String[] args) {
		TestStatic t=new TestStatic();
		System.out.println(t.x); //access static variable using object reference
		System.out.println(x); //access static variable directly in same class
		System.out.println(TestStatic.x); //access static variable using class name directly
		//recommended to use class name
		//within same class we can access it directly - not required to use class name 
//		System.out.println(m1());
	}
	public void m1() {
		System.out.println(x);

	}
	

}
