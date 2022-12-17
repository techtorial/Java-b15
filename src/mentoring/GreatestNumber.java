package mentoring;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        /*
        Take three numbers from the user and print the greatest number.
		Test Data
		Input the 1st number: 25
		Input the 2nd number: 78
		Input the 3rd number: 87
		Expected Output :
		The greatest: 87
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter second number");
        int secondNum = scanner.nextInt();

        System.out.println("Please enter third number");
        int thirdNum = scanner.nextInt();

        if(firstNum > secondNum && firstNum> thirdNum){
            System.out.println(firstNum);

        } else if (secondNum> firstNum && secondNum> thirdNum) {
            System.out.println(secondNum);

        }else {
            System.out.println(thirdNum);
        }


    }
}
