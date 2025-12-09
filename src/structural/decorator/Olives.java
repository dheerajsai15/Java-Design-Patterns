package structural.decorator;

public class Olives extends PizzaDecorator{
    public Olives(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , olives";
    }

    @Override
    public double getCost() {
        return pizza.getCost() +  30.0;
    }
}
