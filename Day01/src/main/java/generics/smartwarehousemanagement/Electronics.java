package generics.smartwarehousemanagement;

public class Electronics extends WarehouseItem{
    String type;
    public Electronics(String type, int id, int price) {
        super(id, price);
        this.type = type;
    }

    public String toString() {
        return "item is : "+ type + ", " + super.toString();
    }
}
