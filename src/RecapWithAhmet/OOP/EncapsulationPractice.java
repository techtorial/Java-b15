package RecapWithAhmet.OOP;

public class EncapsulationPractice {

    private String name="Ahmet";
    private int age=31;
    private long creditCard=1234425454;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.startsWith("A")){
            this.name = name;
        }else{
            System.out.println("I am the boss");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<99){
            this.age = age;
        }else{
            System.out.println("Age is not in correct range");
        }

    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

}
