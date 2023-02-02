package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice6 {
    public static void main(String[] args) {


        HashMap<String, Integer> departments = new HashMap<>();
        departments.put("IT", 204);
        departments.put("HR", 305);
        departments.put("ADMIN", 102);

        //keySet() --> returning all keys as set
        // values() --> returning all values as Collection

        System.out.println( departments.keySet());
        System.out.println( departments . values() );

        System.out.println( departments);

        // entrySet() --> will return keys and values as pair

        departments.entrySet();
        System.out.println( departments.entrySet() );

        Set < Map.Entry<String, Integer >> pairs =    departments.entrySet();

        // reach out key-value pairs individually
        for (Map.Entry<String, Integer >    pair    : pairs){

            System.out.println( pair);
            System.out.println( "--> "+pair.getKey());
            System.out.println( "$$ > "+pair.getValue());
        }

    }
}
