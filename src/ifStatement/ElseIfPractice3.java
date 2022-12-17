package ifStatement;

public class ElseIfPractice3 {
    public static void main(String[] args) {
        /*
    there are 3 test for a class
	-to get letter score for averages
	-use the following scale

	90- 100 --> A
	80- 89 -->  B
	70- 79  --> C
	60- 69  --> D
	less than 60 --> please come again
         */
        int t1 = 100, t2 = 100, t3 = 100, average = 0;

        average = (t1 + t2 + t3) / 3;

        if (average >= 90 ) {
            System.out.println("A");
        } else if (average >= 80 && average < 90) {
            System.out.println("B");

        } else if (average >=70 && average < 80) {
            System.out.println("C");
        } else if (average >=60 && average <= 69) {
            System.out.println("D");
        }else {
            System.out.println("Please come Again!");
        }


    }
}
