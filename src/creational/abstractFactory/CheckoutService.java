package creational.abstractFactory;

public class CheckoutService {
   private final PaymentGateway paymentGateway;
   private final Invoice invoice;
    public CheckoutService(RegionFactory factory, String gatewayType){
        this.paymentGateway = factory.createPaymentGateway(gatewayType);
        this.invoice = factory.createInvoice();
    }

    public void checkout(double amount){
        paymentGateway.processPayment(amount);
        invoice.generateInvoice();
    }
}
