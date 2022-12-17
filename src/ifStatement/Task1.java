package ifStatement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Ask user to give you an integer number between 1 and 5
        -print out day name for related number
	    input --> 1 --> Monday
			       2 --> Tuesday
			        3 --> Wednesday
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number between 1 and 5");

        int number = scanner.nextInt();

        if (number == 1) {

            System.out.println("It is Monday");
        }
        if (number == 2) {
            System.out.println("It is Tuesday");
        }
        if (number == 3) {
            System.out.println("It is Wednesday");
        }
        if (number == 4) {
            System.out.println("It is Thursday");
        }
        if (number == 5) {
            System.out.println("It is Friday");
        }
        if (number > 5 || number < 1) {

            System.out.println("there is no matching day for your entry");
        }
        /*
        get a String from user
            -check if the given string starts with letter 'h' and the length of the string is more than 10

            -print --> "This is what I am looking for!"
         */

        System.out.println("Please enter a text");
        scanner.nextLine();
        String text = scanner.nextLine();

        if (text.startsWith("h") && text.length() > 10) {

            System.out.println("This is what I am looking for!");

        }

    }


}
