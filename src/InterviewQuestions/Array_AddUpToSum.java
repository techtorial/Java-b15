package InterviewQuestions;

public class Array_AddUpToSum {
    /*
 given an int[] 'arr' and another int 'sum',
 Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
    Example:
        arr = [8, 7, 2, 5, 3, 1]
        sum = 10

        Output:
            {8=2, 7=3}
 */
    public static void main(String[] args) {
        int[] arr={8,7,2,5,3,1};
        int n=10;
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==n){

                    System.out.print(arr[i]+"="+arr[j]+",");
                }
            }
        }
        System.out.println("}");
    }
}
