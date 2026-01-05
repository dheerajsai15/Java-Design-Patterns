package behavioural.state;

// OrderState interface defines the behavior of the order states
public interface OrderState {
    void next(OrderContext context); // Move to the next state
    void cancel(OrderContext context); // Cancel the order
    String getStateName(); // Get the name of the state
}
