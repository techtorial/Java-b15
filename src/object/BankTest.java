package object;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.displayInfo();
        account.deposit(100000);

        account.withdraw( 500);

        account.userName = "java";
        account.password = "123";
        account.logIn("java", "123");

        account.signUp("nick","efe", "321",200);
        account.displayInfo();

        BankAccount java1 = new BankAccount();

        System.out.println(  java1.isLoggedIn  );

        java1.displayInfo();
        java1.signUp("Dima", "flower", "white" ,555);
        java1.logIn("flower", "white");
        java1.displayInfo();

    }
}
