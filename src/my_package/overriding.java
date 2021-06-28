package my_package;
class dimension{
	int length,width;
dimension(int x,int y)
{
	length=x;
	width=y;
}

 void display()
{
	System.out.println("Length is: "+length);
	System.out.println("width is : "+width);
	
}
int ar()
{
	return length*width;
}

}

class area2 extends dimension{
	area2(int x,int y)
	{
		super(x,y);
	}
	
	  @Override 
	  void display() 
	  {
		  super.display();
		  System.out.println("hi"); }
	 
	
}



public class overriding {

	public static void main(String[] arg)
	{
		
		  area2 room=new area2(5 ,7); 
		  room.display();
		 

	}
	
}
