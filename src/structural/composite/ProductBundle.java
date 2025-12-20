package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem{
    private String bundleName;
    private List<CartItem> items = new ArrayList<>();

    public ProductBundle(String bundleName){
        this.bundleName = bundleName;
    }

    public void addProduct(CartItem product){
        items.add(product);
    }

    @Override
    public double getPrice(){
        double total = 0.0;
        for(CartItem product: items){
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public void display(String indent){
        System.out.println(indent + "Bundle: " + bundleName);
        for(CartItem product: items){
            product.display(indent + " ");
        }
    }
}
