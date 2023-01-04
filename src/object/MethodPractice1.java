package object;

public class MethodPractice1 {

    // create a method that will add two integer numbers and return the sum

    public int sumCalculator(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println("Two int parameter method is running");
        return sum;
        // return num1 + num2;
    }

    public int sumCalculator(int num1, int num2, int num3) {

        System.out.println("Three int parameter method is running");
        int sum = num1 + num2 + num3;

        return sum;
    }

    // overload sumCalculator method to find sum of numbers from a given array
    public int sumCalculator(int[] numbers) {
        // {2,4,5,6,7}
        int sum = 0;
        for (int num : numbers) {

            sum = sum + num;
        }

        return sum;
    }



    public static void main(String[] args) {

        MethodPractice1 object = new MethodPractice1();

        int total1 = object.sumCalculator(12, 50);

        System.out.println(">>>>>> " + total1);

        int total2 = object.sumCalculator(3, 34, 11);
        System.out.println(total2);
        int[] arr = {2, 4, 5, 8};
        int total3 = object.sumCalculator(arr);
        System.out.println(total3);
        System.out.println(object.sumCalculator(new int[]{3, 4, 5}));

    }

}
