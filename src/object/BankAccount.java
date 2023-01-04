package object;

public class BankAccount {

    String accountHolderName, bankName, userName, password;
    boolean isLoggedIn;
    double balance;

    // create a method that will initialize instance fields
    public void signUp(String accountHolderName1, String userName1, String password1, double balance1) {
        accountHolderName = accountHolderName1;
        userName = userName1;
        password = password1;
        balance = balance1;
        System.out.println("SignUp process is done!");


    }


    public void displayInfo() {
        if (isLoggedIn) {
            System.out.println("AccountHolderName =" + accountHolderName
                    + "\n bankName = " + bankName + "\nIsLoggedIn = " + isLoggedIn + "\nBalance = " + balance);
        } else {
            System.out.println("should be logged in first to see info");
        }
    }

    public double deposit(double depositAmount) {
        if (isLoggedIn) {
            balance += depositAmount;
            System.out.println("Your balance after depositing " + depositAmount + " >> " + balance);
            return balance;
        }
        return balance;
    }

    public double withdraw(double withdrawalAmount) {

        balance -= withdrawalAmount;
        System.out.println("Your balance after withdrawing " + withdrawalAmount + " >> " + balance);
        return balance;
    }

    public void logIn(String user, String pass) {

        if (userName.equals(user) && password.equals(pass)) {
            System.out.println("You successfully logged in to the account");
            isLoggedIn = true;
            System.out.println("INFORMATION AFTER LOG IN");
            displayInfo();
        } else {
            isLoggedIn = false;
            System.out.println("Please check userName or Password");
        }

    }


}
