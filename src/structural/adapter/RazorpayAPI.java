package structural.adapter;

public class RazorpayAPI {
    public void makePayment(String invoiceId, double amount){
        System.out.println("Paid "+ amount + " using razorpay for invoice: " + invoiceId);
    }
}
