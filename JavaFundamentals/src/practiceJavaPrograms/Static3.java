package practiceJavaPrograms;

public class Static3 {
	static int x = 10; //static variable 
	int y = 20; //instance variable 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static3 t1 = new Static3();
		t1.x=888;
		t1.y=999;
		
		Static3 t2=new Static3();
		System.out.println(t2.x);
		System.out.println(t2.y);
		System.out.println(t2.x+" "+t2.y);

	}

}
