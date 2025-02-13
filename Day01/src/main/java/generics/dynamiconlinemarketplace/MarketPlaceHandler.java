//Dynamic Online Marketplace
//Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
//Problem Statement:
//Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
//Hints:
//Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
//Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
//Ensure type safety while allowing multiple product categories to exist in the same catalog.


package generics.dynamiconlinemarketplace;

public class MarketPlaceHandler {
        public static void main(String[] args) {
            // Defining the product catalog object
            ProductCatalog catalog = new ProductCatalog();

            // Create products of different categories
            Product<BookCategory> book1 = new Product<>("interstellar", 205.0,new BookCategory() {});
            Product<ClothingCategory> pant1 = new Product<>("Pajama", 99.0, new ClothingCategory() {});
            Product<GadgetCategory> desk1 = new Product<>("Mobile", 5800.0, new GadgetCategory() {});

            // Adding products to the catalog
            catalog.addProduct(book1);
            catalog.addProduct(pant1);
            catalog.addProduct(desk1);

            // Display products
            System.out.println("Products in the catalog:");
            catalog.displayProducts();

            // Apply a discount to a book
            catalog.applyDiscount(book1, 10);

            //Apply discount to a pant
            catalog.applyDiscount(pant1, 20);

            //Apply discount to a pant
            catalog.applyDiscount(desk1, 9.9);

            // Display products after discount
            System.out.println("\nProducts in the catalog after discount:");
            //Price not updated in the object itself, only in the discount message.
            catalog.displayProducts();

        }
}
