package primitives;

public class CharPractice {

    public static void main(String[] args){

        char letter1 = 'A';

        System.out.println(letter1); // A

        char symbol1 = '*';

        System.out.println( symbol1); // *

        char letter2 = 'z'; //

        System.out.println(letter2); // lower case z

        char symbol2 = '6';
        System.out.println(symbol2);

        System.out.println(  symbol2  + letter2   ); // expectation is 6z, some number

        int symbol3 = 'z';
        System.out.println(symbol3); // 122

        char symbol4 = 90;
        System.out.println(symbol4); // Z

        // try to do similar implementation for your first initial

        // E
        char init = 'E';
        char initAsNumber = 69;
        int initAsChar = 'E';

        System.out.println(init);
        System.out.println(initAsNumber);
        System.out.println(initAsChar);

        // you want to print everything as is on the single print

        System.out.println( ""+ init + initAsNumber + initAsChar);

        System.out.println( ""+ init + " - "+ initAsNumber + " - "+ initAsChar);


    }


}
