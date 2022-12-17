package ifStatement;

public class ElseIfPractice1 {
    public static void main(String[] args) {

        /*
        pick a number btwn 0 and 15

            if the number is 0 - 5 --> your number is in the range of 0 and 5
            if the number is 6 - 10 -> your number is in the range of 6 and 10
            if the number is 11 - 15 -> your number is in the range of 11 and 15
         */
        int number = 10;
        if ( number >=0 && number <=5){

            System.out.println("your number is in the range of 0 and 5");

        } else if(number >5 && number <=10){

            System.out.println("your number is in the range of 6 and 10");

        }else if(number > 10 && number <=15){

            System.out.println("your number is in the range of 11 and 15");

        }else{
            System.out.println("Out of RANGE");
        }


    }
}
