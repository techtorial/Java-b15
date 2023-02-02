package arrayList;

import java.util.ArrayList;

public class Practice2 {

    public static void main(String[] args) {
        // create an arraylist and store 6 car brands
        // print out brand of every car from the list one at a time
        // [a,b,c,d,e,f]

        //a@yahoo.com
        //b@yahoo.com

        ArrayList<String> brands = new ArrayList();

        brands.add("a");brands.add("ba");brands.add("c");brands.add("ad");brands.add("eadffgs");brands.add("efef");

        System.out.println(brands);

        for (  String car : brands ){

            System.out.println(car+ "@yahoo.com");
        }
        for (int i=0; i< brands.size(); i++){

            System.out.println( brands.get(i)+ "@gmail.com"  );
        }
        System.out.println("========");

        filter(brands);
    }

    // create a method that will take an arraylist as parameter.
    // parameter arraylist should hold String type elements
    // that method will show only elements which have letter 'a' in it

    public static void filter(ArrayList<String> list ){

        for ( int i=0; i< list.size(); i++ ){

            if ( list.get(i).contains("a")){

                System.out.println(    list.get(i));
            }
        }

    }


}
