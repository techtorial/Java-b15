package setPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Practice4 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("mac");
        list.add("mac");
        list.add("lenovo");
        list.add("mac");
        list.add("Acer");
        list.add("lenovo");

        System.out.println(list); // [mac, mac, lenovo, mac, Acer, lenovo]
        // find out repeating elements from the given list
        // use set in to your solution logic
        //hint --> using add();

        HashSet<String> set = new HashSet<>();
        ArrayList<String> duplicates = new ArrayList<>();

        for ( String item   :   list){
            if (!set.add(item)){
                System.out.println( item);
                set.add(item);
            }
        }

        System.out.println(">> duplicate list: --> "+duplicates);



    }
}
