package RecapWithAhmet;

import java.util.Scanner;

public class IfAndTernary {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
     1-Most of the technical questions are required if condition

      If is a conditional statement

        If(condition){                        if(condition){
           Implementation                     else if(condition)
           else{                              else{
           Implementation

           AND (&)                               OR (||)
           TRUE & TRUE -->TRUE                  TRUE || TRUE --> TRUE
           FALSE & FALSE -->FALSE               FALSE || FALSE -->FALSE
           TRUE & FALSE -->FALSE                TRUE || FALSE --> TRUE
     */
    public static void main(String[] args) {

        /*
        -10-0 -->super cold
        0-25 -->it is normal
        25-50-->it is hot
         */
        Scanner scanner=new Scanner(System.in);
       int actualTemperature=scanner.nextInt();

        if(actualTemperature<0 && actualTemperature>-10){
            System.out.println("It is super cold");
        }else if(actualTemperature<25 && actualTemperature>0){
            System.out.println("It is normal");
        }else if(actualTemperature<50 && actualTemperature>25){
            System.out.println("it is hot");
        }else{
            System.out.println("The input is not applied for the conditions please check");
        }
        boolean result=actualTemperature>10 || actualTemperature<5;
        System.out.println(result);

        //TERNARY OPERATORS: CONDITION  ? VALUE1 : VALUE2; //CONDITION TRUE ==> VALUE1  FALSE ==? VALUE2
         String name="Ahmet";
         String name2="ahmet";
        String result2=name.equalsIgnoreCase(name2) ? "The values are matching" : "The Values are not Matching";
         if(name.equalsIgnoreCase(name2)){
             System.out.println("The values are matching");
         }             else{
             System.out.println("The Values are not Matching");
         }
        System.out.println(result2);



    }



}
