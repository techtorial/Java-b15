package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {

        //Every ArrayList is a List
        //but not every List is an ArrayList

        List<String> list1 = new ArrayList<String>();

        list1.add("IL");
        list1.add("OH");

        // convert from array to ArrayList
        int[] digits = {3, 4, 5, 6};

        List<int[]> a = Arrays.asList(digits);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);


        //  a.add(12); // UnsupportedOperationException
        System.out.println(a);
        System.out.println(Arrays.toString(a.get(0)));

        System.out.println(a.get(0)[0]);

        // convert ArrayList to Array

        ArrayList<String> items = new ArrayList();
        items.add("Alex");
        items.add("Ana");
        System.out.println(items);

        Object[] array = items.toArray();

        System.out.println(Arrays.toString(array));

        array[1] = "Vitaly";
        System.out.println(Arrays.toString(array));

        System.out.println( array[0]);



    }
}
