package oop.polymorphism;

public class ATM implements Money{


    public void withdraw(){
        System.out.println("Withdraw fom ATM");
    }
    public void deposit(){
        System.out.println("Deposit at ATM");
    }
    public void checkInfo(){
        System.out.println("Info at ATM");
    }
  public  void loan(){
        System.out.println("ATM LOANS");
    }

}
