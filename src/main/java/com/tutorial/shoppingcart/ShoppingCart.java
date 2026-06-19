package com.tutorial.shoppingcart;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Product> catalog;

    public ShoppingCart(Map<String, Product> catalog) {
        this.catalog = catalog;
    }

    public void addItem(String productId, int quantity) {}

    public void removeItem(String productId) {}

    public void updateQuantity(String productId, int quantity) {}

    public void calculateSubTotal() {}

    public void clear() {}

    public Map<String, Product> getItems() {
        return catalog;
    }

    public void addNewProduct(Product product) {
        this.catalog.put(product.getId(), product);
    }
}

