package exceptions;

public class Practice2 {

    public static void main(String[] args) {




        try{

            System.out.println(     "   FIRST   ");
            String str = "b15";


            int result = 15 / 0; // ArithmeticException


            System.out.println(    "    SECOND   ");


            int number = Integer.parseInt(str);  // NumberFormatException

            System.out.println(      "   THIRD   ");

        }catch (ArithmeticException e){
            System.out.println("CATCH");
        }catch (RuntimeException e1){
            System.out.println("CATCH2");
        }finally {
            System.out.println("---------");
        }

        try {
            String str = "Last";
            String reversed ="";
            for (int i= str.length(); i>0; i --){   // StringIndexOutOfBoundsException

                reversed += str.charAt(i);
            }
            System.out.println(reversed);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println( e.getMessage());
            System.out.println( e.getCause());
        }finally {
            System.out.println("++++");
        }


        System.out.println("*****");

    }
}
