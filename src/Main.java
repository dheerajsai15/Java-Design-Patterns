import creational.abstractFactory.CheckoutService;
import creational.abstractFactory.IndiaFactory;
import creational.abstractFactory.USFactory;
import creational.builder.BurgerMeal;
import creational.prototype.EmailTemplate;
import creational.prototype.EmailTemplateRegistry;
import creational.prototype.WelcomeEmail;

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


        //Prototype
        EmailTemplate welcomeEmail = EmailTemplateRegistry.getTemplate("welcome");
        welcomeEmail.setContent("Type-1");
        EmailTemplate welcomeEmail1 = EmailTemplateRegistry.getTemplate("welcome");
        welcomeEmail1.setContent("Type-2");
        welcomeEmail.send("Dheeraj");
        welcomeEmail1.send("Dheeraj");
    }
}