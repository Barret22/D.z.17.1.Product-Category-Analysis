package app;

import models.Product;
import java.util.Arrays;
import java.util.List;

public class ProductData {

    public static List<Product> getProducts() {
        return Arrays.asList(
                new Product("Apple", "Fruits", 1.2),
                new Product("Banana", "Fruits", 0.8),
                new Product("Orange", "Fruits", 1.5),
                new Product("Milk", "Dairy", 2.0),
                new Product("Cheese", "Dairy", 5.5),
                new Product("Yogurt", "Dairy", 3.2),
                new Product("Bread", "Bakery", 1.8),
                new Product("Croissant", "Bakery", 2.5)
        );
    }
}
