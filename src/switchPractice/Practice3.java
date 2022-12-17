package switchPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /* ask user for their favorite fruit
            -strawberry, mango, apple, grape, banana

            "We have your favorite fruit ..."
            "Sorry!  we do not have your favorite fruit .."  */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite fruit? Please enter");
        String answer = scanner.nextLine().toUpperCase();

        switch (answer) {
            case "MANGO":
                System.out.println("We have your favorite fruit: " + answer);
                break;
            case "APPLE":
                System.out.println("We have your favorite fruit: " + answer);
                break;
            case "GRAPE":
                System.out.println("We have your favorite fruit: " + answer);
                break;
            case "BANANA":
                System.out.println("We have your favorite fruit: " + answer);
                break;
            case "STRAWBERRY":
                System.out.println("We have your favorite fruit: " + answer);
                break;

            default:
                System.out.println("Sorry!  we do not have your favorite fruit .." + answer);
                break;
        }

        switch (answer) {
            case "MANGO":
            case "APPLE":
            case "GRAPE":
            case "BANANA":
            case "STRAWBERRY":
                System.out.println("We have your favorite fruit: " + answer);
                break;

            default:
                System.out.println("Sorry!  we do not have your favorite fruit .." + answer);
                break;
        }


    }
}
