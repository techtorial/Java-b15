package loops;

public class WhilePractice6 {
    public static void main(String[] args) {


        // print out every letter from a given string by separating them with dash

      String str =  "television"; // --> t-e-l-e-v-i-s-i-o-n

//        System.out.print(   str.charAt(0) + " -"  );
//        System.out.print(   str.charAt(1) + " - "  );
//        System.out.print(   str.charAt(2)  +" - " );
//        System.out.print(   str.charAt(3)  + " - " );


        int number = 0;

        while (  number <= str.length()-1 ){
            //System.out.print(   str.charAt( number )  + "-" );

            if ( number == str.length()-1){
                System.out.print(   str.charAt( number ) );
            }else {
                System.out.print(   str.charAt( number ) + "-"  );
            }
            number++;
        }

    }
}
