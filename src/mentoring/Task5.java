package mentoring;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

//
        /*
        Using a scanner enter three different ingredients for the product on the same line. Then ask the user to enter any int number. Change the first letter of the ingredients starting from the entered number. (Ingredients should start with different letters. Please read the example carefully ) Example 1:
Please enter three ingredients with spaces: Milk Peanuts Butter
 Please enter the int number:
 5
The output is:
 5ilk 6eanuts 7utter
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your three ingredients");
        String ing = sc.nextLine();
        System.out.println("Please enter your number");
        int num = sc.nextInt();

        int space1 = ing.indexOf(" ");
        int space2 = ing.indexOf(" ", space1+1);

        String word1 = ing.substring(0, space1);
        String word2 = ing.substring(space1 + 1, space2);
        String word3 = ing.substring(space2+1);

        String firstLetterOdfirst = "" + word1.charAt(0);
        String firstLetterOfSecond = "" + word2.charAt(0);
        String firstLetterOfthird= "" + word3.charAt(0);

        String convertNum = "" + num;

        String replaceWord1 = word1.replace(firstLetterOdfirst, convertNum);
        num++;
        String converNum2 = "" + num;
        String replaceWord2 = word2.replace(firstLetterOfSecond, converNum2);
        num++;
        String convertNum3 = ""+ num;
        String replaceWord3 = word3.replace(firstLetterOfthird, convertNum3);

        System.out.println(replaceWord1+ " "+ replaceWord2 + " " + replaceWord3);






    }
}
