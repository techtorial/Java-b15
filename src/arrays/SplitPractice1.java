package arrays;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {


        String str1 = "Selennium";

        String[] parts = str1.split("n");

        System.out.println(Arrays.toString(parts));

        // Anna Jake Alex Diana

        System.out.println(str1);

        System.out.println(parts[1]);
        System.out.println(parts.length);
        parts[1] = "abcd";
        System.out.println(Arrays.toString(parts));

        String str2 = "It is a good day to practice java. It is snowing outside.";
        str2 = str2.replace(".", "");
        // store every word in an array

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));


        String[] items = {"It", "is", "a", "good", "day", "to", "practice", "java", "It", "is", "snowing", "outside"};


    }
}
