package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // ask user that how many chocolate names s/he wants to store in an array
        // get the names of the chocolates from user
        // and store them into an array
        // print stored elements back to the user at the end

        // lindor, milka, twix, ferroro, snickers, m&m
        // if the name has 5 or less letters store it in to 'shortNames' array
        // otherwise store it into 'longNames' array

        System.out.println(" How many chocolate you want to store? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[size];
        String[] shortN = new String[size];
        String[] longN = new String[size];

        for (int i = 0; i < size; i++) {

            System.out.println("Please enter name of chocolate " + (i + 1));
            String str = scanner.nextLine();
            names[i] = str;

            if ( str.length() >5 ){
                longN[i] = str;
            }else {
                shortN[i] = str;
            }

        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(longN));
        System.out.println(Arrays.toString(shortN));


    }
}
