package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice5 {

    //String[] words =  {"code", "fish", "mock", "interview",  "is", "coming", "soon"};

    // return as  List  [ "edoc" "hsif" ...]

   static public List<String> reverseEveryWord(String[] array){
        List<String> list  = new ArrayList<>();
        for ( String str  : array   ){
            String reversed = "";
            for (   int i = str.length()-1; i >=0; i--){

                reversed += str.charAt(i);
            }
            list.add(reversed);
        }
        System.out.println( list);

        return list;
    }

    public static void main(String[] args) {
        String[] words =  {"code", "fish", "mock", "interview",  "is", "coming", "soon"};
        reverseEveryWord( words);
    }

}
