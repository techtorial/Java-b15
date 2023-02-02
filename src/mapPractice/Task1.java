package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        Map<String, Integer> data1 = new HashMap<>();
        data1.put("A", 1);
        data1.put("B", 26);
        data1.put("C", 30);
        data1.put("D", 5);

        List<Integer> list1 = largeNumberFinder(data1);
        System.out.println(list1);
    }

    /*
    create a method that will get a map as parameter
    given map as parameters should be Map<String, Integer>
    this method will find all values from the given map
    this method will return if the value is greater than 25
    this method returns those greater numbers as a list
     */
    public static List<Integer> largeNumberFinder(Map<String, Integer> map) {
        List<Integer> numbers = new ArrayList<>();
        ; // 2,24,27,30
        for (Integer number : map.values()) {

            if (number > 25) {
                numbers.add(number);
            }
        }
        return numbers;
    }

}
