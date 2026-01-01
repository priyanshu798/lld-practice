package parkingLot.paymentStrategy;

public class CashPayment implements PaymentStrategy{

    CashPayment(double fee) {
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $ " + amount);
    }
}
