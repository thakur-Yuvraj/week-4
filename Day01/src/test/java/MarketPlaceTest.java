import org.example.dynamiconlinemarketplace.BookCategory;
import org.example.dynamiconlinemarketplace.DiscountUtility;
import org.example.dynamiconlinemarketplace.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarketPlaceTest {

    static Product<BookCategory> p;

    @BeforeAll
    static void initialize() {
        p = new Product<>(1000, new BookCategory(), "Davinchi");
        DiscountUtility.applyDiscount(p, 10); // Assuming it's a static method
    }

    @Test
    void testDiscount() {
        assertEquals(900.0, p.price);
    }
}
