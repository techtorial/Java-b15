package object;

public class Dog {

    // instance variables define object

    static String name;
    int age;
    String breed = "husky";

    static int food = 20;

    public String speak(int numberOfWords) {
        System.out.println("The dog is speaking " + numberOfWords + " words");
        setAge(numberOfWords);
        return "Here are the words " + numberOfWords;

    }

    public void play() {

        System.out.println("Dog is playing");
        food -= 1;
    }

    public void feed(String foodType, int foodAmount) {
        setAge(1);
        // if the food type is x cost for each pound is .50
        // if the food type is y, cost for each pound is .10
        if (foodType.equalsIgnoreCase("x")) {
            double number = .50 * foodAmount;
        } else {
            double number = .10 * foodAmount;
        }
        System.out.println("Do is getting food");
    }

    public void setAge(int age1) {
        age = age1;
        bath();
    }

    public static void bath() {

        System.out.println("Getting clean");

    }

    public static void main(String[] args) {
        bath();

        Dog dog1 = new Dog();
        dog1.name = "sharik";

        System.out.println(dog1.breed);

        System.out.println(dog1.age);
        dog1.setAge(1);

        System.out.println(dog1.age);

        Dog dog2 = new Dog();
        System.out.println(dog2.age);

        String str = dog2.speak(7);

        System.out.println(dog2.age); //

        System.out.println(str); //

        System.out.println(dog1.food); //20
        dog1.play();
        dog1.play();
        System.out.println(dog1.food); // 18

        System.out.println(dog2.food);
        dog2.play();
        dog2.play();
        dog2.play();
        dog2.play();
        dog2.play();
        System.out.println(dog2.food);

        System.out.println(" dog 1 name >> " + dog1.name);
        System.out.println("dog 2 name >> " + dog2.name);

        dog2.name = "King";
        System.out.println("dog 2 name >> " + dog2.name);
        System.out.println(" dog 1 name >> " + dog1.name);

        bath();
    }


}
