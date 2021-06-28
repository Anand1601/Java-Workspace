package my_package;
abstract class graphics{
	protected int x1 , x2, y1 ,y2;
	
	void set(int x1,int y1,int x2,int y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
public abstract void draw();
	
}

class line extends graphics{
public void draw()
{
	System.out.println("drawing a line b/w ("+x1+","+y1+") and ("+x2+","+y2+").");
}
}

class trian extends graphics{
	public void  draw() {
		System.out.println("draw triangle");
	}
}


public class Abstract_exmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
graphics s=new  line();
s.set(2 , 3 , 4 ,5);
s.draw();
graphics x=new trian();
x.set(4, 5, 5, 9);
x.draw();
		
	}

}
