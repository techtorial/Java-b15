package loops;

public class ForEachPractice1 {

    public static void main(String[] args) {

        int[] numbers = {3,5,6,7,8,9,10};


        // by using for-each loop print elements

        for( int number   : numbers ){

            System.out.println( number  );

            System.out.println( number + 10);

        }

        String[] items = {"Cup", "bottle", "Microphone"};

        for ( String str : items ){

          if (str.equalsIgnoreCase("CUP")){
              System.out.println(str);
          }

        }


    }
}
