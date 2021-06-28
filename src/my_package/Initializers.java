package my_package;
class Sample
{
	static {
		System.out.println("static initializer");	
		}
	
	{
		System.out.println("non static initializer");
	}


}

public class Initializers {

	
	
	
	public static void main(String[] args) {

Sample ob1;
Sample ob2;
ob1=new Sample();
ob2=new Sample();

	}

}
