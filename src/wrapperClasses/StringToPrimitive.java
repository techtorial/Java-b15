package wrapperClasses;

public class StringToPrimitive {

    public static void main(String[] args) {

        String str1 = "1234";
        String str2 = "5678";

        System.out.println(str1 + str2); // concat --> "12345678"

        //parse
        int number = Integer.parseInt(str1);// parsing
        Integer number1 = Integer.parseInt(str1);// parse and autobox

        Short number3 = Short.parseShort(str2);

        System.out.println(number1 + number3); //6912

        String str3 = "abcd";

//        int i3 = Integer.parseInt(str3); // NumberFormatException
//        System.out.println(i3);

        char symbol1 = 'w';
        int i4 = symbol1;
        System.out.println(i4);

        //valueOf() --> convert primitive to String

        int number4 = 12;

        String numberAsString = String.valueOf(number4);

        System.out.println(numberAsString + 10);

        boolean bl = true;

        String booleanAsString = String.valueOf(bl);

        System.out.println( booleanAsString.toUpperCase()   );















    }
}
