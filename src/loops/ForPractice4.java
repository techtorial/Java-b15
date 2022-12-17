package loops;

public class ForPractice4 {
    public static void main(String[] args) {
        // print out alphabet as uppercase letters
        // A, B, C ,,,,,,, Z

        for ( char ch = 'A'   ; ch <= 'Z'    ; ch++ ){

            if (ch == 'Z'){
                System.out.println(ch);
            }else {
                System.out.print(ch + "*");
            }

        }

        System.out.println("+++++++++++++");
        for ( char ch = 'a'   ; ch <= 'z'    ; ch++ ){

            if (ch == 'z'){
                System.out.println(ch);
            }else {
                System.out.print(ch + "*");
            }

        }

        System.out.println("+++++++++++++");
        // print out digits by separating them with $ (0  to 9)

        for ( char ch = '0'   ; ch <= '9'    ; ch++ ){

            if (ch == '9'){
                System.out.println(ch);
            }else {
                System.out.print(ch + "-$$$-");
            }

        }

    }
}
