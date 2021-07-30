package about_package;


//import static about_package.utill.DateUtill.formatDate; //by this we can import the function formatDate from the class DateUtill and package utill
import about_package.utill.DateUtill; //by this we can import class DateUtill form package utill
import java.util.Date;

public class packageEg1 {

    public static void main(String[] args) {
        about_package.demo.service.AccService accService=new  about_package.demo.service.AccService();
        accService.open_acc();
        about_package.demo.service.CardService cardService = new about_package.demo.service.CardService();
    cardService.newCard();
       System.out.println(DateUtill.formatDate(new Date()));
        //System.out.println( formatDate(new Date())); //this will work only when functon formateDate is imported
    }

}
