package about_package;
//we can also do the things done in packageEg1 in an efficient manner;

//import about_package.demo.service.*;  // it will import all the (*public) functionalities of demo.service package.

 import about_package.demo.service.AccService; //allow to use the AccService class in this class
import about_package.demo.service.CardService; //allow us to use all the functionalities of CardService class


// u can not import sub packages directly u have to import the sub package separately


public class packageEg2 {
    public static void main(String[] args) {
        AccService accService=new AccService();
        accService.open_acc();
        CardService cardService = new CardService();
        cardService.newCard();
    }
}
