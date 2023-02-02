package setPractice;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {

    public static void main(String[] args) {
        HashSet set1 = new HashSet();
        HashSet<String> set2 = new HashSet();
        HashSet<Integer> set3 = new HashSet<>();
        Set<String> set4 = new HashSet();

        System.out.println(  set2 );

        set2.add("Alex");
        set2.add("Vitaly");
        set2.add("Sam");
        set2.add("Jenifer");
        // HashSet does not have order
        System.out.println( set2);
        set2.add("Alex");
        System.out.println( set2);

        // null
        set2.add(null);

        System.out.println( "added first null >> "+set2);

        set2.add(null);

        System.out.println( "added SECOND NULL -->  "+ set2);

        //[null, Alex, Vitaly, Jenifer, Sam]

        // show all elements one by one
        // if the name is Alex, Say "Hello" to him
        for ( String name : set2  ){
           // System.out.println(name);

            if (name != null && name.equalsIgnoreCase("alex")){
                System.out.println("Hello");
            }
        }

       Boolean result1 =  set2.contains("Alex");

        System.out.println(result1);

        System.out.println( set2.isEmpty() );

        set2.clear();

        System.out.println(set2);




//        String[] strs = {"a","b","a"};
//        String[] strs2 = {"a","b","a"};
//        HashSet<String[]> set6 = new HashSet();
//        set6.add(strs);
//        System.out.println(set6);
//        set6.add(strs2);
//        System.out.println(set6);

        HashSet<String> test = new HashSet<>();
        test.add("Denver");
        test.add("Springfield");
        test.add("La");
        test.add("Columbus");
        filter(test);
    }

    // create a method that will take a set parameter
    // this method will filter String elements based on their length.
    // Length 5 or more will have stars next to it
    //others will have ? next to it

    public static void filter(HashSet<String> data){

        for (String item  : data ){

            if (item.length() >=5){
                System.out.println( item+"***");
            }else {
                System.out.println(item + "???");
            }
        }

    }
}
