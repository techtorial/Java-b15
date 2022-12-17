package mentoring;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IsUpperOrLower {
    public static void main(String[] args) {
        /*
        . Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your character");
        char letter = scanner.next().charAt(0);
        if(letter >= 97 && letter <=122){
            System.out.println("Your letter is lowercase");
        }else if(letter >= 'A' && letter <= 'Z'){
            System.out.println("Your letter is uppercase");
        }else{
            System.out.println("It is not a letter");
        }



    }
}
