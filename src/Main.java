import creational.abstractFactory.IndiaFactory;
import creational.abstractFactory.USFactory;
import creational.builder.BurgerMeal;
import creational.prototype.EmailTemplate;
import creational.prototype.EmailTemplateRegistry;
import creational.prototype.WelcomeEmail;
import structural.adapter.CheckoutService;
import structural.adapter.PayUGateway;
import structural.adapter.RazorpayAdapter;
import structural.bridge.*;
import structural.composite.CartItem;
import structural.composite.Product;
import structural.composite.ProductBundle;
import structural.decorator.*;
import structural.flyweight.Forest;
import structural.proxy.CachedVideoDownloader;
import structural.proxy.VideoDownloader;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //builder pattern
//        BurgerMeal burgerMeal = new BurgerMeal.BurgerBuilder("wheat","Veg")
//                .withCheese(true)
//                .build();


        //abstract factory
//        CheckoutService checkoutService = new CheckoutService(new IndiaFactory(),"razorpay");
//        checkoutService.checkout(10000);
//        CheckoutService checkoutService1 = new CheckoutService(new USFactory(),"stripe");
//        checkoutService1.checkout(500);


        //Prototype
//        EmailTemplate welcomeEmail = EmailTemplateRegistry.getTemplate("welcome");
//        welcomeEmail.setContent("Type-1");
//        EmailTemplate welcomeEmail1 = EmailTemplateRegistry.getTemplate("welcome");
//        welcomeEmail1.setContent("Type-2");
//        welcomeEmail.send("Dheeraj");
//        welcomeEmail1.send("Dheeraj");


        // Adapter
//        CheckoutService checkoutService = new CheckoutService(new PayUGateway());
//        checkoutService.checkout("12",1200);
//        CheckoutService checkoutService1 = new CheckoutService(new RazorpayAdapter());
//        checkoutService1.checkout("12",1200);

        // Decorator
//        Pizza margheritaCheesePizza = new ExtraCheese(new PlainPizza());
//        Pizza oliveCheese = new Olives(margheritaCheesePizza);
//        System.out.println(oliveCheese.getDescription());

        //Composite
        // Individual Products
//        CartItem book = new Product("Atomic Habits", 499);
//        CartItem phone = new Product("iPhone 15", 79999);
//        CartItem earbuds = new Product("AirPods", 15999);
//        CartItem charger = new Product("20W Charger", 1999);
//
//        // Combo Deal
//        ProductBundle iphoneCombo = new ProductBundle("iPhone Essentials Combo");
//        iphoneCombo.addProduct(phone);
//        iphoneCombo.addProduct(earbuds);
//        iphoneCombo.addProduct(charger);
//
//        // Back to School Kit
//        ProductBundle schoolKit = new ProductBundle("Back to School Kit");
//        schoolKit.addProduct(new Product("Notebook Pack", 249));
//        schoolKit.addProduct(new Product("Pen Set", 99));
//        schoolKit.addProduct(new Product("Highlighter", 149));
//
//        // Add everything to cart
//        List<CartItem> cart = new ArrayList<>();
//        cart.add(book);
//        cart.add(iphoneCombo);
//        cart.add(schoolKit);
//
//        // Display cart
//        System.out.println("Your Amazon Cart:");
//        double total = 0;
//        for (CartItem item : cart) {
//            item.display("  ");
//            total += item.getPrice();
//        }
//
//        System.out.println("\nTotal: ₹" + total);


        // Proxy Pattern
//        VideoDownloader cacheVideoDownloader = new CachedVideoDownloader();
//        System.out.println("User 1 tries to download the video.");
//        cacheVideoDownloader.downloadVideo("https://video.com/proxy-pattern");
//
//        System.out.println();
//
//        System.out.println("User 2 tries to download the same video again.");
//        cacheVideoDownloader.downloadVideo("https://video.com/proxy-pattern");

        // Bridge Pattern
//        VideoPlayer player1 = new WebPlayer(new HDQuality());
//        player1.play("bridge-pattern");
//
//        VideoPlayer player2 = new MobilePlayer(new UltraHDQuality());
//        player2.play("bridge-pattern");

        // Flyweight Pattern
        Forest forest = new Forest();
        // Planting 1 million trees
        for(int i = 0; i < 1000000; i++) {
            forest.plantTree(i, i, "Oak", "Green", "Rough");
        }
        System.out.println("Planted 1 million trees.");
    }
}