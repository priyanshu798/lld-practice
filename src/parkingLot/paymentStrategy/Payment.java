package parkingLot.paymentStrategy;

public class Payment {
    private double amount;
    private PaymentStrategy paymentStrategy;


    public Payment(PaymentStrategy paymentStrategy, double amount) {
        this.paymentStrategy = paymentStrategy;
        this.amount = amount;
    }

    public void processPayment() {
        if (amount > 0) {
            paymentStrategy.processPayment(amount);
        }
        else {
            System.out.println("Invalid amount");
        }
    }
}
