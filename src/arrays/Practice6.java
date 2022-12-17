package arrays;

public class Practice6 {
    public static void main(String[] args) {

        char ch = '7';


        char[] symbols = {'a', '#', '9', 'W', '3', '6', '@'};

        // print out only digits
        // print out other symbols(ex: #, $, &, @ ..)

        // count digits, letters and other symbols
        // There are ...2.. letters
        // There are ..5.. digits
        // There are ..1.. other symbols
        // can we store numbers in to a new array?

        int dit = 0, let = 0, oth = 0;
        for (int index = 0 ; index < symbols.length; index++) {

            if (symbols[index] >= '0' && symbols[index] <= '9') {
                    dit++;
                System.out.println(symbols[index]);

            } else if (symbols[index] >= 'a' && symbols[index] <= 'z' || symbols[index] >= 'A' && symbols[index] <= 'Z') {
                let++;
                System.out.println("THESE are LETTERS: " + symbols[index]);

            } else {
                oth++;
                System.out.println("OTHERS: " + symbols[index]);
            }

        }
        System.out.println( "There are "+dit + " digits");
        System.out.println( "There are "+let + " letters");
        System.out.println( "There are "+oth + " other symbols");

    }

}
