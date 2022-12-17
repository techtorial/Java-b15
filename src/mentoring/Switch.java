package mentoring;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
        Input : x = 10, y = 20;
Output : x = 20, y = 10

Input : x = 200, y = 100
Output : x = 100, y = 200
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number for the value x");
        int x = sc.nextInt();

        System.out.println("Please enter a number for the value y");
        int y = sc.nextInt();

        int tempValueOfX = x;
        x = y;
        y = tempValueOfX;
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);





    }
}
