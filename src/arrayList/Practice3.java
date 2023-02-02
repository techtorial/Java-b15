package arrayList;

import object.*;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {

        ArrayList<Integer> zipCodes = new ArrayList();

        zipCodes.add(540);
        zipCodes.add(600);
        zipCodes.add(404);
        zipCodes.add(202);

        System.out.println(zipCodes);

        for (Integer code : zipCodes) {

            System.out.println(code + 10);
        }
        System.out.println("++++++++++++");

        for (Object code : zipCodes) {

            System.out.println(code);
        }

        System.out.println("=================");

        ArrayList list1 = new ArrayList();

        list1.add("Diana");
        list1.add(123);
        list1.add(true);

        System.out.println(list1.get(0).toString().toUpperCase());

        System.out.println(list1.get(1).toString().equals("123"));
        System.out.println("=================");
        // contains
        System.out.println(zipCodes.contains(540));
        ;
        System.out.println(zipCodes.contains(100));

        Boolean b = zipCodes.isEmpty();
        System.out.println(b);
        list1.clear();
        System.out.println(list1.isEmpty());
        System.out.println(test2(zipCodes));

        ArrayList<String> abcd = test2(zipCodes);
        System.out.println(abcd);

        ArrayList mixedTypes = new ArrayList();

        mixedTypes.add(8);
        mixedTypes.add("Test");
        mixedTypes.add(true);
        mixedTypes.add(5.6);
        mixedTypes.add('r');

        Cat cat = new Cat();
        Flower flower = new Flower();
        Bottle bottle = new Bottle(4);

        mixedTypes.add(cat);
        mixedTypes.add(flower);
        mixedTypes.add(bottle);

        System.out.println( mixedTypes  );


    }

    // create a method that will take an ArrayList<Integer> as param
    // it will generate message for each item from the list
    // it will store and return those messages as an ArrayList

    public static ArrayList<String> test2(ArrayList<Integer> list) {

        ArrayList<String> messages = new ArrayList<>();

        for (Integer number : list) {
            messages.add("Hi" + number);
        }
        return messages;
    }


}
