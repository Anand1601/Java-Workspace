/**
 * Open-Close-Principle
 * it states that a class should open to extension and closed to modification
 * 
 *  in below example we can extend the comparator function any time according 
 *  to our need but no change is done in ArrayUtil
 *  
 *  we do not need to modify actual class to add some more functionality.
 *  
 *  so here the class ArrayUtil is close to modifications but open to extension 
 *  using comparator
 */
package solid_principle;


interface ValCmp{
	boolean compare(int a,int b);
}

class ArrayUtil{
	public static void sort(int a[],ValCmp cmp)
	{
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
				if(cmp.compare(a[i],a[j]))
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
	}
}


class Inc implements ValCmp{
	public boolean compare(int a ,int b) {
		return a>b;
	}
}

class Dec implements ValCmp{
	

	@Override
	public boolean compare(int a, int b) {
		// TODO Auto-generated method stub
		return a<b;
	}
}

public class Open_Close_Principle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,2,5,3,6};
ArrayUtil.sort(a, new Inc());
for(int i:a)
	System.out.print(i+" ");
System.out.println();
ArrayUtil.sort(a, new Dec());
for(int i:a)
	System.out.print(i+" ");

	}

}
