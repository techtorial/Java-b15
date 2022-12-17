package mentoring;

import java.util.Scanner;

public class monkey {
    public static void main(String[] args) {
        /*

We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("is monkey 1 is smiling ");
        boolean smile1 = scanner.nextBoolean();
        System.out.println("is monkey 2 is smiling");
        boolean smile2 = scanner.nextBoolean();

        if(smile1 == smile2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
