package loops;

import java.util.Scanner;

public class DoWhilePractice3 {
    public static void main(String[] args) {

        /*
        get a positive number from user
        for that given number, create a star tree like following
        --> user enters--> 5
        *
        **
        ***
        ****
        *****
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a positive integer number");
        int number = scanner.nextInt();
        String str = "";
        do {

            str = str.concat( "*");
            System.out.println( str); //
            number--;
        }while ( number > 0 );
        System.out.println(str);


    }
}
