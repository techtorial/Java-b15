package loops;

public class DoWhilePractice4 {

    public static void main(String[] args) {
        /*
        String str  = "@$%SdvH&S345";
        count the number of letters --> Letters count -> 5
        count number of digits     --> digit count --> 3
        count number of other symbols --> symbol count --> 4
         */
        String str = "@$%SdvH&S345";
        // how to take a char from a string?

        str.charAt(0); //--> @

        // how to check if a character is letter/digit/symbol

        if (str.charAt(0) >= 'a' || str.charAt(0) <= 'z') ;

        // how to execute something repeatedly?
        // need to create a loop
        int indexNumber = 0, letterCounter = 0, digitCounter = 0, symbolCounter = 0;
        do {

            char ch = str.charAt(indexNumber);

            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {

                letterCounter++;
            } else if (ch >= '0' && ch <= '9') {
                digitCounter++;
            } else {
                symbolCounter++;
            }
            indexNumber++;
        } while (indexNumber < str.length());

        System.out.println("Letter count --> " + letterCounter);
        System.out.println("Digit Counter --> " + digitCounter);
        System.out.println("Symbol Counter --> " + symbolCounter);


        // find letters 'o' and 'O' and count them

        String sentence = "I can do it on my own this time";

        int index = 0;
        int count = 0;
        do {

            char letter = sentence.charAt(index);

            if (letter == 'o' || letter == 'O') {
                count++;
            }
            index++;

        } while (index < sentence.length());

        System.out.println("Count of 'O' is: "+count);

    }
}
