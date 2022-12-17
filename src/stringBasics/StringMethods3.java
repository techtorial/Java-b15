package stringBasics;

import java.util.Scanner;

public class StringMethods3 {
    public static void main(String[] args) {

        String str = "water";
// startsWith(); return boolean
        boolean result1 = str.startsWith("w");

        System.out.println(result1); //true

        System.out.println( str.startsWith("water")  );//true
        System.out.println(  str.startsWith("ter")); // false

//endsWith(); returns boolean
        System.out.println(  str.endsWith("r")); // true
        System.out.println( str.endsWith("abc")); // false

        /*
        TASK: get a string from User via scanner and:
        -print:
            - first char
            - last char
            - index of second matching letter 'c'
            - length of string
            - index of 'x'
            - middle char
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please enter a String value");

        String userInput =     scanner.nextLine();
        System.out.println(   userInput.charAt(0)     ); // first char
        System.out.println(   userInput.charAt( userInput.length()-1 )    );//last char

        System.out.println(   userInput.indexOf('c',  userInput.indexOf('c')+1)       ); //second 'c' index number

        System.out.println(    userInput.length()    ); // length

        System.out.println(    userInput.indexOf('x')   ); // index of 'x'

        System.out.println(   userInput.charAt( userInput.length()/2   ) ); // middle char
        System.out.println("========================");
 // contains(); --> boolean

        str = "water";

        boolean b = str.contains("w");
        boolean b1 = str.contains("ter");

        System.out.println( b);//true
        System.out.println(b1); //true
        System.out.println( str.contains("ta") );

        System.out.println( (str.startsWith("wat") != str.contains("ter")) && true ); // F

        System.out.println("++++++++++++++++++++++++");
        // equals(); --boolean

        System.out.println(  str.equals("Water")  ); // fALSE

        System.out.println( str.equals("WATER")); //false
        System.out.println( str.equals("water"));
        str = str.toUpperCase();
        System.out.println( str.toUpperCase());
        System.out.println(   str.equals("WATER")); // TRUE

        //equalsIgnoreCase(); boolean

        System.out.println(  str.equalsIgnoreCase("WaTeR")   ); // true

        System.out.println( str.equalsIgnoreCase("ater")); // FALSE







    }
}
