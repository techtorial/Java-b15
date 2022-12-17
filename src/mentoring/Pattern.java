package mentoring;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        /*
        using a scanner, ask the user for length and width of the pattern
        input:
        5
        8
        output:
        ########
        ########
        ########
        ########
        ########

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = scanner.nextInt();
        System.out.println("Please enter the width");
        int width = scanner.nextInt();

        for(int i = 0; i < length; i++){

            for(int k = 0; k< width; k++){
                System.out.print("#");
            }
            System.out.println();
        }


    }
}
