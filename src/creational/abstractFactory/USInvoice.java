package creational.abstractFactory;

public class USInvoice implements Invoice{
    @Override
    public void generateInvoice() {
        System.out.println("Generating Invoice for USA");
    }
}
