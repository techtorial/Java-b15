package loops;

import java.util.Arrays;

public class ForEachPractice2 {
    public static void main(String[] args) {


        String[] flowers = {"rose", "daisy", "sunflower"};

        for (String flower   : flowers ){

            System.out.println(   flower.toUpperCase() );

        }

        String[] cities = { "Chicago", "Miami", "Tokyo", "Doha", "Denver" ,  "New York" };

        // chicago@gamil.com    miami@gamil.com  ...
        // put those e-mail address in another storage for future reference
        String[]  cityEmails = new String[cities.length];
        int i= 0;
        for (  String city  :  cities  ){

            cityEmails[i] =    city.toLowerCase().replace(" ", "").concat("@gamil.com");
            i++;
        }
        System.out.println(Arrays.toString(cityEmails));

    }
}
