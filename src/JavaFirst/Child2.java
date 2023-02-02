package JavaFirst;

import aModifier.Animal;

public class Child2 extends Animal {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.namePublic = "Jerry";
        animal.eatPublic();


        Child2 child2 = new Child2();
        child2.ageProtected = 2;
        child2.namePublic = "Jr Jerry2";

       double d =  child2.eatPublic();


    }
}
