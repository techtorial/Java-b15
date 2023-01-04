package mentoring;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Ask the user to enter one number between 1 to 10 then, Write the
program to print the string in the following format:
Example:
Input: 5
Output:
1
22
333
4444
55555
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = scanner.nextInt();

        for(int i = 1; i <=num; i++){
           for( int k = 1; k<= i ; k++){
               System.out.print(i);
           }
            System.out.println();
        }
    }
}
