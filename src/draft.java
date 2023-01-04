import java.util.Arrays;

public class draft {

    public static void main(String[] args) {




        String str = "i am happy";
        String newStr = "";


        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==' '){
                continue;
            }
            else if(!newStr.contains(""+str.charAt(i))){
                newStr+=str.charAt(i);
            }




        }
        System.out.println(newStr);

    }
}
