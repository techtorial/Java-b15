package mentoring;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        /*
        3. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
         If employee has been working more than 10 years, company will give 10% bonus.
        If Employee has more than 15 years, they will get 20% bonus.
        Ask user for their salary and year of service and print the net bonus amount.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many year have you been working in this company");
        int years = scanner.nextInt();
        double currentSalary = 0;
        if(years> 5 ){
            System.out.println("What is your current salary");
             currentSalary = scanner.nextDouble();

             if(years< 10){
                currentSalary += currentSalary *0.05;
                 System.out.println("You quality for 5% bonus. Your new salary is now " + currentSalary);

             } else if (years > 10 && years < 15) {
                 currentSalary += currentSalary*0.10;
                 System.out.println("You quality for 10% bonus. Your new salary is now " + currentSalary);
             }else{
                 currentSalary += currentSalary*0.20;
                 System.out.println("You quality for 20% bonus. Your new salary is now " + currentSalary);
             }

        }else{
            System.out.println("Sorry no bonus for you");
        }


        }
}
