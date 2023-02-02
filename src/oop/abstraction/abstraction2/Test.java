package oop.abstraction.abstraction2;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        // you cannot create an object from interface
        //  CanSwim canSwim = new CanSwim();

        Bird bird = new Bird();
        bird.eat();

        System.out.println(bird.TAIL);
        System.out.println(CanFly.WING);

        Dolphin dolphin = new Dolphin();
        dolphin.swim(3);
        System.out.println(dolphin.FIN);
        System.out.println(CanSwim.FIN);

        // is there any other way that I can still create a Dolphin object

        CanSwim dolphin2 = new Dolphin();
        dolphin2.swim(4);

        Duck duck = new Duck();
        duck.fly();
        duck.landing(50);
        duck.swim(50);

        // is there any other way that I can still create a DUCK object

        CanFly duck1 = new Duck();

        CanSwim duck2 = new Duck();

        duck1.fly();

        duck2.swim(7);

        System.out.println("=========");
        Duck duck3 = new Duck();

        duck3.run();

        duck3.printInfo();



    }
}
