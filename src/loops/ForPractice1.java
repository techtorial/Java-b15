package loops;

public class ForPractice1 {
    public static void main(String[] args) {


        int num1 = 0, num2 = 5;

//       while( num1 < num2){
//           System.out.println(num1);
//           num1++;
//       }


        for (   ; num1 < num2  ; num1++ ){

            System.out.println(num1); // 0,1 ... // 1,2,3 ...

        }

        for ( int number1 = 10, number2 =20 ; number2 > number1   ;  number2--  ){
            // 20,19,18 ...

            System.out.println( "Number now "+number1);
        }

        for (int i = 0; i < 10 ;    ){

            System.out.println(i + 1 +". I like for loop");
            i++;
            System.out.println(i);
        }
        System.out.println("====================");

        int i = 0;
        for (; i < 10 ;    ){

            System.out.println(i + 1 +". I like for loop***");
            i++;
            System.out.println(i);
        }
        System.out.println(i); //  10

        for ( i = 100; i > 90 ; i-- ){

            System.out.println("$$$");


        }
        System.out.println(i); // 90, 10, 100, 91


        System.out.println("==================");




        for ( int a = 0  ;   a < 5     ;     a ++  ){


            System.out.println("before break time");



        }

        // infinite for loop

//        for ( ; ; ){
//
//            System.out.println("after break");
//        }

        int a = 5;
        for(String str = "example" ; a < 8  ; a++ ){

            System.out.println("!!!!!");
            System.out.println(str);
        }

    }
}
