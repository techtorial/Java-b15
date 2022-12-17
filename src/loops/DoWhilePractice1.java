package loops;

public class DoWhilePractice1 {


    public static void main(String[] args) {


        // "***" for ten times with while loop
        int num = 1, last =10;
        while( num >last  ){

            System.out.println("***");
            num++;
        }

        // "***" for ten times with do-while loop

        num = 1; last =10;

        do{
            System.out.println("$$$");
            num++;

        }while (num > last);



        int x = 5, y = 20;

        do {
            System.out.println("Hello, it is DO-WHILE");

            y--;

        }while(y > x );
        System.out.println("y --> " +y);

        // ==================
        do {
            System.out.println("Hello, it is DO-WHILE - 2 ");

            y--;

        }while(y > x ); // false


        do {
            System.out.println("Test");
        }while (4 < 0);  // False



    }
}
