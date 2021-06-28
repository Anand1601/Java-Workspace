package my_package;
import java.util.*;

abstract class check{

int findVal(int arr[],int x)
{
	for(int i=0;i<arr.length;i++)
	if(func(arr[i],x))
		return i;
return -1;
}

abstract boolean func(int a, int x);

}

class equal extends check{
	boolean func(int a,int b)
	{
		return a==b;
	}
}

class unequal extends check{
	boolean func(int a,int b)
	{
		return !(a==b);
	}
}


class abstraction_templet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,5,3,2,2};
Scanner scn=new Scanner(System.in);
int x=scn.nextInt();

check ob=new equal();
System.out.println(ob.findVal(arr, x));
check ob1=new unequal();
System.out.println(ob1.findVal(arr, x));
scn.close();

	}

}
