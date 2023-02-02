package mapPractice;

import java.util.HashMap;

public class Practice5 {

    /*
    String str = "Soccer is c the best sport";

    count numbers of each letter from the given string

    S - 1
    o - 1
    c - 2
    e - 1
    r - 1

    ..
    t - 3

     */
    public static void main(String[] args) {
        String str = "coffee";
        HashMap<String, Integer> map = new HashMap();

        for (int i = 0; i < str.length(); i++) {

            String str1 = "" + str.charAt(i);
            if (map.containsKey(str1)) {
                map.put(str1, map.get(str1) + 1);
            } else {
                map.put(str1, 1);
            }

        }
        System.out.println(map);


    }

}
