package loops;

public class ForPractice3 {

    public static void main(String[] args) {

        String str = "It is a cloudy day in Chicago";

        // print out >> "I found a lowercase 'c'"
        // when you see a lowercase 'c'

        //- why do you need to create a loop to solve this q?
        //- why do you need to use 'if' statement to solve this question?

        // count how many 'c' in the string?
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'c') {
                counter++;
                System.out.println("I found a lowercase 'c'");

            }
//            if (i == str.length()-1){
//                System.out.println("I found "+counter+ " 'c's in the string");
//            }

            // print out letter 'i''s from the string

            if (str.charAt(i) == 'i'){
                System.out.println(str.charAt(i));
            }

        }
        System.out.println("I found " + counter + " 'c's in the string");


    }
}
