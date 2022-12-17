package stringBasics;

public class StringMethod4 {

    public static void main(String[] args) {

        String str = "wednesday";

        String strUpdate = str.replace('e', '*');

        System.out.println(strUpdate);

        String update2 = str.replace("d", "$$");

        System.out.println(update2);

        String update3 = str.replace("day", "-");
        System.out.println(update3);

        String str2 = "     today is       so quiet   ";

        String result = str2.trim();

        System.out.println(result);


        // method chaining(able to call/use another method after method call)

        int number = str2.trim().replace('t', 'T').substring(2, 8).length();

        System.out.println(number);


        String quote = "   From Zero to HERO    ";
        /*
            replace 'zero' with 'one'
            make entire string as uppercase
            remove ALL spaces
            get a three letters substring from the end
            print-out whatever you have left with
         */

        String result2 = quote.replace("Zero", "one").toUpperCase().trim().replace(" ", "");
        String result3 = result2.substring(result2.length() - 3);

        System.out.println(result3);

        System.out.println(

         quote.replace("Zero", "one").toUpperCase().trim()
                .replace(" ", "")
                .substring(quote.replace("Zero", "one").toUpperCase().trim().replace(" ", "").length() -3)

       );


    }
}
