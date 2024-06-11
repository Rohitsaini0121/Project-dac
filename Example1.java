package day1;
//public 
//private 
//protected 
//default  - by default 
public class Example1 {
      int a;          //default  scope within package
      private int b;  //scope is within class methods 
      protected int c;//limited scope--> within package 
	  public  int y=10; //accessible outside package 
	  public  int x=12;
	  public static int z=10;
	 
	 public void show()
	 {
		 a=11;
		 b=33;
		 c=33;
		 y=33;
		 
		 System.out.println("testing show");
	 }

}
