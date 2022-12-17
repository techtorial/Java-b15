package loops;

public class WhilePractice2 {
    /*

    from the age of 18 to 25(inclusive)
    "My age is ..."
     */
    public static void main(String[] args) {


        int age = 18;



        while ( age <=25){
            System.out.println("My age is "+ age);
            age++;
        }

        // print out numbers between 30 and 45(inclusive)

        int num1 = 30, num2 = 45;

        while (num1 <= num2){

            System.out.println(num1);
            num1++;


        }
    }
}
