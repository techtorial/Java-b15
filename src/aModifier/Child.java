package aModifier;

public class Child extends Animal{

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.ageProtected = 8;
        animal.namePublic = "Jerry2";
        animal.colorDefault = "Red";


        Child child = new Child();
        child.ageProtected = 3;
        child.colorDefault = "Red/White";
        child.namePublic = "Jr Jerry";



    }
}
