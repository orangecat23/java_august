package inheritance;

class Account {

    String acHolderName;
    double balance;

    void deposit(double amount) {

        balance += amount;
        System.out.println(" Deposited: " + amount + " New balance: " + balance);
    }

}

// derived class 1
class SavingsAccount extends Account {
    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println(" Interest added: " + interest + " New balance: " + balance);

    }
}

// derived class 2
class CurrentAccount extends Account {
    double overdraftLimit;

    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(" Withdrawn: " + amount + " New balance: " + balance);

        } else {
            System.out.println(" Withdrawal denied. Overdraft limit exceeded.");
        }
    }

}

public class Hierarchical {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();
        savings.acHolderName = "Alice";
        savings.balance = 1000;
        savings.interestRate = 5;
        savings.deposit(500);
        savings.applyInterest();

        CurrentAccount current = new CurrentAccount();
        current.acHolderName = "Bob";
        current.balance = 1000;
        current.overdraftLimit = 500;
        current.deposit(500);
        current.withdraw(2800);

    }
}
