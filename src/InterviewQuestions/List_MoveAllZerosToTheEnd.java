package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {
    /*
write a program that can move all the zeros to the end of the List of integers
input=1,0,7,0,8,0
output=1,7,8,0,0,0
     */

    public static List<Integer> moveZerosToTheEnd(List<Integer> list){
        int originalSize=list.size();//6
        list.removeAll(Arrays.asList(0));
        int newSize=list.size();//3
        int totalNumberOfZeros=originalSize-newSize;//3

        for (int i=0;i<totalNumberOfZeros;i++){
            list.add(0);
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(7);
        list.add(0);
        list.add(8);
        list.add(0);
        System.out.println(moveZerosToTheEnd(list));
    }
}
