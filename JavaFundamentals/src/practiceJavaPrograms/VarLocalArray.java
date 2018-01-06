package practiceJavaPrograms;

public class VarLocalArray {
	public static void main(String[] args) {
		int[] x = new int[3];
		System.out.println(x); //array name
		System.out.println(x[0]); //default value 0 assigned once we create array object
	}
	private void m1(int... x) {
		// TODO Auto-generated method stub
		System.out.println(x);

	}

}
