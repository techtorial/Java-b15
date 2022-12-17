package primitives;

public class ComparisonOperators2 {

    public static void main(String[] args) {

        // there is an event, person is 18 years old or older, s/he can attend the event

        int ageOfPerson = 20;
        int requiredAge = 18;

        boolean canAttend = ageOfPerson >= requiredAge;
        System.out.println(!canAttend); // true

        boolean canAttend1 = requiredAge <= ageOfPerson;
        System.out.println(canAttend1);

        // kids, if the age of child is 12 or less, that child can go tot the event

        int kidAge = 9, requiredKidAge= 12;
        boolean kidCanGo = kidAge <=requiredKidAge;

        System.out.println("Can the kid attend? "+ kidCanGo);

        // if the age of child is 10, they can not participate

        int childAge = 10, requiredChildAge = 10;

        boolean canChildNotAttend = childAge == requiredChildAge;
        System.out.println("This  >> "+ canChildNotAttend);

        System.out.println( childAge != requiredChildAge );



    }
}
