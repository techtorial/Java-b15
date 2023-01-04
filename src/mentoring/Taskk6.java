package mentoring;

import java.util.Scanner;

public class Taskk6 {
    /*
    Using a scanner enter a sentence that is not separated by space and each word
starts with upper case. Print given String as separated words with spaces.
Example:
Given Value: "IWantToLearnJava"
Output: I Want To Learn Java
Example-2:
Given Value: "ItIsSunnyOutside"
Output: It Is Sunny Outside
     */
    public static void main(String[] args) {

//
//    Scanner scanner = new Scanner(System.in);
//
//System.out.println("Enter your sentence");
//    String word = scanner.nextLine();
//
//    String[] parts = word.split("(?=[A-Z])");
//
//for (String sentence:parts) {
//        System.out.print(sentence+" ");
//
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plewase enter your string");
        String str = scanner.nextLine();
        String newStr = "";

        for(int i = 0; i<str.length(); i++){
           char letter =  str.charAt(i);
           if(i == 0){
               newStr= newStr+letter;
           }else if(letter >= 'A' && letter <='Z'){
               newStr = newStr+" "+ letter;
           }else
               newStr= newStr+letter;

        }
        System.out.println(newStr);

}}
