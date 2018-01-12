package practiceJavaPrograms;

public class MainMethod {
	public static void main(String[] args) {
		m10();
		System.out.println("main method");
	}
	private static void m10() {
		// TODO Auto-generated method stub
		System.out.println("print String method");
	}
	public static void main(int[] args) {
		System.out.println("print int method");
	}
}

class child extends MainMethod {
	public static void main(String[] args) {
		System.out.println("child class");
	}
	
}