package arrays;

import java.util.Scanner;

public class ObjectArrayPractice {
    public static void main(String[] args) {


        String str = new String("Test");

        int number1 = 9;

        boolean bl1 = true;

        double d1 = 9.8;

        Scanner scanner = new Scanner(System.in);


        Object[] example = {str, number1, bl1, d1, scanner };

        for (Object ex    :  example ){
            System.out.println( ex.toString().charAt(0) );
            //System.out.println( ex.toString() );

        }


    }
}
