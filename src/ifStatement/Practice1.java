package ifStatement;

public class Practice1 {
    public static void main(String[] args) {

        int money = 1;

        int item$ = 250;

        System.out.println("First Print BEFORE if statement");


        if( money > item$ ){

            System.out.println("you are buying the Item");

        }
        System.out.println("Another print AFTER if Statement");
        int item2$ = 99;

        if ( money > item2$){

            System.out.println("I am buying ITEM2");

        }

        // you have another option as using your credit card if the money is not enough

        boolean creditCard = true;

        if ( money > item$ || creditCard == true){

            System.out.println( "you are using 2 different option to buy ITEM");
        }




    }
}
