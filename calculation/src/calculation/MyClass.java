package calculation;

import calculation.Product;
import calculation.Product;

public class MyClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        Product product = new Product(a, b);
        
        System.out.println("Product of " + a + " and " + b + " is: " + product.getProduct());
    }
}