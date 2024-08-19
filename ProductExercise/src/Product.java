import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private int id; // Product ID
    private String title; // Product title
    private double price; // Product price
    private int quantity; // Product quantity

    // Constructor
    public Product(int id, String title, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to filter products based on price
    public static List<Product> getFilteredProducts(List<Product> products, Double minPrice, Double maxPrice, Integer minQuantity) {
        return products.stream()
                .filter(product -> (minPrice == null || product.getPrice() >= minPrice) &&
                        (maxPrice == null || product.getPrice() <= maxPrice) &&
                        (minQuantity == null || product.getQuantity() >= minQuantity))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
