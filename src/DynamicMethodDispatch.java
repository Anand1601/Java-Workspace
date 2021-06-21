class Superclass{
	int x,y;
	Superclass (int a,int b)
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	
	void dekh()
	{
		System.out.println("mai to chal raha hun");
	}
}


class subclass extends Superclass{
	subclass(int x,int y)
	{
		super(x,y);
	}
	
	@Override
	void display()
	{
		System.out.println(x*y);
	}
	
	void dis() {
		System.out.println("hiiiiiiii...");	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		
Superclass ob=new subclass(5,7);
ob.display();
ob.dekh();


	}

}


//using dynamic method dispatch u can make an object of superclass which
// runs similar to normal but when u call for an overrided method of then it
// calls for the subclass's' method .