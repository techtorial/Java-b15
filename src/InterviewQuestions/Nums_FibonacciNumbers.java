package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Nums_FibonacciNumbers {
    /*
    0,1,1,2,3,5
    input->5
    output->0,1,1,2,3
     */
    public static List<Integer> fibonacci(int n){
        List<Integer> result=new ArrayList<>();
        int f1=0;
        int f2=1;
        int temp=0;
        result.add(f1);
        result.add(f2);
        for (int i=1;i<n;i++){
            temp=f1+f2;//1
            result.add(temp);//1
            f1=f2;//1
            f2=temp;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
