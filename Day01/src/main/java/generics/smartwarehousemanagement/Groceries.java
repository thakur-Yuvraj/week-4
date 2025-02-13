package generics.smartwarehousemanagement;

public class Groceries extends WarehouseItem{
    String type;
    public Groceries(String type, int id, int price) {
        super(id, price);
        this.type = type;
    }

    public String toString() {
        return "item is : "+ type + ", " + super.toString();
    }
}
