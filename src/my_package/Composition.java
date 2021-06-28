package my_package;
class basicCal{
	
public int add(int a,int b)
{
return a+b;	
}
	int sub(int a,int b)
	{
		return a-b;
	}
}


class SifiCal1 extends basicCal{

	int mult(int a ,int b)
	{
		return a*b;
		
	}
	
	int div(int a,int b)
			{
		return a/b;
		
			}
	
}


// this is another method of calling inheritance and in more of cases we do this
// in place of inheritance. this is called composition.
//there are two kinds of compositions :1. aggregation 2.association
class SifiCal2{    
	
	private basicCal basic=new basicCal();
	
	int add(int a,int b) {

	return 	basic.add(a, b);
	}
	
	int sub(int a,int b)
	{
		return basic.sub(a, b);
	}
	
	int mul(int a,int b) {
		return  a*b;
	}
	int div(int a,int b){
		return a/b;
	}
}



public class Composition {
 

	public static void main(String args[])
	{
		SifiCal1 ob1=new SifiCal1();
	System.out.println(ob1.add(5, 7));
	SifiCal2 ob2=new SifiCal2();
	System.out.println(ob2.add(12, 7));
	}
	
}
