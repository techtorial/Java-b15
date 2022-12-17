package mentoring;

public class FuzzBuzz {
    public static void main(String[] args) {
        /*
        Write a program that will print numbers from 1 to 100 and for multiverses of 3  "Fuzz" and
        for multiple of 5 print out "Buzz"
        output:
         1 2 Fuzz 4 Buzz ... 8  Fuzz Buzz
         if the number is divisible by both 3 and 5 replce it with " Fuzz Buzz"

         */

        int endpoint = 100;

        for(int i = 1; i<=endpoint; i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.print("Fuzz Buzz ");
            }else if(i % 3 == 0 ){
                System.out.print("Fuzz ");
            }else if (i %5 == 0) {
                System.out.print("Buzz");
            }else
                System.out.print(i+" ");
        }


        // replace number that contain 3 or 5
        // if contains 3 "Fuzz"
        // if contains 5 "Buzz"
        //  output:
        // 1 2 Fuzz 4 Buzz 6 7 8 9 10 11 12 Fuzz ... 94 Buzz 96 97 98 99 100
        System.out.println();
        System.out.println();

        for(int k = 1; k<=endpoint; k++){
            String convertedNumber = k + "";
            if(convertedNumber.contains("3")){
                System.out.print("Fuzz ");
            }else if(convertedNumber.contains("5")){
                System.out.print("Buzz ");
            }else{
                System.out.print(k + " ");
            }
        }








    }
}
