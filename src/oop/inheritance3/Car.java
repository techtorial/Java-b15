package oop.inheritance3;

public class Car extends Vehicle {

    String model;
    String enginType;

    public Car() {
        super("Camry", 2023, "Toyota");
    }


    @Override
    public void move(){
        System.out.println("car is moving");
        super.move();
    }

    @Override
    protected Vehicle accelerate(){
        System.out.println( "Car is accelerating" );

     //   return  (Car)(new Vehicle("",5,""));
        System.out.println(    super.model   );
        this.model = super.model;
        System.out.println( model );
        return  new Vehicle("----",5,"----");
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Y", 2023, "Tesla" );
        vehicle.move();
        Object i =   vehicle.accelerate();
        System.out.println( i );
        String str = vehicle.accelerate().toString();
        str = str.concat("***");
        System.out.println(str);
       Integer i1 = (Integer)vehicle.accelerate();
        System.out.println(   i1 * 5 );
        int i2 = (Integer)vehicle.accelerate();
        System.out.println(i2 + 10);
        System.out.println( "============");
        Car car = new Car();

        car.move();

        System.out.println( "============");
        car.accelerate();

      Vehicle v =   car.accelerate();
        System.out.println( v );

        System.out.println( v.model);
        System.out.println(v.year);
//
//       Car car1 = (Car) car.accelerate();
//        System.out.println( car1.year );
    }
}
