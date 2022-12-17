package primitives;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int num1 =  5 + 7 + 4 * 6;
        System.out.println(num1); // 36

        int num2 = num1 / num1 + 10 * 1 - 10 + 3/3;

        System.out.println(num2); // 1,2,2

        int num3 = num2 - ( num1 + 9 - 7) * 3 - (num1 + num1);

        System.out.println(num3);


    }
}
