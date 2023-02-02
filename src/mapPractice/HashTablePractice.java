package mapPractice;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {

        Hashtable<String, Integer>   table  = new Hashtable();

        table.put("Rose", 3);
        table.put("Daisy", 5);
        table.put("SunFlower", 10);
        table.put("Tulip", 9);

        System.out.println(   table );

        System.out.println(  table . get(  "Tulip")  ); // 9

        System.out.println(  table.values()   );

        System.out.println(   table.keySet()   );

        System.out.println(    table.entrySet() );

      //  table.put(null, 18); // NullPointerException --> HashTable does not allow 'null' keys
      //  table.put("Orchard", null); // NullPointerException --> HashTable does not allow any null values



    }
}
