package my_package;
	interface Add{
		int x=5;
		void getadd();
	}
public class AnonymousClass {


	
	public static void main(String[] args) {
Add a=new Add()
{
@Override
public void getadd()
	{
		System.out.print("add 7 with x is: "+(7+x));
	}
};

	a.getadd();	
		
	}

}
