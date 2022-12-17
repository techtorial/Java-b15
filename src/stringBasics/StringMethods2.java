package stringBasics;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "phone";

        System.out.println(str.charAt(4));// e

        //   System.out.println(     str.charAt(5)    ); // StringIndexOutOfBoundsException

        //   System.out.println(    str.charAt(-3)    ); // StringIndexOutOfBoundsException

        //  System.out.println(   str.charAt(  str.length()  )   ); // e ? StringIndexOutOfBoundsException

        System.out.println(str.charAt(str.length() - 2)); // n

        str = "phone";
        // indexOf();
        System.out.println(str.indexOf('p')); // 0

        System.out.println(str.indexOf("p")); // 0

        System.out.println(str.indexOf("ph")); // 0 --> if given chars will match within the string
        // in the same order sequence, it will return
        // first matching char's index number

        System.out.println(str.indexOf("nE")); // 3

        str = "new York";
        // index number of space
        System.out.println(str.indexOf(' ')); // 3

        str = "*******happy evening**************************** to you";
        System.out.println(str.indexOf('y')); // 4

        // find index of second 'y'
        System.out.println(str.indexOf('y', 5)); // 1

        // how to pass index 5 above by dynamically?
        int indexOfSecondY = str.indexOf('y', str.indexOf('y') + 1);

        System.out.println(indexOfSecondY); // 17

        String word = "Java is getting easy :)";

        // find the second space's index number
        System.out.println(word.indexOf(' ', word.indexOf(' ') + 1));

        System.out.println(word.indexOf("easy :)")); //

        String text = "DO whatever it Takes ";

        System.out.println(text.toLowerCase()); //
        System.out.println(text.toUpperCase()); //
        String str2 = text.toUpperCase();
        System.out.println(text); // ?  DO whatever it Takes
        System.out.println(str2);

        text = text.concat(str2).toUpperCase();
        System.out.println(text);

        text += text.concat(str2).toUpperCase();
        System.out.println(text);



    }
}
