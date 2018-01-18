package practiceJavaPrograms;

import java.util.Arrays; 

public class LargestArray {

	public static int getLargest(int[] a, int total) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[total - 1]; 
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,5,6,3,2};
		int[] b = {44,66,99,77,33,22,55};
		System.out.println("Largest number in array is: " + getLargest(a, 6));
		System.out.println("Largest number in array is: " + getLargest(b, 7));		
	}
}
