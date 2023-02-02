package RecapWithAhmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

     1-What is the difference between List and Array?

      --> You can go to the ArraysPractice concept to get the answer

    2-What is the difference between Arraylist and LinkedList?

      -->List -> is a part of Collection and it is used for Storage(Objects)

         -->ArrayList --->It is a way to store Objects and access these objects
         with a specific methods.(GET)

         -->LinkedList -->It is a way to store Objects and access these objects
         with a specific methods.(GET)

        -->To be honest I do not use LinkedList in my project but as much as know
        there is execution time difference for accessing the data from the List.
        SHOW OFF:
        ****--> The reaching out the elements in side of the list is more efficient
        and faster in ArrayList.
         ArrayList<Object>   --> arraylist.get(0) --> 0.02
         LinkedList<Object>  --->linkedlist.get(0)--->0.04

        ***-->When you do any manipulation(changing value,replacing,inserting,removing)
        at this moment LinkedList will be faster.

        -->If you want to get more details, there is YouTube  video.
        (What is the difference between Linkedlist and Arraylist(8 min)
     */

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        ArrayList list2 =new ArrayList();
        LinkedList list3=new LinkedList();
        List list4 =new LinkedList();
        list2.add("Hello"); //long way and do not use it one by one. --> loops
        System.out.println(list2.get(0));
        List<String> names= Arrays.asList("Ahmet","Mehmet","Mahmut","Kerem","Ayse");
        for(String name:names){
            System.out.println(name);
        }
    }
}
