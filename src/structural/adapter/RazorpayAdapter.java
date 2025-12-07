package structural.adapter;

public class RazorpayAdapter implements PaymentGateway{
    private final RazorpayAPI razorpayAPI;

    public RazorpayAdapter(){
        razorpayAPI = new RazorpayAPI();
    }

    @Override
    public void pay(String orderId, double amount) {
        razorpayAPI.makePayment(orderId,amount);
    }
}
