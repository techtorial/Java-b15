package variables;

public class Practice1 {
    public static void main(String[] args){

        // I want to add numbers 3, 5, 2 and show the total in the console
        System.out.println(3 + 5 + 2);

        //variables

        int redApples = 3;
        int greenApples = 5;
        int yellowApples = 2;

        System.out.println( redApples ); // it will show 3
        System.out.println("redApples");

        //I want to print -->  Number of Red apples is 3

        System.out.println( "Number of Red apples is " + 3);

        System.out.println( "Number of Red apples is " + redApples);

        // create a variable and name it as "total"
        // get the value for this 'total' variable by adding apples together
        // print out the total in a sentence --> Total number of apples is ....

        int total = redApples + greenApples + yellowApples;
        System.out.println("Total number of apples is " + total);

        // create variables for prices of each apple type
        // each red-> 2, each green ->3, each yellow -> 4
        // create variable for total cost
        // show that how much you need to pay for all together

        int redPrice = 2;
        int greenPrice = 3;
        int yellowPrice = 4;

        int totalPrice = (redApples * redPrice) + (greenApples * greenPrice) + (yellowApples * yellowPrice);

        System.out.println( "You need to pay "+ totalPrice);

      //  int redApples = 11; you cannot create multiple variables by using same name



    }

}
