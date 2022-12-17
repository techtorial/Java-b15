package primitives;

public class ComparisonOperators1 {

    public static void main(String[] args) {

        // ==
        int a = 4, b =4;
        System.out.println(  a == b ); // true

        boolean result1 =   a == a;
        System.out.println( result1); // true

        System.out.println( result1 == true); //

        boolean result2 = ++a == 2 +3;
        System.out.println(result2); // true

        System.out.println(   7 == 8); //FALSE

        // != Not equal

        int num1 = 6, num2 =6;

        boolean result3 = num1 != num2;
        System.out.println(result3); //false

        System.out.println( num1 != 2); // true

        char letter = '9';

        System.out.println( letter != 9  ); // TRUE

        char letter2 = 'A';
        System.out.println( letter2 != 65); // FALSE
        System.out.println(  letter2 == 65); // TRUE

        System.out.println(  't' != 'T'); // TRUE

        System.out.println("+=====================+");

        // > greater than
        System.out.println( 0 > 1); // False

        boolean result4 = 0 > 1;

        System.out.println( result4); // false

        System.out.println( (10 *2) > ( 9 + 10)); // true

        System.out.println( 'A' > 'a'); // 65 > 97 ==> FALSE

        // < --- less than

        System.out.println( 67 < 90 ); // TRUE

        double d1 = 1.25, d2 = 12.5;

        boolean result5 = d1 < d2;

        System.out.println(result4 != result5); // TRUE

        System.out.println("+++++++++++++++++++");
        // >= greater than OR  equal to

        System.out.println(   7 >= 7   ); // TRUE

        int count = 34;
        count += count; // --> count = count + count;

        int count2 = count +count;
        boolean result6 = count >= count2;

        System.out.println( "Result6 is "+ result6 ); //FALSE


        // <=  -- Less than OR equals

        System.out.println(  4 <= 8  ); // TRUE

        System.out.println( 6 <= 6); // TRUE

        System.out.println(  9 <= 8); // FALSE

        System.out.println(  'a' <= 'b'); // TRUE

        System.out.println( "hi" == "bye"); //

        System.out.println(  "hi"  == "hi" ); //

        System.out.println( "hi" != " hi");

      //  System.out.println("hi" > "hi"); >, < >=, <=

        int x = 'b';

        int y = x;
        System.out.println( x > y); //
    }
}
