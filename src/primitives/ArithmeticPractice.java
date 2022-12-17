package primitives;

public class ArithmeticPractice {

    public static void main(String[] args) {

        // Addition  >> +

        int num1 = 10, num2 = num1 + 5;

        int result1 = num1 + num2;
        System.out.println(result1); // 15

        // Subtraction >> -

//            num2 - num1

        double result2 = num2 - num1; // 5

        System.out.println(result2); // 5.0

        int result3 = 7 - 3;
        System.out.println(result3);

        // Multiplication  >>  *

        int count1 = 2;
        int count2 = 5;

        System.out.println( count1 * count2 );

        int result4 = count1 * count2; // 10
        System.out.println(result4);

        System.out.println(  result4 == (count1 * count2)      ); // true

        System.out.println( (result4 + 10 + result4) == (count1 +count2)); // false

        // Division  --> /

        int result5 = count2 / count1;

        System.out.println(result5); //2

        double result6 = count2 / count1; // since count1 and count2 are created as int,
                                            // result of division will be as int.
        System.out.println(result6); // 2.0


        double number1 = 11;
        double number2 = 2;

        double divide = number1 / number2; // since number1 and number2 are created as double,
                                            // result of division will be as double.
        System.out.println(divide); // 5.5

    }

}
