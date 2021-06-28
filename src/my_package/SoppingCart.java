package my_package;
class CartItem{
String ItemCode;
	 int Quantity;

	public CartItem(String ItemCode,int quantity)
	{
		this.ItemCode=ItemCode;
		this.Quantity=quantity;
	}
	
	public String getItemCode() {
		return ItemCode;
	}
	public int getQuntity(){
		return Quantity;
		
	}
	
	
}

class Cart{
 private CartItem items[];
 private int itemCount;
 private int size;
 private static final int DEFAULT_SIZE=10;
 Cart()
 {
	 initializer(DEFAULT_SIZE);
 }
 
 Cart(int n)
 {
	initializer(n);
 }
 
 private void initializer(int n)
 {
	 items=new CartItem[n];
	 this.size=n;
 }
 
 void addToCart(CartItem item)
 {
	
	if(itemCount<size)
	 this.items[itemCount++]=item;
	else 
		System.out.print("Cart is full");
 }
 
 public  void order()
 {
	 for(int i=0;i<itemCount;i++) {
		 System.out.printf("%S %d \n",items[i].getItemCode(),items[i].getQuntity());
	 }
 }

	
}

public class SoppingCart {

	public static void main(String args[])
	{
Cart cart=new Cart();
cart.addToCart(new CartItem("ab",3));
cart.addToCart(new CartItem( "cd",5));
cart.order();
	}
	
}
