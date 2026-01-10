package behavioural.visitor;

// ======== Visitor Interface ============
public interface ItemVisitor {
    void visit(PhysicalProduct item);
    void visit(DigitalProduct item);
    void visit(GiftCard item);
}
