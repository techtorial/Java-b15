package arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        // I will store 5 different ages into one array


        int[] ages = new int[5]; // 5 is representing size of array

        System.out.println(ages); // it will show hashcode (location of the array in the memory)
        System.out.println(Arrays.toString(ages));// printing out array

        ages[0] = 25;
        ages[1] = 9;

        System.out.println(Arrays.toString(ages));

        // store 89 in to the last position of the ages array
        ages[4] = 89;
        System.out.println(Arrays.toString(ages));

        // ages[5] = 100; // ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(ages));
        String str = "abcd";
        //  System.out.println( str.charAt(7)); // StringIndexOutOfBoundsException

        System.out.println(    ages[1] ); // 9

        // reassigning values

        ages[0] = 35;
        System.out.println(  Arrays.toString(ages));
        System.out.println( ages[0]); // 35

        System.out.println(   ages[4]    );

        System.out.println(      ages[  ages.length - 1] ); // 89

        // length --> size of the array

        System.out.println( ages.length); // 5
    }
}
