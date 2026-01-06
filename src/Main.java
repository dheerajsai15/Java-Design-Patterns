import behavioural.chainOfResponsibility.*;
import behavioural.command.*;
import behavioural.iterator.PlaylistIterator;
import behavioural.iterator.Video;
import behavioural.iterator.YoutubePlaylist;
import behavioural.iterator.YoutubePlaylistIterator;
import behavioural.observer.EmailSubscriber;
import behavioural.observer.MobileAppSubscriber;
import behavioural.observer.YoutubeChannel;
import behavioural.state.OrderContext;
import behavioural.strategy.AirportQueueStrategy;
import behavioural.strategy.NearestDriverStrategy;
import behavioural.strategy.RideMatchingService;
import behavioural.template.EmailNotification;
import behavioural.template.NotificationSender;
import behavioural.template.SMSNotification;
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
//        Forest forest = new Forest();
//        // Planting 1 million trees
//        for(int i = 0; i < 1000000; i++) {
//            forest.plantTree(i, i, "Oak", "Green", "Rough");
//        }
//        System.out.println("Planted 1 million trees.");

        // Iterator Pattern
//        YoutubePlaylist playlist = new YoutubePlaylist();
//        playlist.addVideo(new Video("LLD Tutorial"));
//        playlist.addVideo(new Video("System Design Basics"));
//
//        PlaylistIterator iterator = playlist.createIterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().getTitle());
//        }

        // Observer Pattern
//        YoutubeChannel tuf = new YoutubeChannel("TakeUForward");
//        tuf.subscribe(new MobileAppSubscriber("Dheeraj"));
//        tuf.subscribe(new EmailSubscriber("vnr@rnv.com"));
//        tuf.uploadVideo("observer-pattern");

        //strategyPattern();
        //commandPattern();
        //templatePattern();
        //statePattern();
        chainOfResponsibilityPattern();
    }

    private static void chainOfResponsibilityPattern(){
        SupportHandler general = new GeneralSupport();
        SupportHandler billing = new BillingSupport();
        SupportHandler technical = new TechnicalSupport();
        SupportHandler delivery = new DeliverySupport();

        // Setting up the chain: general -> billing -> technical -> delivery
        general.setNextHandler(billing);
        billing.setNextHandler(technical);
        technical.setNextHandler(delivery);

        // Testing the chain of responsibility with different request types
        general.handleRequest("refund");
        general.handleRequest("delivery");
        general.handleRequest("unknown");
    }

    private static void strategyPattern(){
        RideMatchingService rideMatchingService = new RideMatchingService(new AirportQueueStrategy());
        rideMatchingService.matchRider("Hyd");

        RideMatchingService rideMatchingService1 = new RideMatchingService(new NearestDriverStrategy());
        rideMatchingService1.matchRider("Blr");
    }

    private static void commandPattern(){
        Light light = new Light();
        AC ac = new AC();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command acOn = new AConCommand(ac);
        Command acOff = new ACOffCommand(ac);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, lightOn);
        remote.setCommand(1, lightOff);
        remote.setCommand(2, acOn);
        remote.setCommand(3, acOff);

        remote.pressButton(0); // Light ON
        remote.pressButton(2); // AC ON
        remote.pressButton(1); // Light OFF
        remote.pressUndo();    // Undo Light OFF -> Light ON
        remote.pressUndo();    // Undo AC ON -> AC OFF
    }

    private static void templatePattern(){
        NotificationSender emailSender = new EmailNotification();
        emailSender.send("john@example.com", "Welcome to TUF+!");

        System.out.println(" ");

        NotificationSender smsSender = new SMSNotification();
        smsSender.send("9876543210", "Your OTP is 4567.");
    }

    private static void statePattern(){
        OrderContext order = new OrderContext();

        // Display initial state
        System.out.println("Current State: " + order.getCurrentState());

        // Moving through states
        order.next();  // ORDER_PLACED -> PREPARING
        order.next();  // PREPARING -> OUT_FOR_DELIVERY
        order.cancel(); // Should fail, as order is out for delivery
        order.next();  // OUT_FOR_DELIVERY -> DELIVERED
        order.cancel(); // Should fail, as order is delivered

        // Display final state
        System.out.println("Final State: " + order.getCurrentState());
    }
}