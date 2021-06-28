package my_package;
 interface inter{

	 int x=10;
	void g();
	
	// although interface can not implement any method but it can has some default methods
	default void f() {
		System.out.println("hi buddy");
	}
	
}

interface inter2 extends inter{
	
	
	 	default void hx()
	{

		System.out.println(x);
	}
}

class hi implements inter2{
	public void g()
	{
		System.out.println("hi "+x);
	}
	
	public void fx()
	{
		System.out.println("it's fx()");
	}
	
}


public class DefultMethods_In_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter ob1=new hi();
		ob1.g();
		ob1.f();

	//ob1.hx(); //this will give compilation error because inter doesn't know hx();
	//ob1.fx();	//this is not known to inter 	
inter2 ob2=new hi();
ob2.g();
ob2.f();
ob2.hx();
//ob2.fx() //not known to inter2;
hi ob3=new hi();
ob3.g();
ob3.f();
ob3.hx();
ob3.fx();

	}

}
