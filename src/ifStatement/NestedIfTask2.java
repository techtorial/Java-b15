package ifStatement;

import java.util.Scanner;

public class NestedIfTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!, \n Do you know any coding language? yes/no");
        String java = scanner.nextLine().toLowerCase();

        if (java.equals("yes")) {

            System.out.println("Do you know Selenium? yes/no");

            String selenium = scanner.nextLine().toLowerCase();
            if (selenium.equals("yes")) {
                System.out.println("Do you know API testing?yes/no");
                String api = scanner.nextLine().toLowerCase();

                if (api.equals("yes")) {
                    System.out.println("Do you know SQL? yes/no");
                    String sql = scanner.nextLine().toLowerCase();

                    if (sql.equals("yes")) {

                        System.out.println("You are HIRED!");
                    } else {
                        System.out.println("Please learn SQL");
                    }

                } else {

                    System.out.println("Please learn API");

                }

            } else {
                System.out.println("Please learn Selenium");
            }

        } else {
            System.out.println("Please learn coding language first!");
        }


    }
}
