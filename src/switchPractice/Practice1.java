package switchPractice;

public class Practice1 {
    public static void main(String[] args) {

        int count = 2;
        switch (count) {

            default:
                System.out.println("NO COLOR");
                break;
            case 5:
                System.out.println("RED");
                System.out.println("red");
                System.out.println("rED");
                int number = 9;
                System.out.println( number * number);
               break;
            case 2:
                System.out.println("Yellow");
                break;

            case 1:
                System.out.println("White");
                break;
            case 10:
                System.out.println("PINK");
                break;

        }
        System.out.println("This is end of switch statement");

    }
}
