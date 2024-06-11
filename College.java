package day1;
//static variables are accessed using class name 
//non static variables are accessed using class object 

//program to demonstrate static ,non static and local variables 
public class College {

	String cname;  //instance variable 
	String address;
	static int code; // class or static variables 

	public static void main(String[] args) {
	int y=112;// local variable 	
    College c1= new College();
    College c2= new College();
    
    c1.cname="abc";
    c2.cname="xyz";
    code=90;//correct 
    College.code=1234;
    //c1.code=44; 
    System.out.println(c1.cname +"  "+ c2.cname +"  "+ College.code);
    
	}

}
//if static  variable is used outside class then classname must be written 
//before variable name 
class test
{
	void input()
	{
		System.out.println(College.code);
	}
}
