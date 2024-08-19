import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 999.99, 5));
        products.add(new Product(2, "Smartphone", 499.99, 10));
        products.add(new Product(3, "Tablet", 299.99, 0));
        products.add(new Product(4, "Headphones", 89.99, 15));
        products.add(new Product(5, "Smartwatch", 199.99, 8));

        // Filter products by price range and minimum quantity
        System.out.println("Filtered Products (Price >= 200 and Quantity >= 5):");
        List<Product> filteredProducts = Product.getFilteredProducts(products, 200.0, null, 5);
        filteredProducts.forEach(System.out::println);

        // Filter products by price range
        System.out.println("\nFiltered Products (Price between 100 and 500):");
        filteredProducts = Product.getFilteredProducts(products, 100.0, 500.0, null);
        filteredProducts.forEach(System.out::println);

        // Filter products by minimum quantity
        System.out.println("\nFiltered Products (Quantity >= 10):");
        filteredProducts = Product.getFilteredProducts(products, null, null, 10);
        filteredProducts.forEach(System.out::println);
    }
}