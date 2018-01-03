package practiceJavaPrograms;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] argh = {"a","b","c"};
		args = argh;
		
		for(int i=0; i<argh.length; i++) {
			System.out.println(argh[i]);
		}

		for(String s:argh) {
			System.out.println(s);
		}

	}

}
