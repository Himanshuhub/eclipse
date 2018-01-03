package practiceJavaPrograms;

public class ArrayNonprimitiveDataType {

//	eg.1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] a=new Object[10];
		a[0] = new Object();
		a[1]=new String("Durga");
		a[2]=new Integer(10);
		
		System.out.println(a[0]); //java.lang.Object@3d04a311
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		System.out.println(a[8]);
		System.out.println(a[8]);
		System.out.println(a[8]);
		System.out.println(a[8]);
		

	}

}
