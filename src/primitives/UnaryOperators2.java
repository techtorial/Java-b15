package primitives;

public class UnaryOperators2 {
    public static void main(String[] args) {

        double d = 8.7;
        d++;
        System.out.println(d);

        int a = 5;
        int b = a + 1;
        System.out.println(a);
        System.out.println(b);
        int c = a + ++b;

        System.out.println(b);
        // c = ? 7, 8, 12,10, 11, 13
        System.out.println("c is >> " + c);

        c = ++c + --a - 2;
        System.out.println("C is now " + c); //13, 9, 11, 16, 7, 10, 6, 15, 17

        int e = c + 10;
        System.out.println(e);


        int k = 8, t = ++k, m = k + t, x = ++m;

        System.out.println(--x - --k);

        //=========== deal on DD ========

        /*
        get one dozen of donuts for $15 you get one dollar discount on your next purchase
        show your next purchase payment amount
         */
        int payment = 15;

        System.out.println(payment--); // today $15(shows 15, value 14)
        System.out.println("Next Payment "+ payment);
 /*
        get one dozen of donuts for $15 you get one dollar discount on your payment now
        show your payment
         */
        int payment1  = 15;

        System.out.println( --payment1 + "$ payment now with applied discount");

    }
}
