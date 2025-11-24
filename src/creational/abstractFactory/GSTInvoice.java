package creational.abstractFactory;

public class GSTInvoice implements Invoice{
    @Override
    public void generateInvoice(){
        System.out.println("Generating GST Invoice for India");
    }
}
