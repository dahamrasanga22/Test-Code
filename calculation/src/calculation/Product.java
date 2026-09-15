package calculation;

public class Product {
     int var1;
     int var2;
    
    public Product(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
    
    public int getProduct() {
        return var1 * var2;
    }
}