package setPractice;

import java.util.HashSet;
import java.util.Set;

public class Task {


    // create a method that will take String array as parameter, and it will return values as a set collection



    public static Set<String> test1(String[] data) {

        Set<String> set = new HashSet<>();

        for (String item : data) {

            set.add(item);
        }
        return set;
    }

    public static void main(String[] args) {

        String[] array = {"microphone","phone", "clock", "timer", "cup","clock", "microphone"};
        System.out.println(test1(array));


     Set<String>  abc =   test1(array);




    }

}
