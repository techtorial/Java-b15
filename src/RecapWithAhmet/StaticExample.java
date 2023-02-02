package RecapWithAhmet;

public class StaticExample {

  public static int money=10000;//private
  public int weight=210;

    public static void speak(){
        System.out.println("Ahmet is speaking");
    }

    public void run(){
        System.out.println("Ahmet is running");
    }
    public void withdrawmoney(){
        money-=200;
        System.out.println("Good Joob, you" +
                "are getting younger");
    }

    static {
//        //this will no-Matter what
//        //execute first
//        System.out.println("Hey I am a " +
//                "static block" +
//                "Please " +
//                "let me go first");
        System.out.println("WELCOME TO BANK OF AMERICA");
    }

    {
        //this will come after static block
        System.out.println("Hey I am a" +
                "instance block");
    }

}
