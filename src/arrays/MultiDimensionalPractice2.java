package arrays;

import java.util.Arrays;

public class MultiDimensionalPractice2 {

    public static void main(String[] args) {

        String[][] citiesFromStates = {{"Los Angeles", "Sacramento"}, {"Chicago", "Springfield", "Des Plaines"}, {"Baltimore", "Rockville"}};


        // use for-each loop to show names of cities
        // print --> when you find chicago --> "chicago is in IL"
        LABEL:
        for (String[] cities : citiesFromStates) {
            for (String city : cities) {


                if (city.equalsIgnoreCase("chicaGO")) {
                    System.out.println(city + " is in IL");
                    //  break LABEL;
                } else System.out.println(city);
            }
        }


        String str = "dbak bvkadbfvk adfv";

        String[] a = str.split(" ");

        citiesFromStates[0] = a;
        System.out.println(Arrays.deepToString(citiesFromStates));


    }
}
