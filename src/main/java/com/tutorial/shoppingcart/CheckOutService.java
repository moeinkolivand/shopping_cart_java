package com.tutorial.shoppingcart;
import java.math.BigDecimal;

public class CheckOutService {
    public BigDecimal calculateTotal(ShoppingCart cart) {
        return new BigDecimal("12312");
    };
    public String generateReceipt(ShoppingCart cart) {
      return "1231231";
    };

    public int calculateLoyaltyPoints(ShoppingCart cart){ return 1;}
}
