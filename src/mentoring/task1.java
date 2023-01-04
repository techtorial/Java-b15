package mentoring;

public class task1 {
    /*
    Reverse a given String and print it, if they have space in the
    beginning and at the end then remove it. Try doing with for
    loop or while loop
     */
    public static void main(String[] args) {
        String str = "Java";
        String reverseStr = "";

        for(int i = str.length()-1; i >= 0 ; i--){
        reverseStr = reverseStr+str.charAt(i);
        }
        System.out.println(reverseStr);

    }

}
