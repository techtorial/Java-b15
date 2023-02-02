package encapsulation;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        coffee.setSize(8);

        System.out.println(  coffee . getSize());

        System.out.println(   coffee . getFlavor()  ); // null
    }
}
