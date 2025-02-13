package collection.mapinterface.shoppingcart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Cart {
    private HashMap<Item, Integer> cart;
    private Map<Integer, Item> order;
    private Map<Integer, Item> priceOrder;
    private Integer items;

    Cart() {
        cart = new HashMap<>();
        order = new LinkedHashMap<>();
        priceOrder = new TreeMap<>();
        items = 0;
    }

    public void addItem(Item item) {
        items++;
        //Use HashMap to store product prices.
        cart.put(item, item.getPrice());
        order.put(items, item);
        priceOrder.put(item.getPrice(), item);
    }

    public void displayItem() {
        for(Item i : cart.keySet()) {
            System.out.println(i);
        }
    }

    //Use LinkedHashMap to maintain the order of items added.

    public void displayItemByOrder() {
        for(Item i : order.values()) {
            System.out.println(i);
        }
    }

    //Use TreeMap to display items sorted by price.
    public void displayItemByPrice() {
        for(Item i : priceOrder.values()) {
            System.out.println(i);
        }
    }
}
