package practiceJavaPrograms;

import java.util.*;

public class CreateLargestNumber {
	public String largestNumber(int[] nums) { //method to get largest number
		// TODO Auto-generated method stub
		String[] arr = new String[nums.length]; //created new array of string data type with same length
		for(int i; i< nums.length; i++) { 
			arr[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a, String b) {
				return (b+a).compareTo(a+b);
			}
		});
		StringBuilder sb = new StringBuilder();
		for(String s: arr) {
			sb.append(s);
		}
		while(sb.charAt(0)=='0'&& sb.length()>1)
			sb.deleteCharAt(0);
		return sb.toString();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
