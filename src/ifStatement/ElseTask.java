package ifStatement;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {

        /*
        ask user if they have driver's license
	    if the answer is 'Yes' --> you are great
	    if the answer is something else --> DMV is next door, please visit!
         */
        System.out.println("Do you have driver's license? yes/no");

        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        answer = answer.toLowerCase();

        if ( answer.equals("yes")){

            System.out.println("you are great!");
        }else {

            System.out.println("DMV is next door, please visit!");
        }


    }
}
