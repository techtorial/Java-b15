package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap();

        map.put(10, "Alex");
        map.put(20, "Sam");
        map.put(30, "Tom");

        System.out.println(map);

        map.get(30); // Tom
        System.out.println(map.get(30));

        map.put(20, "Vitaly");  // if the key is existing on the map, the value will be reassigned

        System.out.println(map);

        map.put(40, "Natalie");
        map.put(50, "Natalie");
        map.put(60, "Natalie");
        map.put(70, "Natalie");
        System.out.println(map);

        // how to reach out all values individually?
        // {50=Natalie, 20=Vitaly, 70=Natalie, 40=Natalie, 10=Alex, 60=Natalie, 30=Tom}

        System.out.println(map.get(10)); // Alex
        System.out.println(map.get(20)); // Vitaly
        System.out.println(map.get(30)); // Tom
        /// ....
        // how can I have all keys on hand?
        // *** //keySet()  --> it will return all keys from the map
        Set<Integer> keys = map.keySet(); // [50, 20, 70, 40, 10, 60, 30]

        System.out.println(keys);

        for (Integer key : keys) {

            System.out.println(map.get(key));
        }
        System.out.println("+++");

        for (Integer item : map.keySet()) {
            System.out.println(" + " + map.get(item));
        }

        // reach out values
        // values();

        Collection<String> values = map.values();

        System.out.println(  values );

        for ( String value : values){

            System.out.println("*" +value +"*");

        }

        // replace();

        map.replace(40,"XXXX");

        System.out.println(map);

        map.replace(90, "YYYYY");
        System.out.println(map);

        map.replace(70, "Natalie", "Jenny");
        System.out.println(map);

        // map has size--> size()

        map.size();

        System.out.println(  map.size() );

        // containsKey()
        System.out.println(map.containsKey("Mustafa"));;
        System.out.println(map.containsKey(120));
        System.out.println(map.containsKey(20));
        // containsValue()
        System.out.println( map.containsValue("1000"));
        System.out.println( map.containsValue("Tom"));
        System.out.println( "================");
        System.out.println(  map.containsKey(  "10" )    );

        System.out.println(  map.containsKey( Integer.parseInt("10"))  ); //
        System.out.println( "================");
        //isEmpty()
        System.out.println(map.isEmpty());

        // clear
       //  System.out.println( map.clear() );   you cannot print void methods
        map.clear();
        System.out.println(  map.isEmpty());



    }
}
