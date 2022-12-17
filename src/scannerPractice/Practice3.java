package scannerPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // we will figure out initials of a person
        // John Deere --> Initials  -->JD

        System.out.println("Please enter your fist name");
        // to take string data, nextLine() or next()

        char firstInitial = scanner.nextLine().charAt(0);
        System.out.println(firstInitial);

        // please do above process for his last name
        System.out.println("Please enter your LAST name");
        // to take string data, nextLine() or next()

        char lastInitial = scanner.nextLine().charAt(0);
        System.out.println(lastInitial);
        // can we combine first and last initials
        System.out.println(""+firstInitial + lastInitial);

        // JOHN DEERE



    }
}
