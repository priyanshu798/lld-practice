package designPatterns.strategy;

public class UpiPayment implements PaymentStrategy{

    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying amount " + amount + "with upi id " + upiId);
    }
}
