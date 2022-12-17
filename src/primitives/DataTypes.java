package primitives;

public class DataTypes {

    public static void main(String[] args) {

        byte numberBt = 13;
        System.out.println(numberBt);
        // byte bt2 = -129;

        short numberSh = 1230;
        System.out.println(numberSh);

        int numberI = 100;
        System.out.println(numberI);

        long numberL = 1232526274537L;


        float number5 = 2.3f;
        System.out.println(number5);
        float number6 = 0.7F;
        System.out.println(number6);

        float number7 = 5f;
        System.out.println(number7); // 5.0

        double numberD = 2;
        System.out.println(numberD);


        byte b1 = 5;

        short sh1 = b1;
        System.out.println(sh1); // shows 5

        // byte bt2 = sh1; //because of data type, compile time error

        //  int age  = numberD; //because of data type, compile time error

        // int age = 2.5;

        System.out.println(  Short.MIN_VALUE  );

        System.out.println(  Byte.MIN_VALUE  );

        System.out.println(  Byte.MAX_VALUE );


        int number9 = 1_000_000;

        int number10 = 1234_566_7;
        System.out.println(number9);


    }
}
