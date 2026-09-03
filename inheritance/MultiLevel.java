package inheritance;

//base class
class Account {

    String acHolderName;
    double balance;

    void deposit(double amount) {

        balance += amount;
        System.out.println(" Deposited: " + amount + " New balance: " + balance);
    }

}

// derived class using extends keyword (extends parent class name)
class SavingsAccount extends Account {
    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println(" Interest added: " + interest + " New balance: " + balance);

    }
}

class PremiumSavingsAccount extends SavingsAccount {
    // double interestRate;

    void applyExtraInterest() {
        double interest = (balance * interestRate + 2 / 100);
        balance += interest;
        System.out.println(" Interest added: " + interest + " New balance: " + balance);

    }
}

public class MultiLevel {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.acHolderName = "John Doe";
        savingsAccount.balance = 1000.0;
        savingsAccount.interestRate = 5.0;
        savingsAccount.deposit(500.0);
        savingsAccount.applyInterest();

        PremiumSavingsAccount premiumSavingsAccount = new PremiumSavingsAccount();
        premiumSavingsAccount.acHolderName = "Tanaya Ramgir";
        premiumSavingsAccount.balance = 10000;
        premiumSavingsAccount.interestRate = 5;
        premiumSavingsAccount.deposit(1000);
        premiumSavingsAccount.applyExtraInterest();

    }
}
