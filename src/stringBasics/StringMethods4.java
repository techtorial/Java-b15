package stringBasics;

public class StringMethods4 {

    public static void main(String[] args) {

        String season = "Winter";
        //               012345
        //substring(); --> returns String

        String part = season.substring(1);

        System.out.println(part);

        String part2 = season.substring(1, 4);

        System.out.println(part2);

        //  System.out.println(  season.substring( 9)); //StringIndexOutOfBoundsException

        String task = "Welcome to Chicago";
        // take and print out the word 'do' only from above string

        System.out.println(task.substring(5, 7));

        // make above task solution dynamic

        int firstSpaceIndex = task.indexOf(' ');

        int secondSpaceIndex = task.indexOf(' ', firstSpaceIndex + 1);

        String secondWordFromSentence = task.substring(firstSpaceIndex + 1, secondSpaceIndex);
        System.out.println(secondWordFromSentence);

        System.out.println("-------------------------");

        System.out.println(task.substring(task.indexOf(' ') + 1, task.indexOf(' ', firstSpaceIndex + 1)));
    }
}
