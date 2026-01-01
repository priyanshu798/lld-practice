package parkingLot.paymentStrategy;

public class CreditCardPayment implements PaymentStrategy{

    String creditCardNumber;
    CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $ " + amount + " with card no: " + creditCardNumber);

    }
}
