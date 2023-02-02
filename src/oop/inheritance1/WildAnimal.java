package oop.inheritance1;

public class WildAnimal extends Animal {

    String color = "Yellow";

    public void sleep(){

        System.out.println(color+ " is sleeping");

    }

    @Override
    public void speak(){
        System.out.println("I can have Two Language");
    }

}
