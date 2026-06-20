package com.tutorial.shoppingcart;
import java.math.BigDecimal;
import java.util.Map;


public class ShoppingCart {

    private Map<String, Product> products;
    private Map<String, CartItem> cartItems;

    public ShoppingCart(Map<String, Product> products) {
        this.products = products;
    }

    public void addItem(String productId, int quantity) throws ProductNotFound, ProductOutOfStock {
        Product product = this.findProduct(productId);
        if (product.getStock() - quantity < 0) {
            throw new ProductOutOfStock("Product With Id: " + productId + " , Is Out Of Stock");
        }
        CartItem cartItem = this.cartItems.get(productId);
        cartItem.Product = product;
        cartItem.quantity += quantity;
        this.cartItems.put(productId, cartItem);
    }

    public void removeItem(String productId) throws ProductNotFound {
        this.findProduct(productId);
        this.cartItems.remove(productId);
    }

    public BigDecimal calculateSubTotal() {
        BigDecimal total = new BigDecimal("0");
        for (String productId : this.cartItems.keySet()) {
            CartItem cartItem = this.cartItems.get(productId);
            BigDecimal result = cartItem.Product.getPrice().multiply(BigDecimal.valueOf(cartItem.quantity));
            total.add(result);
        }
        return total;
    }

    public void clear() {
        this.cartItems.clear();
    }

    public Map<String, CartItem> getItems() {
        return this.cartItems;
    }

    private Product findProduct(String productId) throws ProductNotFound {
        Product product = this.products.get(productId);
        if (product == null) {
            throw new ProductNotFound("Product Not Found With Id: " + productId);
        }
        return product;
    }
}
