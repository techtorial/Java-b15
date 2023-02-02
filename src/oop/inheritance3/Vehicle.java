package oop.inheritance3;

public class Vehicle {

    protected String model;
     int year;
    public String brand;

    /*
        move(); --> vehicle is moving
    stop(); --> return true, vehicle is stopping
    protected start(); --> return true, vehicle is starting
    default accelerate(); --> return <OneOfObject-Vehicle_Car>
     */
    public void move(){
        System.out.println("Vehicle is moving");
    }
    public boolean stop(){
        System.out.println("vehicle is stopping");
        return true;
    }

    protected boolean start(){
        System.out.println("vehicle is starting");
        return true;
    }

    Object accelerate(){
        System.out.println("Vehicle accelerate");
        return 3;
    }

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }
}
