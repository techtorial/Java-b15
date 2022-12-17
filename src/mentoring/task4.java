package mentoring;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sentence with only three words");
        String sentence = sc.nextLine();

        int firstSoace = sentence.indexOf(" ");
        int secondSpace = sentence.indexOf(" ",firstSoace+1);

        System.out.println(firstSoace-1 +" index number of " + sentence.charAt(firstSoace - 1));
        System.out.println(secondSpace-1 + " index number of " + sentence.charAt(secondSpace - 1 ));
        System.out.println(sentence.length()-1 +  " index number of " + sentence.charAt(sentence.length()-1));




    }
}
