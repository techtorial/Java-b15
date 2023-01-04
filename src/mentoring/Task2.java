package mentoring;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Using the scanner asks the user to input the min and max
number. Write a java code that will calculate the sum of
numbers between the range of min and max and those that
can only be divided by 3 and 11.
(min and max numbers are included)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the min number");
        int min = sc.nextInt();
        System.out.println("PLease enter the max number ");
        int max = sc.nextInt();
        int sum = 0;

        for(int i = min; i <= max; i++){
            if(i % 3 == 0 && i % 11 == 0 ){
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);

    }
}
