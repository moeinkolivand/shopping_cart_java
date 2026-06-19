package com.tutorial;
import com.tutorial.shoppingcart.CheckOutService;
import com.tutorial.shoppingcart.Product;
import com.tutorial.shoppingcart.ProductSeed;
import com.tutorial.shoppingcart.ShoppingCart;
import java.util.Map;


public class App 
{
    public static void main( String[] args )
    {
        Map<String, Product> products = ProductSeed.seedProducts();
        ShoppingCart shoppingCart = new ShoppingCart(products);
        CheckOutService checkOutService = new CheckOutService();
    }
}
