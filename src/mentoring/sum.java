package mentoring;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        /*

Given two int values, return their sum.
Unless the two values are the same, then return double their sum.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter num1");
        int num1 = scanner.nextInt();
        System.out.println("PLease enter num2");
        int num2 = scanner.nextInt();

        if(num1 ==num2){
            System.out.println((num1 + num2)*2);
        }else{
            System.out.println(num1 + num2);
        }


    }
}
