abstract class triangle{
	int hight,  base;
	triangle(int x ,int y){
		hight=x; 
		base =y;
		
	}
	
	int are()
	{
		return (hight*base)/2;
	}
	abstract int display();
	
}
 class tri extends triangle{
	tri(int x,int y){
		super(x,y);
	}
	
 int display() {
	 return hight*base;
 }

	
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ABSTRACTION OF CLASS;
		/*
		 *we can't create object of triangle as it it abstract class and give
		 * compilation error if we try to do so;
		 */	
		//triangle tr=new triangle(5,6);
		
		tri tr=new tri(5,6);
System.out.print(tr.are());	

//ABSTRACTION OF METHOD


	}

}
