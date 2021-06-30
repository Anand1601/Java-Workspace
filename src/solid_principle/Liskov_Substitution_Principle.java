package solid_principle;

/*
 * Liskov Substitution principle
 *  -objects of super class shall be replaced with object of Subclass.
 *  - inheritance is done only when it is required don't do it just to reuse 
 *  the code. 
 * ---READ MORE ABOUT IT---------
 */


class vehicle{
void start() {
	System.out.println("Starting vehicle");

}
void stop() {
	System.out.println("Stop vehicle");
}
	
}


class car extends vehicle{
void start() {
	System.out.println("Starting car");

}
void stop() {
	System.out.println("Stop car");
}
	
}



class bike extends vehicle{
void start() {
	System.out.println("Starting bike ");

}
void stop() {
	System.out.println("Stop bike");
}
	
}


public class Liskov_Substitution_Principle {
 
	public static void fun(vehicle vl)
	{
		vl.start();
		vl.stop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun(new vehicle());
		fun(new car());
		fun(new bike());
		
	}

}
