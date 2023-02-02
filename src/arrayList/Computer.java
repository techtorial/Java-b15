package arrayList;

public class Computer {

    String brand;
    double price;
    String color;
    double screenSize;

    public Computer(String brand,
                    double price,
                    String color,
                    double screenSize) {
        this.brand =brand;
        this.price = price;
        this.screenSize = screenSize;
        this.color = color;

    }

    public String toString(){

        return "Computer{"+brand+" - "+
                price+" - "+ color +" - "+ screenSize +"}";
    }
}
