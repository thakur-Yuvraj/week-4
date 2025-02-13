package generics.smartwarehousemanagement;

public class Furniture extends WarehouseItem{
    String type;
    public Furniture(String type, int id, int price) {
        super(id, price);
        this.type = type;
    }

    public String toString() {
        return "item is : "+ type + ", " + super.toString();
    }
}
