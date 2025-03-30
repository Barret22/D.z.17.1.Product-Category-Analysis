package services;

import models.Product;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductProcessor {

    public static Map<String, List<Product>> groupByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    public static Map<String, Double> getAveragePriceByCategory(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));
    }

    public static String getMostExpensiveCategory(Map<String, Double> averagePrices) {
        return averagePrices.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No categories found");
    }
}
