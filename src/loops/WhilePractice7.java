package loops;

public class WhilePractice7 {
    public static void main(String[] args) {

        /*
        find sum of numbers between 10 and 15

        10 + 11 + 12 + 13 + 14 + 15 = 75
        "Sum of the numbers between 10  to 15 is 75
         */
        int num1 = 10, num2 = 15,   sum = 0;
        while( num1 <= num2  ){

           // sum = sum + num1;
            sum += num1;
            num1++;

        }
        System.out.println("Sum of the numbers between 10  to 15 is: "+ sum);

        // find the sum of even numbers from 1 to 15

        int a = 1, b = 15, total = 0;


        while (  a < b ){


            if ( a % 2 == 0){

                total = total + a;
            }
            a++;
        }
        System.out.println(total);






    }
}
