package practiceJavaPrograms;

public class LocalVariableModifier {
	int[] x;
	public static void main(String[] args) {
		LocalVariableModifier t = new LocalVariableModifier();
		System.out.println(t.x); //shows default value of null as it has not been initialized
//		System.out.println(t.x[0]); //throws null pointer exception as it has no been initialized
	}

}
