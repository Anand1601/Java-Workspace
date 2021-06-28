package my_package;

public class Varargs {
	
	Varargs(int...x){
		for(int i:x)
			System.out.println(i);
	}
	

static void fun(int x, String... str)
{
	System.out.println(x);
	for(String i:str)
	{
		System.out.println(i);
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubc
		
		fun(5,"hi","bali","text","uska","lol");
		new Varargs(5,6,7,8,9);
		
		
	}

}
