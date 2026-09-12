package interfaces;

import java.util.Scanner;

// Payment interface

interface Payment {

    void processPayment(double amount);

    void generateReceipt();
}

// Credit Card Payment Implementation

class CreditCardPayment implements Payment {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of Rs: "
                + amount + " using card number: " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Payment Receipt Generated.");
    }
}

// UPI Payment Implementation

class UpiPayment implements Payment {

    private final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs: "
                + amount + " using UPI ID: " + upiId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI Payment Receipt Generated.");
    }
}

// Net Banking Payment Implementation

class NetBankingPayment implements Payment {

    private final String userId;

    public NetBankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Net Banking Payment of Rs: "
                + amount + " for User ID: " + userId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Net Banking Payment Receipt Generated.");
    }
}

// Service class

class PaymentService {

    private final Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.processPayment(amount);
        payment.generateReceipt();
    }
}

// Main class

public class InterfacePaymentExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        // Consume leftover newline
        scanner.nextLine();

        Payment payment;

        switch (choice) {

            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = scanner.nextLine();
                payment = new CreditCardPayment(cardNumber);
                break;

            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.nextLine();
                payment = new UpiPayment(upiId);
                break;

            case 3:
                System.out.print("Enter Net Banking User ID: ");
                String userId = scanner.nextLine();
                payment = new NetBankingPayment(userId);
                break;

            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        PaymentService service = new PaymentService(payment);

        service.executePayment(amount);

        scanner.close();
    }
}