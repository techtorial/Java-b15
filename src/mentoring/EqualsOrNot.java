package mentoring;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsOrNot {
    public static void main(String[] args) {
        /*
        Please enter the length of your array
        3
        Please enter your 1 number
        5
        Please enter your second number
        793
        Please enter your third number
        98
        [ 5, 793, 98]
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length the array you want to create");
        int length = scanner.nextInt();
        int[] array = new int[length];

        for(int i = 0; i< length; i++){
            System.out.println("Please enter your " + (i+1)+" number" );
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        // ask the user again for the second array
        // then compare the two arrays if they are equal or not
        System.out.println();

        System.out.println("Please enter the length for your second array you want to create");
        int length2 = scanner.nextInt();
        int[] array2 = new int[length2];

        for(int i = 0; i< length2; i++){
            System.out.println("Please enter your " + (i+1)+" number" );
            array2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array2));

        boolean isEqual = true;

        if(length == length2){
            for(int i = 0; i<length2; i++){
                if(array[i] != array2[i]){  // 1 2 3 4
                    isEqual = false;       // 1 2 5 4
                }
            }
        }else{
            isEqual = false;
        }

        System.out.println(isEqual? "Your arrays are equal": "Your arrays are not equal");
    }
}
