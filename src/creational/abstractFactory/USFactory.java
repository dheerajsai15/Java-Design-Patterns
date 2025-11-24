package creational.abstractFactory;

public class USFactory implements RegionFactory{
    @Override
    public PaymentGateway createPaymentGateway(String gatewayType) {
        switch (gatewayType.toLowerCase()){
            case "stripe":
                return new StripeGateway();
            case "paypal":
                return new PayPalGateway();
            default:
                throw new IllegalArgumentException("Unsupported payment gateway in USA: " + gatewayType);
        }
    }

    @Override
    public Invoice createInvoice() {
        return new USInvoice();
    }
}
