package object;

import JavaFirst.HelloWorld;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        System.out.println(animal1);//

        System.out.println(animal1.name);
        System.out.println(animal1.color);
        System.out.println(animal1.age);

        animal1.name = "Simba";
        System.out.println(animal1.name);
        animal1.color = "brown";
        animal1.age = 2;
        System.out.println(animal1.color);
        System.out.println(animal1.age);
        System.out.println("+++++++++++++++++++++++=");
        // create another object,
        // initialize all instance variables by using new object
        // print out those new values

        Animal cat = new Animal();

        System.out.println(cat.age); // 0
        cat.age = 3;
        cat.name = "Ginger";
        cat.color = "Orange";

        System.out.println(cat.age);
        System.out.println(cat.name);
        System.out.println(cat.color);

        System.out.println(animal1.gender);

        System.out.println(cat.gender);

        cat.gender = "Male";
        System.out.println(cat.gender);


        System.out.println("=========================");

        cat.eat();
        animal1.eat();

        System.out.println("=========================");
        // create a method that will print out all properties of every animal

        cat.printInfo();
        animal1.printInfo();

        System.out.println("=========================");

        Animal dog = new Animal();

        System.out.println(dog.energyLevel); //

        dog.eat();

        System.out.println(dog.energyLevel);

        System.out.println("?? Cat's Energy ?? " + cat.energyLevel);

        // create a run method
        // when an animal runs
        // it will use 20 points of energy
        // implement the logic and show leftover energy
        // include name of the animal in the method to let user know who is running

        cat.run();
        cat.run();
        cat.run();

        cat.eat();

        Shape helper = new Shape();

        helper.perimeterCalculator(12, 17);

        HelloWorld abcd = new HelloWorld();

        // I want to have a random number so that I can add 1000 to it in this class
        Student student = new Student();
       int number =  student.hourCreator();

        System.out.println( number +1000);

    }

}
