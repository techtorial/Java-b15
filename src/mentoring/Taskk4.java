package mentoring;

import java.util.Scanner;

public class Taskk4 {
    public static void main(String[] args) {
        /*
        Ask the user to enter one in number between 1 to 10 then, Write the
program to print the string in the following format:
Example:
Input: 6
Output:
666666
55555
4444
333
22
1
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = scanner.nextInt();

        for(int i = number; i > 0; i--){
            for(int k = i; k>0; k--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
