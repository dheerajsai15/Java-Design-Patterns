import creational.abstractFactory.CheckoutService;
import creational.abstractFactory.IndiaFactory;
import creational.abstractFactory.USFactory;
import creational.builder.BurgerMeal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //builder pattern
        BurgerMeal burgerMeal = new BurgerMeal.BurgerBuilder("wheat","Veg")
                .withCheese(true)
                .build();


        //abstract factory
        CheckoutService checkoutService = new CheckoutService(new IndiaFactory(),"razorpay");
        checkoutService.checkout(10000);
        CheckoutService checkoutService1 = new CheckoutService(new USFactory(),"stripe");
        checkoutService1.checkout(500);
    }
}