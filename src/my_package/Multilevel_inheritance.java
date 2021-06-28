package my_package;
class Totalarea extends volume1{
	Totalarea(int x,int y,int z)
	{
		super(x,y,z);
	}
	
 int total_ar()
 {
	 return 2*(a*b+b*c+c*a);
 }
 
}

class volume1 extends area1{
	int c;
	volume1(int x,int y,int z)
	{
		super(x,y);
		c=z;
	}
	int vol()
	{
		return ar()*c;
	}
}


class area1{
	int a,b;
	area1(int x,int y)
	{
		a=x;
		b=y;
	}
	
int ar()
{
	return a*b;
}
	
}

public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Totalarea room=new Totalarea(2,3,5);
	
	System.out.println(room.ar());
	System.out.println(room.vol());
	System.out.println(room.total_ar());
	
	}

}
