package arrays;

import java.util.Arrays;

public class BinarySearchPractice {

    public static void main(String[] args) {


        String[] drinks = {"tea", "water", "coffee", "water", "coke"};

        System.out.println(Arrays.binarySearch(drinks, "water"));
        System.out.println(Arrays.binarySearch(drinks, "coke"));
        Arrays.sort(drinks);

        System.out.println(Arrays.binarySearch(drinks, "water"));
        System.out.println("===========");

        System.out.println(Arrays.toString(drinks));

        System.out.println(Arrays.binarySearch(drinks, "coke"));

        int[] numbers = {3, 6, 8, 10, 5,7, 8, 2, 11};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 8)); //

        System.out.println("===========");

        System.out.println(Arrays.binarySearch(drinks, "orange"));

        // [2, 3, 6, 8, 8, 10, 11]

        Arrays.binarySearch(numbers, 2, 5, 8);
        System.out.println(Arrays.binarySearch(numbers, 2, 5, 8));

        Object[][] brands = {{"Apple", "Dell", "google", "Acer", "Samsung"}, {"LG", "Sony", "Toshiba"}};



    }
}
