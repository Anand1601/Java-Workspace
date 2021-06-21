class Nest{
	int x, y;
	Nest(int a , int b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println(large());
	}
	
	int large()
	{
	return 	small();
	}
	
	int small()
	{
		if(x>y)
			return y;
		else
			return x;
	}
	
}


public class Nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Nest nest=new Nest(28,26);
nest.display();
display();
	}
	
public static void display() {
	System.out.print("hi");
}

}
