package mentoring;

import java.util.Scanner;

public class Taskk5 {
    public static void main(String[] args) {
        /*
        Using the scanner ask the user to enter one string value and print only
unique letters combined as String also without any space in the
beginning and at the end.
Example -1 :
Given Value: "as"
Output: i am hpy
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String str = scanner.nextLine();

        String uniqueLetters = "";

        for(int i = 0; i< str.length(); i++){
            String letter = str.charAt(i)+"";
            if(!uniqueLetters.contains(letter)){
                uniqueLetters = uniqueLetters + letter;
            }else if(letter.equals(" ")){
                uniqueLetters = uniqueLetters + letter;
            }
        }
        System.out.println(uniqueLetters);

    }
}
