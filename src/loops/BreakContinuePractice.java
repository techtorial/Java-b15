package loops;

public class BreakContinuePractice {

    public static void main(String[] args) {

//
//        for (int i = 0; i < 16; i++) {
//
//            System.out.println(i);
//
//            break;
//
//            //  System.out.println(); not reachable statement, because it is coming after break statement
//        }
//
//        System.out.println("********");
//
//        for (int i = 0; i < 16; i++) {
//            System.out.println(i);
//            if (i == 3) {
//
//                System.out.println("Hi");
//
//                break;
//
//            }
//        }
//
//        System.out.println("++++++++++");

        for (int i = 0; i < 20; i++) {
            if (i >= 10 && i <= 13) {

                continue;

            }if (i > 12){
                break;
            }

            System.out.println(i + "Bye");


        }


    }


}
