//new Calculation();//anonymous object  
/*
Calling method through reference:
Calculation c=new Calculation();  
c.fact(5);  
Calling method through anonymous object
new Calculation().fact(5);   
 */
public class Calculation {

		void fact (int n) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			} //for
		System.out.println("factorial is :" + fact);
		} //method

		public static void main(String[] args) {
			new Calculation().fact(5); //calling method with anonymous object 

	} //main method

}// class 
