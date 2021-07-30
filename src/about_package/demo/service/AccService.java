package about_package.demo.service;

public class AccService {
AccInternalService internalService=new AccInternalService();
   public void open_acc()
   {
       System.out.println("opening an account - "+ internalService.generateAccID());

   }

}
