package object;

public class Cat {

    String name; // declared an instance variable
    String color;
    int age;
    int foodAmount = 20; // declared and initialized an instance variable

    // create a method that will just print out
    // "..Tom.. is sleeping"
    // use this method in the test class

    public void sleep(){

        System.out.println( name + " is sleeping");
    }

    // create a run method that will return an integer number
    // that is indicating how many miles user run


    public int run(){

        System.out.println(name + " is running");

        return 3;
    }


    // create a method that will return a String value --> "...tom... is walking to ...west..."
    // destination should come from parameter

    public String walk( String destination   ){

        return  name + " is walking to "+ destination;
    }

    // create a method that will initialize color of the cat

    public void setColor( String color1 ){
        color = color1;
    }
    // create a method that will return color of cat

    public String getColor(){

        return color;
    }

    // create a method that will PRINT and RETURN all properties of cat

    public String allInfo(  ){


        System.out.println( name +" - "+ color+" - "+ age + " - "+foodAmount  );

        return "*****"+name +" - "+ color+" - "+ age + " - "+foodAmount + "*****";
    }

    // set the age of cat, get the age of cat by using methods
    // once you use method in the test class to get age of cat
    // print out: "In 10 years your age will be .."

    public void setAge( int age1){

        age = age1;
    }
    public int getAge(){
        return  age;
    }








}
