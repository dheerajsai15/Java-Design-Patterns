package behavioural.visitor;

// ======= Element Interface ==========
public interface Item {
    void accept(ItemVisitor visitor);
}
