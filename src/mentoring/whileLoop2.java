package mentoring;

public class whileLoop2 {
    public static void main(String[] args) {
        /*
        It is necessary for the program to display the following sequence of numbers:
            7 14 21 28 35 42 49 56 63 70 77 84 91 98
         */

        int number = 7;

        while(number <= 98){
            System.out.print(number+ " ");
            number = number + 7;
        }
    }
}
