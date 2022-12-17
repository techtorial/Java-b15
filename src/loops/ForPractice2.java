package loops;

public class ForPractice2 {

    public static void main(String[] args) {


        // find the sum of numbers between 10 and 15 by using for loop
        int sum = 0;
        for (int a = 10; a <= 15; a++) {

            sum = sum + a;

        }
        System.out.println("sum " + sum);


        String str = "Today is beautiful"; // l - 9
        // print out evey letter from this given string separated by comma
        // T, o, d, ...

        for (int i = 0; i < str.length(); i++) {

            //System.out.print(   str.charAt( i ) + ", "    );

            if (i == str.length() - 1) {
                System.out.print(str.charAt(i));
            } else {
                System.out.print(str.charAt(i) + ", ");
            }
        }

        System.out.println();
        System.out.println("========");
        // print above style without spaces -- get rid of spaces and print letters separated by dashes
        str = "Today is beautiful";
        str = str.replace(" ", "");

        for (int i = 0; i < str.length(); i++) {

            if (i == str.length() - 1) {
                System.out.print(str.charAt(i));
            } else {
                System.out.print(str.charAt(i) + "- ");
            }
        }
        System.out.println();
        System.out.println("========");
        str = "Today is beautiful";
        for (int i = 0; i < str.length(); i++) {

            if (i == str.length() - 1  && str.charAt(i) != ' ') {

                System.out.print(str.charAt(i));

            } else if( str.charAt(i) != ' ') {
                System.out.print(str.charAt(i) + "- ");
            }
        }

    }
}
