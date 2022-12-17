package scannerPractice;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {
        /*
        David wants to deposit his money into his bank account
            -he already got $200 in his account
            -he got three different paychecks ($480, $600 and $350)
            -he can only deposit one paycheck at a time
            -after he got his money in the account
            - he bought a phone for $599 and headphone for $299
            - calculate his final money in his account
         */
        Scanner scanner = new Scanner(System.in);

        double balance = 200;

        System.out.println("Please enter first deposit amount");
        double firstCheck = scanner.nextDouble();
        balance = balance + firstCheck; //==> balance += firstCheck;

        System.out.println("Please enter second deposit amount");
        double secondCheck = scanner.nextDouble();
        balance +=secondCheck;

        System.out.println("Please enter third deposit amount");
        double thirdCheck = scanner.nextDouble();
        balance +=thirdCheck;

        System.out.println("Your balance after deposits is: "+balance);

        System.out.println("Please enter phone price");
        double phone$ = scanner.nextDouble();
        balance -= phone$;

        System.out.println("Please enter headphone price");
        double headphone$ = scanner.nextDouble();
        balance -=headphone$;

        System.out.println("After buying some items your balance is: "+balance);



    }
}
