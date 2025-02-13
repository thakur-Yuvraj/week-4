//1. Smart Warehouse Management System
//Concepts: Generic Classes, Bounded Type Parameters, Wildcards
//Problem Statement:
//You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
//        Hints:
//Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
//Implement a generic class Storage<T extends WarehouseItem> to store items safely.
//Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).


package generics.smartwarehousemanagement;

public class SmartWarehouseSystem {

    public static void main(String[] args) {
        // create storage for electronics
        Storage<Electronics> electronicsStorage = new Storage<>();

        // create storage for groceries
        Storage<Groceries> groceriesStorage = new Storage<>();

        // create storage for furniture
        Storage<Furniture> furnitureStorage = new Storage<>();

        // adding item to electronic
        electronicsStorage.addItem(new Electronics("smartphone", 32, 15_000));
        electronicsStorage.addItem(new Electronics("chargerBrick", 31, 1_000));
        electronicsStorage.addItem(new Electronics("Laptop", 30, 55_000));

        // printing electronic item
        Storage.printAllItems(electronicsStorage.getItems());

        // adding items to furniture
        furnitureStorage.addItem(new Furniture("Bed", 11, 11_000));
        furnitureStorage.addItem(new Furniture("Chair", 10, 1_000));

        // printing the furniture items
        Storage.printAllItems(furnitureStorage.getItems());
    }

}
