package generics.smartwarehousemanagement;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

    List<T> itemList = new ArrayList<>();

    public void addItem(T item) {
        itemList.add(item);
    }

    public List<T> getItems() {
        return itemList;
    }

    // wildcard method
    public static void printAllItems(List<? extends WarehouseItem> itemList) {
        for (Object o : itemList) {
            System.out.println(o);
        }
    }
}

