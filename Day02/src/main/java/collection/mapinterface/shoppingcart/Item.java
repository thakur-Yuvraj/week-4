package collection.mapinterface.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String item;
    private Integer price;

    Item(String item, Integer price) {
        this.item = item;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Item name is : "+ item + " price is : "+ price;
    }

}
