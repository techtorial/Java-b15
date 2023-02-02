package oop.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.deposit();
        atm.checkInfo();
        atm.withdraw();

        System.out.println("---------");
        Branch branch = new Branch();
        branch.deposit();
        branch.loan();
        branch.creditCard();

        System.out.println("---------");
        Bank bank = new Bank();
        bank.deposit();
        bank.openBranch();
        bank.loan();
        bank.creditCard();
        System.out.println("---------");

        ATM atm1 = new Branch();

        ((Branch)atm1).loan();

        List list  = new ArrayList<>();

        Money money = new ATM();
        Money money1 = new Branch();
        Money money2 = new Bank();

        String str = "Test";
        System.out.println( str.charAt(10));
        money.deposit();

        money1.loan();

        ((Bank)money2).openBranch();
    }
}
