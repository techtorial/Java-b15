package loops;

public class ReversingString {

    public static void main(String[] args) {

        // check if given string is palindrome or not
        // EFE, YAY, Tuesday, WOW, civic, level, anna, ...

        String str = "Tuesday"; // yadseuT
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);

        }
        if (str.equals(reversed)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }
}
