package primitives;

public class LogicalOperators1 {
    public static void main(String[] args) {

        // travel --> passport, ticket

        boolean passport = false;
        boolean ticket = true;

        boolean travel = passport && ticket;

        System.out.println("Can travel? " + travel);

        // party --> dressCode and age
        boolean dressCode = true, age = true, canAttendParty;

        canAttendParty = dressCode && age;
        System.out.println("Can attend party? " + canAttendParty);

        // there is an event for kids, they allow if the age of child is between 12 and 16

        int kidAge = 12;
        int lowerLimit = 12, upperLimit = 16;

        boolean happyToPlay = kidAge > lowerLimit && kidAge < upperLimit;

        System.out.println(happyToPlay);

        // parents want to come together for a family dinner,
        // but kids who are age of 12(inclusive) to 18(inclusive) do not want to go with them
        // adults and younger kids are together
        // 5 years old with parent or not?

        int age1 = 12, limit1 = 12, limit2 = 18;

        boolean withAdult = (age1 <= limit1) || (age1 >= limit2);

        System.out.println("with Adult " + withAdult);

        // || OR
        // cash      card

        boolean cash = false, card = true, buy;

        buy = cash || card;
        System.out.println("buy >> " + buy);

        // travel >> a type of ID (passport / government id), visa, ticket, need to have money (more than $5000)

        boolean passport1 = false, govID = true, visa1 = true, ticket1 = true;
        double myMoney = 5002, moneyLimit = 5000;

//        boolean result1 = passport1 || govID;
//        boolean resultMoney = myMoney > moneyLimit;
//
//        boolean result2 = result1 && visa1 && ticket1 && resultMoney;

        boolean fly = (passport1 || govID) && visa1 && ticket1 && (myMoney > moneyLimit);

        System.out.println(fly);


        System.out.println( true || false && false  );

        System.out.println( true && false || false  );

        System.out.println( (true || false ) && false  );

        System.out.println( 'B'+ 2 == 3*'C' || !true && 'C' < 'B'/3  );



    }
}
