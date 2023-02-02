package oop.inheritance1;

public class Animal {

    String color = "Orange";
    String name;
    int age;


    public void eat(){

        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(color + " is sleeping");
    }

    public void speak(){
        System.out.println("One");
    }

}
