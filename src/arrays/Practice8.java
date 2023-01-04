package arrays;

import java.util.Arrays;

public class Practice8 {

    public static void main(String[] args) {


        String[] brands = {"Nike", "adidas", "puma","New Balance", "Reebook"};

        int[] numbers = {4, 3, 5, 6, 72, 6, 8, 45};

        //sort()

       // System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

      //  System.out.println(Arrays.toString(numbers));

        Arrays.sort(brands);
     //   System.out.println(Arrays.toString(brands));

        System.out.println( numbers[0] == 3 ); // true

    }
}
