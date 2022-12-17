package ifStatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("How much is your spending?");

        double amount = scanner.nextDouble();
        System.out.println( "What is your sate?");
        scanner.nextLine();
        String state = scanner.nextLine();
        double tax = 0,  txTax = 0.045;
        if (state.equalsIgnoreCase("tx") || state.equalsIgnoreCase("texas")){

            tax = amount * txTax;
        }else{

            tax = amount * 0.10;
        }

        if ( amount >= 1000  ){

            double discount1 = amount * 0.20;
            amount = (amount -discount1) + tax;

            System.out.println("Your savings is: "+discount1);
            System.out.println("Your final payment after 20% discount is: "+ amount);
        }else {

            double discount2 = amount * 0.05;
            amount = (amount -discount2) + tax;
            System.out.println("Your savings is: "+discount2);
            System.out.println("Your final payment after 5% discount is: "+ amount);
        }


    }
}
