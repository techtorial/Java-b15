package RecapWithAhmet;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

    /* POSSIBLE INTERVIEW QUESTIONS

        1- what is wrapper class?

            --> wrapper class it a process to convert data into a different forms


        2- how many way of wrapper class do you know?
    note: avoid using number for any options (ex. there are 2 ways to conversion )
            --> autoboxing
                >> conversion data from primitive to object

            --> unboxing (most usage is parsing)
                >> conversion data from object to primitive

                NOTE: reason we use wrapper classes to make a conversion data into format that we need
         */
    public static void main(String[] args) {
        int number = 10; // primitive data
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number);
        System.out.println(numbers);
        numbers.get(0).toString(); // autobaxing AUTOMATICLY >> OBJECT METHODS>
        //added primitive to a list, and it turns by itself object
        System.out.println(numbers.get(0).hashCode());

        //UNBOXING PARSING   from object to primitive

        String str = "1235";  //object
        int exampleNumber = Integer.parseInt(str);
        System.out.println(exampleNumber);








    }
}
