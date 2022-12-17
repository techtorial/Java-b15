package mentoring;

public class Mul {
    public static void main(String[] args) {
        /*
        1 - 5

        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        ..
        1 * 10 = 10
        ----
        2* 1 = 10
        .....

        5 * 10 = 50

         */

        for(int i = 1; i<= 5; i++){
            for( int k = 1; k <= 10 ; k++){
                System.out.println(i + " * " + k + " = " + (i*k));
            }

            System.out.println("=============");
        }


    }
}
