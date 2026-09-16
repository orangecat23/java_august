package encap;

class BankAccount {

    private double balance;
    private String accountHolderName;

    public BankAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // Setter methods
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter methods
    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
    }
}

public class EncapsulationEx {

    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount(5000, "Tanaya");

        System.out.println("Account Holder: " + ac1.getAccountHolderName());
        System.out.println("Account Balance: " + ac1.getBalance());

        ac1.deposit(2000);

        ac1.withdraw(1000);

        ac1.setBalance(10000);
        System.out.println("Updated Balance: " + ac1.getBalance());

        ac1.setBalance(-5000);
    }
}