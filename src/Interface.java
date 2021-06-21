 interface car{
	int x=1;
	void modal();
}

interface price{

	int z=1;
void dis_pri();
void hi();

}
class  buy{
	
	  buy(int x) { System.out.println("pay :"+x); }
	 
}


class vehicle extends buy implements price, car{

	  vehicle(int x) { super(x); }
	 
	 public void dis_pri() {
		 System.out.print("le le");
	
	 }
	 public void hi()
	 {
		 System.out.println(1);
	 }

	@Override
	public void modal() {
		System.out.print(false);
	}
	 
}

public class Interface {	

	

	
	public static void main(String[] args) {
		vehicle ob=new vehicle(10);

	ob.dis_pri();
	ob.hi();
	}

}
