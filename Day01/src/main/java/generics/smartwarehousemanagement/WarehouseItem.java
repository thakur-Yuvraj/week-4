package generics.smartwarehousemanagement;

public abstract class WarehouseItem{
    int itemId;
    int itemPrice;

    public WarehouseItem(int itemId, int itemPrice) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
    }

    public String toString() {
        return "Item id is : "+ itemId + " Price is : " + itemPrice;
    }
}
