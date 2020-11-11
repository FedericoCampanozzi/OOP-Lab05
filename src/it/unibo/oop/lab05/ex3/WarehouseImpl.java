package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of a warehouse.
 * 
 */
public class WarehouseImpl implements Warehouse {

    private final Set<Product> products = new HashSet<>();
    
    public final void addProduct(final Product p) {
        this.products.add(p);
    }

    public Set<String> allNames() {
        final var s = new HashSet<String>();
        for (final Product p : this.products) {
            s.add(p.getName());
        }
        return s;
    }
    
    public Set<Product> allProducts() {
        return new HashSet<>(this.products);
    }

    public final boolean containsProduct(final Product p) {
        return products.contains(p);
    }
    
    public final double getQuantity(final String name) {
        for (final var p : this.products) {
            if (p.getName().equals(name)) {
                return p.getQuantity();
            }
        }
        return 0;
    }
}
