package about_package;



public class packageEg1 {

    public static void main(String[] args) {
        about_package.demo.service.AccService accService=new  about_package.demo.service.AccService();
        accService.open_acc();
        about_package.demo.service.CardService cardService = new about_package.demo.service.CardService();
    cardService.newCard();
    }

}
