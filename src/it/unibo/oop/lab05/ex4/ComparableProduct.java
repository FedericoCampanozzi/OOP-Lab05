package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {
	
    public ComparableProduct(final String name, final double quantity) {
        super(name, quantity);
    }
    
    public int compareTo(final Product o) {
        return getName().compareTo(o.getName());
    }
}
