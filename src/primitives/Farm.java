package primitives;

public class Farm {

    public static void main(String[] args) {
        /*
        in a farm there are 120 cows and 45 chickens
	        -calculate number of the legs of the animals in this farm
	        -show the result as "The total number of the legs in the farm is ..."
         */

        int cows = 120, chickens = 45, cowLegs = 4, chickenLegs = 2, total;

        total = (cows * cowLegs) + (chickens * chickenLegs);

        System.out.println("The total number of the legs in the farm is " + total);

        // if a single cow cost 1345.86 and a chicken costs 10.99
        // calculate total worth of animals and show the result as >> "The worth of the animals is ..."

        double eachCow$ = 1345.86, eachChicken$ = 10.99, worth;

        worth = cows * eachCow$ + chickens * eachChicken$;
        System.out.println(  "The worth of the animals is " + worth );

        // if you and your partner will share the cost, how much each person will get

        double share = worth /2;
        System.out.println(share);

    }

}
