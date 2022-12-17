package ifStatement;

public class ElsePractice {
    public static void main(String[] args) {

        int money = 100;

        // if your money is more than $100, you can get an item


        if (money > 100) {

            System.out.println("I can Buy an Item");
        } else {

            System.out.println("I canNOT buy item");
        }

        money = 101;

        if (money > 100) {
            System.out.println("I CAN Buy");
        } else {
            System.out.println("I CANNOT buy");
        }


    }
}
