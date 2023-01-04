package object;

public class TestFlower {

    public static void main(String[] args) {

        Flower f1 = new Flower();

        System.out.println(f1.type);
       f1.type= "Tulip";
        System.out.println(f1.type);

        Flower f2 = new Flower("Daisy");
        System.out.println( f2.type);

        Flower f3 = new Flower("Rose", "red");

        System.out.println(f3.color);
        System.out.println(f1.color);//null
        System.out.println(f1.price);//0.0
        System.out.println(f3.price); //0.0

        f2.sell();
        f3.sell();

        String str = new String();

        String str1 = new String("abcd");



    }
}
