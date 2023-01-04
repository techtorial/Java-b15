package object;

import java.util.Scanner;

public class MethodPractice2 {

    public static void main(String[] args) {
        MethodPractice2 john = new MethodPractice2();
        double call1 = john.test1(3.2, 1.8, "multiply");
        System.out.println(call1); //
        double call2 = john.test1(4, 4.5, "add");
        System.out.println(call2);

        john.test1(3, 1, "multiply");
        john.test1(2, 8, "multiply");
        john.test1(3, 1.8, "multiply");
        john.test1(3, 8.6, "multiply");

        int x = john.ageCalculator();
        short y = john.ageCalculator(1999);
        short a = 2022;
        int z = john.ageCalculator(a);


    }

    // create a method that will take two double numbers and an operation name
    //this method will return the result
    // *operation --> addition or multiplication

    public double test1(double num1, double num2, String operationName) {

        if (operationName.equalsIgnoreCase("multiply")) {
            double result = num1 * num2;
            return result;
        } else {

            double sum = num1 + num2;
            return sum;
        }

    }
    // create a method that will find out your age
    // return and print the age

    public int ageCalculator() {
        // current year - birth year

        int age = 2022 - 2003;
        System.out.println("Your age is: " + age);
        return age;
    }

    public short ageCalculator(int birthYear) {
        short age = (short) (2022 - birthYear);
        System.out.println("Your age is: " + age);
        return age;
    }

    public int ageCalculator(int currentYear, int birthYear) {

        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
        return age;
    }

    public int ageCalculator(short currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your birth year?");
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
        return age;
    }


}
