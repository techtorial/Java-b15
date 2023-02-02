package stringBuilder;

public class Practice4 {

    //create a method that will take StringBuilder object
    // and this method will delete '*' from given parameter

    // "t*he i*nt*ervi*ew *is *coming*"

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("t*****he ***i*nt*ervi*ew *is *coming*");
        deleteStars(builder);

        StringBuilder[] array  = { new StringBuilder("code"), new StringBuilder("fish"), new StringBuilder("interview") };

        replaceIs( array );
    }
    static public void deleteStars(StringBuilder builder) {

        for (int i = 0; i < builder.length(); i++) {

            if (builder.charAt(i) == '*') {
                builder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println( builder );
    }
    // {"code", "fish", "mock", "interview",  "is", "coming", "soon"}
    // replace every char 'i'  with '-' from given StringBuilder array of Strings
    // solve it by creating a method and pass the array as a parameter
    public static void replaceIs(StringBuilder[] builder){

        for (  StringBuilder str  :   builder){
            for (  int i = 0; i< str.length(); i++  ){

                if ( str.charAt(i) == 'i'){


                    // replace() --> provide starting index, ending index and replacement value as text
                     //  builder.replace(1, 2, "$$$");

                      //str.replace( str.indexOf(""+ str.charAt(i) ), str.indexOf(""+ str.charAt(i) )+1, "-"   );
                    str.replace( i, i+1, "-"   );
                }
            }
            System.out.println(str);
        }

    }
}
