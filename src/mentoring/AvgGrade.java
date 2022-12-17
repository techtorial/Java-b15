package mentoring;

import java.util.Scanner;

public class AvgGrade {
    public static void main(String[] args) {
        /*
        Test Average problem:
    As long as there are more grades, add them to the total
    Divide the total by the number of courses (each grade is a course)
    Print the corresponding letter grade
    Stop when the user enters a negative grade
    input:
    100
    98
    65
    80
    -80
    Output:
    85.75
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grade");
        double grade = scanner.nextDouble();
        int numberOFEnteredGrades = 0;
        double sum = 0;
        double avgNumber= 0;

        while(grade> 0 ){
            numberOFEnteredGrades++;
            sum += grade;
            System.out.println("Please enter your garde");
            grade = scanner.nextDouble();
        }

        avgNumber = sum/numberOFEnteredGrades;
        System.out.println(avgNumber+ " is the average");

        /// 100 + 98+ 65 + 80
        // 343/ 4
    }
}
