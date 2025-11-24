package creational.abstractFactory;

public class IndiaFactory implements RegionFactory {

    @Override
    public PaymentGateway createPaymentGateway(String gatewayType){
        switch (gatewayType.toLowerCase()){
            case "razorpay":
                return new RazorpayGateway();
            case "payu":
                return new PayUGateway();
            default:
                throw new IllegalArgumentException("Unsupported payment gateway in India: " + gatewayType);
        }
    }

    @Override
    public Invoice createInvoice(){
        return new GSTInvoice();
    }
}
