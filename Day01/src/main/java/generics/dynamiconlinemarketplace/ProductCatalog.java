package generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

// Product catalog class definition
public class ProductCatalog {
    // Storing the list of the different products
    private List<Product<?>> products;

    // Default constructor
    ProductCatalog() {
        this.products = new ArrayList<>();
    }

    // Method for adding the different product to the list
    public <T extends Product<?>> void addProduct(T product) {
        products.add(product);
    }

    // Generic method for applying the discount to the passed product and updating it
    public <T extends Product<?>> void applyDiscount(T product, double percentage) {
        if(percentage > 0 && percentage < 100) {
            double discount = product.getPrice() * percentage / 100;
            product.setPrice(product.getPrice() - discount);
        } else {
            System.out.println("Invalid discount percentage!!");
        }
    }

    // Method for displaying the detail of products
    public void displayProducts() {
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}