class Rectangle2{
	int length; 
	int width;
	void insert(int l, int w) {
		length = l;
		width = w;
		
	}//method insert
	void calculateArea() {
		System.out.println(length*width);
	}//calculateArea method
}//class


public class MultipleObjectsByOneTypeOnly {	

	public static void main(String[] args) {
//		int a=10, b=20;
		Rectangle2 r1 = new Rectangle2(), r2= new Rectangle2(); //creating 2 objects 
		r1.insert(11,5);
		r2.insert(3, 15);
		r1.calculateArea();
		r2.calculateArea();

	}

}
