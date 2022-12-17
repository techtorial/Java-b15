package mentoring;

public class apa {
    public static void main(String[] args) {
        // A - B - C.. Z

        for(char letter = 'A'; letter <='Z' ; letter++ ){
            if(letter == 'Z'){
                System.out.print(letter);
            }else
            System.out.print(letter+ " - ");
        }
    }
}
