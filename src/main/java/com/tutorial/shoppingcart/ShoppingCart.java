package com.tutorial.shoppingcart;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class ShoppingCart {

    private Map<String, Product> products;
    private Map<String, Integer> catalog;

    public ShoppingCart(Map<String, Product> products) {
        this.products = products;
    }

    public void addItem(String productId, int quantity) throws ProductNotFound, ProductOutOfStock {
        Product product = this.findProduct(productId);
        if (product.getStock() - quantity < 0) {
            throw new ProductOutOfStock("Product With Id: " + productId + " , Is Out Of Stock");
        }
        this.catalog.merge(productId, quantity, Integer::sum);
    }

    public void removeItem(String productId) throws ProductNotFound {
        this.findProduct(productId);
        this.catalog.remove(productId);
    }

    public void calculateSubTotal() {}

    public void clear() {
        this.catalog.clear();
    }

    public ArrayList<Product> getItems() {
        Set<String> productIdies = this.catalog.keySet();
        ArrayList<Product> products = new ArrayList<>();
        for (String key : productIdies) {
            products.add(this.findProduct(key));
        }
        return products;
    }

    public void addNewProduct(Product product) {
        this.catalog.put(product.getId(), product.getStock());
    }

    private Product findProduct(String productId) throws ProductNotFound {
        Product product = this.products.get(productId);
        if (product == null) {
            throw new ProductNotFound("Product Not Found With Id: " + productId);
        }
        return product;
    }
}

