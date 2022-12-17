package mentoring;

import java.util.Scanner;

public class DayOfTheWEek {
    public static void main(String[] args) {
        /*
        Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
        Test Data
        Input number: 3
        Expected Output :
        Wednesday
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number between 1 - 7");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please provide a number between 1 - 7");
        }

    }
}
