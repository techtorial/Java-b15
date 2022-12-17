package scannerPractice;

import java.util.Scanner;

public class bMICalculator {
    public static void main(String[] args) {

        //BMI = weight(kg) / (height(m) * height(m)); >> 18 - 24
        Scanner scanner = new Scanner(System.in);
        System.out.println("We are about to calculate BMI for you, please enter your weight in kgs");
        double weight = scanner.nextDouble();
        System.out.println("Can you also enter your height in meters?");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("your BMI result is: "+ bmi);

        // 2.5

    }
}
