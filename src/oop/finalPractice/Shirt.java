package oop.finalPractice;

public class Shirt {


    final double PRICE = 11.99;
    String color;
    String size;

    public Shirt() {
    }

    public Shirt(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public void sale() {
        System.out.println("Sale");
    }

    final public void dye(){
        System.out.println("Changing  color of SHIRT");
    }
    final  public void dye(final String color){
        System.out.println("Changing  color of SHIRT to "+ color);

    }

    @Override
    protected void finalize()  {
        System.out.println("*******");
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "PRICE=" + PRICE +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
