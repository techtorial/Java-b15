package InterviewQuestions;

import java.util.Arrays;

public class Array_MergeTwoArrays {
    /*
Write a return method that can concat two arrays
 */
    public static int[] mergeArrays(int[] arr1,int[] arr2){
        int[] result=new int[arr1.length+arr2.length];
        int i=0;
        for(int each:arr1){
            result[i++]=each;
        }
        for(int each:arr2){
            result[i++]=each;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1={123,342,657,87,45};
        int[] arr2={12,3,467,234,68,2};
        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));
    }
}
