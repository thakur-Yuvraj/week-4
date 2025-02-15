import junit.basic.testinglistoperations.ListManager;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class ListManagerTest {

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 10);
        assertEquals(1, list.size(), "List size should be 1 after adding an element");
        assertTrue(list.contains(10), "List should contain the added element 10");
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        assertTrue(ListManager.removeElement(list, 10), "Element 10 should be removed from the list");
        assertEquals(1, list.size(), "List size should be 1 after removing an element");
        assertFalse(list.contains(10), "List should not contain the removed element 10");
    }

    @Test
    void testRemoveElementNotPresent() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        assertFalse(ListManager.removeElement(list, 20), "Removing a non-existent element should return false");
        assertEquals(1, list.size(), "List size should remain unchanged");
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, ListManager.getSize(list), "Initial list size should be 0");
        list.add(10);
        assertEquals(1, ListManager.getSize(list), "List size should be 1 after adding an element");
    }
}