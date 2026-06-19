package com.tutorial.shoppingcart;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class ProductSeed {
    public static Map<String, Product> seedProducts() {
        Map<String, Product> catalog = new HashMap<>();
        catalog.put("P001", new Product("P001", "Laptop Pro", new BigDecimal("999.99"), 10));
        catalog.put("P002", new Product("P002", "Wireless Mouse", new BigDecimal("29.99"), 50));
        catalog.put("P003", new Product("P003", "USB-C Cable", new BigDecimal("19.50"), 100));
        catalog.put("P004", new Product("P004", "Mechanical Keyboard", new BigDecimal("89.00"), 5));
        catalog.put("P005", new Product("P005", "E-Book: Java Mastery", new BigDecimal("15.99"), null));
        catalog.put("P006", new Product("P006", "Anti-Virus Software (Digital)", new BigDecimal("49.99"), null));
        return catalog;
    }
}
