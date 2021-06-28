package my_package;
class volume extends area{
	int c;
	volume(int x,int y,int z)
	{
		super(x,y);
		c=z;
	}
	int vol()
	{
		return ar()*c;
	}
}


class area{
	int a,b;
	area(int x,int y)
	{
		a=x;
		b=y;
	}
	
int ar()
{
	return a*b;
}
	
}




public class SingleInheritance {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
volume vol=new volume(2 ,3, 5);
System.out.println(vol.ar());
System.out.println(vol.vol());
	}

}
