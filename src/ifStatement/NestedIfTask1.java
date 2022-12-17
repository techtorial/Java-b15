package ifStatement;

import java.util.Scanner;

public class NestedIfTask1 {
    public static void main(String[] args) {
        // if city name is 'miami' --> you should be attending miami campus!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your city name");
        String city = scanner.nextLine();
        city = city.toLowerCase(); // chicago
        if (city.equals("chicago")) {
            System.out.println("What is your school name?");
            String school = scanner.nextLine();
            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky");
            } else {
                System.out.println("please come and visit TECHTORIAL!");
            }
        } else if (city.equals("miami")) {
            System.out.println("you should be attending miami campus!");
            System.out.println("What is your school name?");
            String school = scanner.nextLine();

            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky");
            } else {
                System.out.println("please come and visit TECHTORIAL!");
            }
        } else {
            System.out.println("please come to CHICAGO and visit us!");
        }
    }
}
