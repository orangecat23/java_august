package multithreading;

class Customer {
    int balance = 5000;

    // creating a withdraw() method which calls the wait() method
    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw..." + amount);

        if (this.balance < amount) {
            System.out.println("Less balance; waiting for deposit..." + amount);
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.balance -= amount;
        System.out.println("withdraw completed..." + amount);
    }

    // creating a deposit() method which calls the notify() method
    synchronized void deposit(int amount) {
        System.out.println("going to deposit..." + amount);
        this.balance += amount;
        System.out.println("deposit completed... " + amount);
        notify();
    }
}

public class InterThreadComEx {

    public static void main(String args[]) {
        final Customer c = new Customer();

        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}