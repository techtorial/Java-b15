package loops;

public class NestedLoopPractice3 {
    public static void main(String[] args) {
        /*
        print out months for the years of 2020,2021, 2022 in following format
        by using switch statements;
        print names of each month for first three fo them, next to it is number

        2020 --> 1-JAN, 2-FEB, 3-MARCH, ... 12-DEC
        2021 --> 1-JAN, 2-FEB, 3-MARCH, ... 12-DEC
        2022 --> 1-JAN, 2-FEB, 3-MARCH, ... 12-DEC
         */

        for (int year = 2020; year <= 2030; year++) {

            System.out.print(year + " --> ");

            for (int month = 1; month <= 12; month++) {

                switch (month){

                    case 1:  System.out.print(month + "-JAN ");
                        for (int day = 1; day <=30; day++) System.out.print(day +" * ");
                    break;
                    case 2:  System.out.print(month + "-FEB ");break;
                    case 3:  System.out.print(month + "-MARCH ");break;
                    case 4:  System.out.print(month + "-April ");break;
                    case 5:  System.out.print(month + "-May ");break;
                    case 6:  System.out.print(month + "-Jun ");break;
                    case 7:  System.out.print(month + "-JULY ");break;
                    case 8:  System.out.print(month + "-AUG ");break;
                    case 9:  System.out.print(month + "-SEPT ");break;
                    case 10:  System.out.print(month + "-OCT ");break;
                    case 11:  System.out.print(month + "-NOV ");break;
                    case 12:  System.out.print(month + "-DEC ");break;
                }

            }
            System.out.println();
        }

    }
}
