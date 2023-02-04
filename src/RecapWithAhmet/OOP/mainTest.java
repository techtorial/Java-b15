package RecapWithAhmet.OOP;

public class mainTest extends AbstractPractice1{

    public static void main(String[] args) {
//     AbstractPractice1 abstractPractice1=new AbstractPractice1();
//     abstractPractice1.name="Ahmet"; //you cannot create an object
        //from Abstract class
      //  AbstractPractice1.run();
        AbstractPractice1.name="Ahmet";
        AbstractPractice1.getName();
    }

    @Override
    public void dismiss() {
        System.out.println("Ahmet's class will be dismissed at 1:05 pm");
    }

    @Override
    public void speak() {
        System.out.println("Ahmet is speaking");
    }
}
