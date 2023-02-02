package RecapWithAhmet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

      1-How can you make the element unique with collection(American style)
      1-What is set? what is the purpose of using it ? (Indian style)

      --> In my project, I was using set to make the elements "UNIQUE" to prevent
      duplication which causes some technical and business issue.
      -->It is a way to store the unique elements only

      2-Can you tell me the types of collections?

      -->As much as I know since it has been long time, I didn't use the one of them:
        -->We have List                      **>Set                                             **QUEUE
            Arraylist and LinkedList        -->HashSet -->Randomly store the elements(unique)
                                            -->LinkedHashSet -->Insertion order(unique)
                                            -->TreeSet -->Ascending order

      3-Can you Explain the difference between Set and List?

         ---> SET                                                   -->LIST
      *-->Only Unique Elements(no duplication)                       -->It can store Duplicates elements
      -->It has different sub-types(HashSet,LinkedSet,TreeSet)      -->ArrayList,LinkedList
     **-->There is no indexing in Set ******                        -->It works mostly indexing(iteration)

     */
    public static void main(String[] args) {
        Set<Integer> numbers=new HashSet<>();
        Set<Integer> numbers2=new LinkedHashSet<>();
        Set<Integer> numbers3=new TreeSet<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(5);
        numbers.add(3);

        System.out.println(numbers);//random

        numbers2.add(1);
        numbers2.add(5);
        numbers2.add(5);
        numbers2.add(3);

        System.out.println(numbers2);//insertion

        numbers3.add(1);
        numbers3.add(4);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        numbers3.add(2);

        System.out.println(numbers3);//ascending







    }
}
