package oop.finalPractice;

final public class T_Shirt extends Shirt {

    public T_Shirt(String color, String size) {
        // super("afd","sf");
        super(color, size);
    }

    public T_Shirt() {
        this("abcd", "asdf");
    }

    public void sale() {
        System.out.println("T-shirt SALE");
    }


    // final method from parent cannot be overridden
//    public void dye(){
//        System.out.println("*****");
//    }

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.dye();
        shirt.dye("RED");

        Shirt shirt1 = new Shirt();
        Shirt shirt2 = new Shirt();
        Shirt shirt3 = new Shirt();

        shirt1 = null;
        shirt2 = null;

        System.gc();

        System.out.println(shirt1);
    }
}
