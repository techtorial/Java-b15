package RecapWithAhmet;

public class StringBuilderPractice {

    /*
    POSSIBLE QUESTIONS:

     1-What is the difference between String and StringBuilder?

     They are both useful for my project  in terms Mutability and Immutability
       --> String is Immutable
       -->StringBuilder is Mutable
       -->StringBuilder has some different methods --> append,reverse...

     2-What is the difference between String Builder and String Buffer?

       -->String Buffer and HashTable are both synchronized
       -->Map,List,Set,String,StringBuilder are not synchronized

        NOTE:Mutable is all about the giving functions/actions/manipulations without
        "RE-ASSIGNING" the value
        NOTE2:Immutable is all about the giving functions/actions/manipulations with
        "RE-ASSIGNING" the value
        NOTE3:PassByValue and PassByReference is all about th way that you pass the data
         -->if you call the method and pass the value directly/initiliazing
         (Stringbuilderrecap.run("AHMET")  -->it means you are passing the value --> PASSBYVALUE

         -->if you call the method and pass the value with a reference
         String name="Ahmet"
         Stringbuilderrecap.run(name); -->PassBYREFERENCE

     */
    public static void main(String[] args) {

        //Immutability:
         String name="Ahmet";
         name=name.replace("m","*").concat("Loves").concat("Java  ").trim();
        System.out.println(name);
         //Mutability
         StringBuilder builder=new StringBuilder(name);
         builder.replace(2,3,"*").append("Loves").append("Java    ").trimToSize();
        System.out.println(builder);
        String reverse= String.valueOf(builder.reverse());
        String reverse2=builder.reverse().toString();
       System.out.println(reverse);
       // System.out.println(reverse);
       // System.out.println(builder.reverse());

        StringBuffer stringBuffer=new StringBuffer();

    }
}
