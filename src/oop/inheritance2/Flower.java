package oop.inheritance2;

public class Flower {

    String color;
    String size;
    double price;



    public Flower( String color){

        this.color = color;
    }

    public Flower(String color, String size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public Number run(int miles){

        System.out.println("Flower is running to the Spring");

        return  miles * 100;
    }
}
