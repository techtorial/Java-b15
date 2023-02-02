package object;

public class TestBottle {
    public static void main(String[] args) {
        Bottle b1 = new Bottle(8);
        System.out.println(b1.liquidAmount);
        b1.usage(4);
        System.out.println(b1.liquidAmount);

        // create a method that will take bottle object as a parameter
        // this method will find out if the bottle's size is greater than 8 oz or not
        // if it is greater than 8, should print "it is a LARGE bottle"

       sizeChecker(b1);
       Bottle b2 = new Bottle(16);
       sizeChecker(b2);

        System.out.println(   b2   ); // hashcode --> location of the object
        System.out.println(   b2  );
    }

    public static void sizeChecker(Bottle bottle) {
        if (bottle.size > 8) {
            System.out.println("it is a LARGE bottle");
        } else {
            System.out.println("it is a SMALL bottle");
        }

    }
}
