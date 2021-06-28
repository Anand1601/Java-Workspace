package solid_principle;
/*
 * this principle states that on class should implement only a single functionality.
 * it doesn't mean one class cann't have a more than one functionality
 * 
 * lets create an small AccountCreationProject
 * it has three functionality
 * - taking the account details to open an account
 * - saving the data to the data base
 * - sending a message/notification to the account holder
 * 
 * 
 * see the example below although the class AccountServices is doing all the three 
 * Responsibility, but any class is not implementing more than one method (or responsibility)
 */


class AccountServices{
	
	AccRepository repo=new AccRepository();
	NotificationServices noti=new NotificationServices();
	
	public void openAcc(/*it takes some inputs*/){
		//task 1
		
		System.out.println("fill account internal details");
		//task 2
		repo.create();
		//task 3
		noti.Notification();
	}
	
}

class AccRepository {
	
	public void create(/*inputs*/)
	{
		System.out.println("creating the account");
	}
}

class NotificationServices{
	public void Notification(/*may take some inputs*/) {
		System.out.println("sending the welcome to the account holder");
	}
}


public class Single_Responsiblity_principle {

	public static void main(String args[])
	{
	AccountServices ob=new AccountServices();
	ob.openAcc();
	}

}
