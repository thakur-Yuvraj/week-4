package generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;


// Product class definition
public class Product<T extends ProductCategory> {
    // Attributes
    private double price;
    private String name;
    private T category;

    // Parameterized constructor
    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getCategory() {
        return category;
    }

    public void setCategory(T category) {
        this.category = category;
    }

    //Display details in nicely formatted category
    @Override
    public String toString() {
        return "Product { " +
                "name = '" + name + '\'' +
                ", price = " + price +
                + '}';
    }
}