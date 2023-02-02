package RecapWithAhmet;

public class JavaPrimitiveDataAsciiTable {

    /*
    Possible Interview Questions:
     1-What is Java and what do you know about JDK, JVM, JRE?

       Java:is programming language.To make a connection between computer and people.

         JDK:Java Development Kit that has some libraries which support the "application
         development"
         JRE:Java Run Time Environment which is responsible for "EXECUTIONS".
         JVM:Java Virtual Machine -->Is a virtual machine which is responsbiel for
         "converting the BYTE code To Binary Code(1,0)"

     PRIMITIVE DATA: It is a way to store the data in it. It doesn't take up too much space in
     memory.

        WHOLE NUMBERS:              DECIMAL NUMBERS:               CONDITION           CHARACTER
        ->BYTE                      -->FLOAT                    -->boolean             -->char
        ->SHORT                     -->DOUBLE ***
        ->INT ***
        ->LONG *

     ASCII TABLE: It is a table for all the characters(alphabet,digits,symbols etc..)

      short a=5;
      short b=6;
      short c=(a+b-2);
      sout(c)



     */
    public static void main(String[] args) {
        short a=5;
        short b=6;
        short c= (short) (a+b-2);
        System.out.println(c);//9

        char letter=65;
        char letter2='g';
        int number='g';
        System.out.println(number); //103
        System.out.println(letter2-letter); //103-65 -->38  g-65
        System.out.println(letter2); //103 or g
        System.out.println(letter); //A or compile time , 65
        int number1=5;
        int number2=21;
        boolean condition=number1>number2;
        boolean condition2=number2>number1;
        System.out.println(condition2); //true
        System.out.println(condition);//false
        double amount=24.5d;        //25
        double amount2=0.235545454;
        System.out.println(amount2);
        System.out.println(amount);

    int allAmount= (int) (amount+amount2); //2323..
        System.out.println(allAmount);
    }
}
