package variables;

public class Practice2 {

    public static void main(String[] args){
        //*** java reads code from top to bottom and left to right ****
        // dataType name = value; --> full syntax to create a new variable
        // you cannot use java reserved words as variable name

        int apple = 10; // Declaring and initialing variable

        int number; // --> Declaring variable

      //  System.out.println( number); // compile time error since number does not have value yet

        number = 10; // --> Initializing variable (assigning value to the variable)

        System.out.println(number);
        System.out.println( number + 5); // shows 15,
        System.out.println("number"+5); //shows --> number5

        System.out.println(number); // 10

        number = 20; // reassigning value for number

        System.out.println( number );
        System.out.println(  number * 2 ); // 40

       // int number = 12; you cannot create variable by using same name more than once


    }
}
