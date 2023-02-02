package RecapWithAhmet;

import java.util.Scanner;

public class Loops {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
     1-MANY technical and automation questions are required the loops

       TYPES OF LOOPS:

         1-Do while --> No matter what it will run the code ONCE
         2-While -->It will check the condition and run based on that
         3-For -->It will initiliaze variable, condition and Pre-post Increment(i++,i--)
         4-ForEach->it will access all of the data in the storage.(ITERATE one BY ONE)

     */

    public static void main(String[] args) {
//        String username="";
//        do {
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("Please enter your username");
//            username=scanner.nextLine();
//            System.out.println(username);
//        }while(username.startsWith("A"));

        //WHILE --> 1-Ask the user put an int number and reverse the int number
                    //by using while loop and String
                    //2-Multiply the digits
        //EXP:12345 --> FIRST OUTPUT= 54321 --> SECOND OUTPUT--> 120

        //WHAT I WOULD DO IF I GOT THIS QUESTION:
        //1-Always verify the question with Interviewer
        //2-Loudly you can think of the steps that you will follow
        //3-PUT THE STEPS ON YOUR MIND DIRECTLY
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Please input a number");
//        int number=scanner.nextInt();
//         //12345 ==> %10 -->5  /10 -->1234 -->%10 -->4   /10 --->123 etc. 1 -->10 --> 0
//        String reverse="";
//        int total=1;
//        while(number!=0){
//            int digit=number%10;
//            reverse+=digit;
//            total*=digit;
//            number/=10;
//        }
//        System.out.println(reverse);
//        System.out.println(total);


        /*
      HOMEWORK:
  USING SCANNER: Ask user to enter one string value with 3 words
  1-Print first letter of Each Word
  2-Print last letter of each Word
  3-Print the sum of  index of first letters
  4-Print the sum of the last letter of each word's index number
  5-Print the difference between total last index and total first index

  CLUES:I would use if condition for charAt and ' '

  EXAMPLE:"Ahmet Loves Java" i == space 5  --> i+1
  //output:ALJ
  //output:tsa
  //output:18
  //output:29
  //output:11

  NOTE:YOu can use either one or two loops.
  //Ahmet Loves Java
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the 3 words");
        String words=scanner.nextLine().trim();
        String firstLetters=""; String lastLetters="";
        firstLetters+=words.charAt(0);
        int firstLetterIndex=0;
        int lastLetterIndex=0;

        for(int i=0;i<words.length();i++){
            if(words.charAt(i)==' '){
                firstLetters+=words.charAt(i+1);
                lastLetters+=words.charAt(i-1);
                firstLetterIndex+=i+1;
                lastLetterIndex+=i-1;
            }
        }
        lastLetters+=words.charAt(words.length()-1);
        lastLetterIndex+=words.length()-1;
        System.out.println(firstLetters);
        System.out.println(lastLetters);
        System.out.println(firstLetterIndex);
        System.out.println(lastLetterIndex);
        System.out.println(firstLetterIndex-lastLetterIndex);
        int result=firstLetterIndex>lastLetterIndex ? firstLetterIndex-lastLetterIndex :lastLetterIndex-firstLetterIndex;
        System.out.println(result);
    }




}
