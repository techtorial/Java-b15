package primitives;

public class RemainderPractice3 {
    public static void main(String[] args) {

        int numberOfCars = 10;

        int numberOfPartners = 3;


        // how many car each person will get?
        int eachPerson = numberOfCars / numberOfPartners;
        System.out.println(eachPerson); // 3

        // how many car/s will be left over?
        int leftOverCars = numberOfCars % numberOfPartners;
        System.out.println(leftOverCars);

        /*
        Tv, 465 dollars --> each month paying --> 50 --> find last month's payment
         */
        int tv$ = 465;
        int eachMonth$ = 50;

        int leftOver$ = tv$ % eachMonth$;
        System.out.println(leftOver$);

        System.out.println( tv$ / eachMonth$  );
    //==========================
        double tv2$ = 465.50;
        double eachMonth2$ = 15;

        System.out.println(  tv2$ % eachMonth2$  );
    }
}
