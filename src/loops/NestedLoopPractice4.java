package loops;

public class NestedLoopPractice4 {
    public static void main(String[] args) {

        /*
        create multiplication table for numbers 1 to 5
        1 * 1 = 1
        1 * 2 = 2
        ...
        1 * 10 = 10
        ===========
        2 * 1 = 2
        2 * 2 = 4
        ...
        2 *10 = 20

         */

        for (int a = 1; a <6; a ++){

            for (int b= 1; b <=10 ; b ++){
                System.out.println( a +" * "+ b + " = " + a * b);

                if (b==5){
                    break;
                }
            }
            if (a == 4){
                break;
            }
            System.out.println("===============");
        }
    }
}
