package primitives;

public class LogicalOperatorsTask {
    public static void main(String[] args) {
        /*
		you need to have average of 60 to pass a class
			-when you get 3 tests
			-our range for test scores is 0 to 100
		AND
		you need to have 90 percent attendance
         */
        int test1 = 50, test2 = 100, test3 = 80, average, requiredAverageScore = 60, requiredAttendance = 90, myAttendance = 89;

        average = (test1 + test2 + test3) / 3;

        boolean result = average >= requiredAverageScore && myAttendance >= requiredAttendance;

        System.out.println(result);

    }
}
