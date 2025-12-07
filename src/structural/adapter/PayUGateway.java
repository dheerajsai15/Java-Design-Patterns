package structural.adapter;

public class PayUGateway implements PaymentGateway{
    @Override
    public void pay(String orderId, double amount){
        System.out.println("Paid " + amount + " using payU for order: " + orderId);
    }
}
