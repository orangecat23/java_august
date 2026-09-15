package multin;

interface AccountOperations {
    void deposit(double amount);
}

interface LoanOperations {
    void applyLoan(double amount);
}

class SmartAccount implements AccountOperations, LoanOperations {

    double balance;
    String accountHolderName;

    public SmartAccount(double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void applyLoan(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Loan applied: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Loan amount must be positive.");
        }
    }
}

public class MultiIn {
    public static void main(String[] args) {

        SmartAccount account = new SmartAccount(5000, "Tanaya");

        account.deposit(2000);

        account.applyLoan(10000);
    }
}
