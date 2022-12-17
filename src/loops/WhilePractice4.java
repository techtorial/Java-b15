package loops;
import java.util.Scanner;
public class WhilePractice4 {
    public static void main(String[] args) {

        /*
        you/user have $100

        ask user how much is the spending amount
            -if the spending amount is less than balance keep asking user and let him/her to spent more
            -if the spending amount is greater than the balance --> "you do not have enough money to spend!"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("I have $100 to spend! how much do you want to spent?");
        int amount = scanner.nextInt();
        int money = 100;


        while(money >0) {
            money = money - amount;
            if(money>0){
                System.out.println("your balance is " + money +" how much do you want to spent?");
                amount = scanner.nextInt();
            }else{
                System.out.println("You don't have enough money now");
            }
        }
    }
}
