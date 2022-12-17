package stringBasics;

public class EqualsMethodPractice {

    public static void main(String[] args) {

        //equals();

        String name1 = "Dmitriy"; // stored in the String pool

        String name2 = "Dmitriy"; // stored in the String pool

        String name3 = new String("Dmitriy"); // stored in the heap

        System.out.println(name1.equals(name2)); // true
        // ==
        System.out.println(name1 == name2); // true

        System.out.println(name1.equals(name3)); // true

        System.out.println(name1 == name3); // FALSE


        String name4 = new String("Dmitriy");

        System.out.println(name3.equals(name4)); // true

        System.out.println(name3 == name4); // false

        String name5 = name4;

        System.out.println(name4.equals(name5)); // TRUE

        System.out.println(name4 == name5); //

        String name6 = new String(name1);

        System.out.println(name6 == name1); //


    }

}
