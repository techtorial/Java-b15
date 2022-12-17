package stringBasics;

public class StringMethods1 {
    public static void main(String[] args) {

        String str = "Sunday";

        // length(); count number of characters in given string and return it as int(number)

        int number = str.length(); //
        System.out.println(number);

        str += " is a rainy day"; // concat

        int number1 = str.length();
        System.out.println(number1);
        // concat()
        str = str.concat(" and java is getting easy");
        System.out.println(str);

        //charAt(); it will return a single char from given position on a string

        str = "re d$";
        char symbol = str.charAt(4);
        System.out.println(symbol);
        char symbol2 = str.charAt(0);
        System.out.println(symbol2);
        System.out.println(str);
        // want to take last char from given string, but you do not know the index number for last char

        int count = str.length();
        char last = str.charAt(count - 1);
        System.out.println(last);

        System.out.println(str.charAt( str.length() - 1 ) );


    }
}
