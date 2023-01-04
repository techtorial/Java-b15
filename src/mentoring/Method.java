package mentoring;

import java.lang.reflect.Array;

public class Method {
    public void name(){

        System.out.println("A");
    }




    public static void main(String[] args) {
        Method method = new Method();
        //method.name();
     //  System.out.println(method.name());

       //String letter = method.name();
       // System.out.println(letter);
       int sumOfNumbers=  method.sum(23, 5);
        System.out.println(sumOfNumbers);
        System.out.println(method.sum(23,5));

        double division = method.division(10, 5);
        System.out.println(division);

       method.sayHello();
       // System.out.println(method.sayHello());
        String word = method.sayHello();
        System.out.println(word);

        String[] names = {"Kate", "Ashely", "Lilly", "Liza"};
       String nameWithA=  method.wordStartsWithA(names);
        System.out.println(nameWithA);

    }
    public String wordStartsWithA(String[] array){
        for(String word: array){
            if(word.startsWith("A")){
                return word;
            }
        }
        return null;
    }

    public int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public double division(double num1, double num2 ){
        return num1/num2;
    }

    public void name(String shirt ){

    }

    public String sayHello(){

        return "Hello";
    }




}
