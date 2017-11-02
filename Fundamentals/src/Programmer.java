class Employee3{  
 float salary=40000;  
}  
class Programmer2 extends Employee3{  
 int bonus=10000;  
 public static void main(String args[]){  
   Programmer2 p=new Programmer2();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  