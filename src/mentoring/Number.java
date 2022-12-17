package mentoring;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        /*
        Write a Java program that accepts two double variables and test if both strictly between 0 and 1 print "Your number is acceptable"
        otherwise print out "Try again"

        input:
        num1 - 0.1
        num2 - 0.8
        output:
        "YOur number is acceptable"

        input:
        num1 - 382
        num2 - 19.8
        output:
        "Try again"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number");
        double number1 = scanner.nextDouble();
        System.out.println("Please enter your second number");
        double number2 = scanner.nextDouble();

        if(number1 >0 && number1 <1  && number2 >0 && number2 < 1){
            System.out.println("Your number is acceptable");
        }else{
            System.out.println("Try again later");
        }


    }
}
