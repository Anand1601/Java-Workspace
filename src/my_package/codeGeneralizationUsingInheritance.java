package my_package;
class Human{
	void print()
	{
		System.out.println("human");
	}
}
class Male extends Human{
	void print()
	{
		System.out.println("man");
	}
}
class female extends Human{
	void print() {
	System.out.println("female");

	}}

class girl extends female {	

	void print() {
	System.out.println("girl");
}
}
class boy extends Male{
	void print() {
System.out.println("boy");	
}
}

public class codeGeneralizationUsingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Human h=new Human();
HowAmI(h);

Human hm=new Male();
hm.print();


Male M=new Male();
HowAmI(M);
female f=new female();
	HowAmI(f);
girl g=new girl();
HowAmI(g);
boy b=new boy();
HowAmI(b);
	}
	
	
	//taking the all object as Human to this func is similar to 
	//superClass c=new Subclass();
//which is dynamicDispatch;
static void  HowAmI(Human ob)
	{
ob.print();
	}
		
}
