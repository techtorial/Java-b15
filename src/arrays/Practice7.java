package arrays;

import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {

        String[] brands = {"Nike", "Adidas", "puma","New Balance", "Reebook"};

        // print every brand name in reverse version
        // ekiN , sadidA, ...
        String[] reversedArray = new String[brands.length];
        for (int i = 0; i < brands.length; i++ ){

           // System.out.println( brands[i]   ); //String str = "Nike";
            String reversed = "";
            for ( int k = brands[i].length() -1; k >=0; k--  ){
                reversed += brands[i].charAt(k);

            }
            reversedArray[i] = reversed;
            System.out.println("Reversed of  : "+ brands[i] +" >> " + reversed);

        }
        System.out.println(Arrays.toString(reversedArray));

    }
}
