
public class TypeOfClass {
	 

	static class static_nested{  //static nested class
		void hi()
		{
			System.out.println("static nested");
		}
	}
	
void local(){        
	int sum=20;
 	class local_inner_class{    //Local inner class 
 	int div;
 		int ans;
 	private local_inner_class()
 		{
 			div=2;
 			ans=sum/div;
 		}
 void get_val() {
	 System.out.println( ans);
 }
 	
 	}
	local_inner_class ob=new local_inner_class();
 	ob.get_val();
	}
	
	public static void main(String[] args) {
	
		TypeOfClass.static_nested h=new TypeOfClass.static_nested();
		h.hi();
	TypeOfClass ob2=new TypeOfClass();
	ob2.local();
		
	}

}
