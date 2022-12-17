package mentoring;

import java.util.Scanner;

public class error {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("Sarah")) {
            System.out.println("You must be really awasome");
        }

        name = name.replace('a', 'e');
        name = name.toUpperCase();
        name = name.substring(0, 3);

        System.out.println(name + " has " + name.length() + " letters");
    }
}
