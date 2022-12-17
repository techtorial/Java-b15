package ternary;

public class Practice2 {
    public static void main(String[] args) {


        String str = "Techtorial";

        String str1 = new String("Techtorial");


        String result1 = 'a' == 'a' ? str.concat(" Academy") : str.replace("Tech", "TECH");

        System.out.println( result1); // Techtorial Academy

        System.out.println(    'a' == 'a' ? str.concat(" Academy") : str.replace("Tech", "TECH")     );

        System.out.println(    'a' > 'a' ? str.concat(" Academy") : str.replace("Tech", "TECH")     );



    }
}
