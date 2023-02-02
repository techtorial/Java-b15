package stringBuilder;

public class Practice2 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("January");

        Character ch = builder.charAt(0);

        System.out.println(ch);

        Integer i = builder.indexOf("y");
        System.out.println(i);

        String part = builder.substring(3);

        // put substring into a new StringBuilder object

        StringBuilder b2 = new StringBuilder(builder.substring(3));

        //  StringBuilder b3 = builder.substring(2); compile time error

        // replace() --> provide starting index, ending index and replacement value as text
        builder.replace(1, 4, "$$$");
        System.out.println(builder);

        builder = builder.replace(1, 4, "*********");
        System.out.println(builder);

        StringBuilder success = new StringBuilder("“Tech”");
        success.append("“torial”");
        StringBuilder truth = success.append("“ 2020”");
        truth = truth.append("“ Best”").append("“ Summer”");
        System.out.println(success);
        System.out.println(truth);
    }
}
