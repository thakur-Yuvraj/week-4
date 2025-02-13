import collection.setinterface.settoasortedlist.SetToSortedList;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class SetToSortedListTest {
    @Test
    void isGenerated() {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(new Integer[]{5, 3, 9, 1}));

        Assert.assertEquals(Arrays.asList(new Integer[] {1, 3, 5, 9}), SetToSortedList.setToList(set));
    }
}
