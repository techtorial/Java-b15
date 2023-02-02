package stringBuilder;

public class Practice1 {

    // create a program to print uppercase alphabet as a single String

    public static String alphabet() {
        String str = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            str += c;
            System.out.println( str);
        }
        return str;
    }

    // use StringBuilder to print lowercase alphabet
   static public void alphabet2(){
        StringBuilder builder = new StringBuilder();
        for (  char ch = 'a'     ; ch <='z'    ; ch++ ){
           builder.append(ch);
        }
       System.out.println(builder);

    }


    public static void main(String[] args) {
        alphabet2();
        String str1 = alphabet();
        System.out.println(   str1.charAt(5)   ); //

        StringBuilder builder = new StringBuilder("Sunny");
        System.out.println( builder  ); // Sunny

        StringBuilder builder1 = new StringBuilder();
       // builder1 = "Winter"; // compile time error
        builder1.append("Winter");

        System.out.println(builder1); // Winter

        builder1.append(" is not having snow for this year");
        System.out.println(builder1);//

        builder1 = builder1.append(" is not having snow for this year");

        System.out.println(builder1);

        builder1.append(builder1.append(" ** "));
        System.out.println( builder1);



    }

}
