package practiceJavaPrograms;

public class VarArgsMethod {
	public static void main(String[] args) {
		sum(); //0
		sum(10); //10
		sum(10,20); //30
		sum(10,20,30,40); //100
		
	}
	public static void sum(int  ...  x) {
		int total = 0;
		for (int i = 0; i < x.length; i++) {
			total += x[i];
		}
		System.out.println("The sum is: "+total);
	}
}
