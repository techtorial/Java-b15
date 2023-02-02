package object;

public class Bottle {

    public double size;
   public boolean isClean;
    public double liquidAmount;
        /*   -x- create one argument constructor to initialize isClean variable
        -x- create one argument constructor to initialize size
        -- create one usage method which takes double amount as parameter, it updates the liquidAmount
     */

    public Bottle(boolean isClean) {

        this.isClean = isClean;
        System.out.println("+++++");
    }

    public Bottle(double size) {
        this(true);
        this.size = size;
        System.out.println("--------");
    }

    public void usage(double amount) {

        liquidAmount -= amount;
    }

    public String toString(){
        return "Size: "+size +
                " isClean: "+isClean+" liquidAmount: "+liquidAmount;

    }

}
