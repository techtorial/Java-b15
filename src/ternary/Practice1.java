package ternary;

public class Practice1 {

    public static void main(String[] args) {


        // booleanCondition   ?    value1 : value2 ;

        int a = 16, b = 7;

        int result = a < b ? a + b : a * b;

        System.out.println(result); //

        String result1 = a != b ? "Addition" : "Multiplication";

        System.out.println(result1);

        System.out.println(a >= b + 9 ? 'c' : "check");

        //String result3 = a >= b + 9 ? 'c' : "check";  since data types of the options are different
        // you cannot store it.

        String str1 = "I am so lucky";
        String str2 = "It is going great";
        String day = "Sunday";

        System.out.println(day.equals("Monday") ? str2 : str1);
        System.out.println("a --> " + a);
        System.out.println("b --> " + b);

        System.out.println(a > b ? ++a + ++b : --a + --b);// 25

        System.out.println("a --> " + a);
        System.out.println("b --> " + b);


        // nested ternary
        //a > b ? ++a + ++b : --a + --b

        // day.equals("Monday") ? str2 : a > b ? ++a + ++b : --a + --b

        // day.equals("Monday") ?  a >= b + 9 ? 'c' : "check"  : a > b ? ++a + ++b : --a + --b


        System.out.println(  day.equals("Monday") ? str2 : a > b ? ++a + ++b : --a + --b     ); //25, 27


        System.out.println(  day.equals("Monday") ? ( a >= b + 9 ? 'c' : "check" ) : (a > b ? ++a + ++b : --a + --b ));

        System.out.println(day.indexOf(a > b ? ++a + ++b : --a + --b));






    }
}
