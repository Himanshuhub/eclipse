package practiceJavaPrograms;

public class VarArgsMethod {
	public static void m1(int... args) {
		System.out.println("var-arg method");

	}
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20);
		m1(10,20,30,40);
//		m1(hi);
		
	}

}
