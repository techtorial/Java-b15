package oop.inheritance2;

public class Test {

    public static void main(String[] args) {

        Flower flower = new Flower("WHITE");
      //  flower.color = "WHITE";
        Rose rose = new Rose();

        System.out.println( flower.color  );

        System.out.println(  rose.color );

        Rose rose1 = new Rose("Yellow", "Small", 3.99);

        System.out.println( rose1.color );

        flower.run(3);
        rose1.run(6);
    }
}
