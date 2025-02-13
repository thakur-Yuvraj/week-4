import collection.listinterface.removeduplicate.RemoveDuplicate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateTest {
    @Test
    void removeT1() {
        //Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
        List<Integer> input = new ArrayList<>(Arrays.asList(new Integer[] {3, 1, 2, 2, 3, 4}));
        List<Integer> output = RemoveDuplicate.removeDuplicate(input);

        Assert.assertEquals(output, Arrays.asList(new Integer[] {3, 1, 2, 4}));
    }
}
