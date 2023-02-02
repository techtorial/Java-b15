package RecapWithAhmet;

import java.util.Scanner;

public class SwitchStatement {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
      1-Some of the technical questions might need switch instead of if statement to
      show off yourself that you actually know how to implement switch as well.

       -->If you have limited amount of options and not change it usually
       then it is good to use switch instead of if to make it look more professional

       SWITCH(VALUE/REFERENCE) --> int number=5;
         case dataType:
         break;
         case dataType2:
         break

     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int options=scanner.nextInt();
        switch (options){
            default:
                System.out.println("Your input is not on the range of 1-3");
                break;
            case 1:
                System.out.println("you are talking to HR");
                break;
            case 2:
                System.out.println("you are talking to IT DEPARTMENT");
                break;
            case 3:
                System.out.println("you are talking to HEALTH DEPARTMENT");
                break;
        }
    }



}
