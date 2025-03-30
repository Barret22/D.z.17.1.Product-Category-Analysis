package app;

import models.Product;
import services.ProductProcessor;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Product> products = ProductData.getProducts();

        Map<String, List<Product>> grouped = ProductProcessor.groupByCategory(products);
        System.out.println("\nProducts grouped by category:");
        grouped.forEach((category, productList) ->
                System.out.println(category + " -> " + productList));

        Map<String, Double> averagePrices = ProductProcessor.getAveragePriceByCategory(products);
        System.out.println("\nAverage price by category:");
        averagePrices.forEach((category, avgPrice) ->
                System.out.printf("%s: %.2f$\n", category, avgPrice));

        String mostExpensiveCategory = ProductProcessor.getMostExpensiveCategory(averagePrices);
        System.out.println("\nCategory with the highest average price: " + mostExpensiveCategory);
    }
}
