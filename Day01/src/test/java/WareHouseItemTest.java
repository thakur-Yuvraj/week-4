import org.example.smartwarehousemanagementsystem.Groceries;
import org.example.smartwarehousemanagementsystem.Storage;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WareHouseItemTest {
    private Storage storage = new Storage();

    @Test
    void testAddElementToStorage() {
        assertEquals(1, storage.addItem(new Groceries(3200,654,"Beatlenut")));
    }

    @Test
    void testRemoveElementFromStorage() {
        assertEquals("No item with given productId to remove \n", storage.removeItem(321));
    }


}
