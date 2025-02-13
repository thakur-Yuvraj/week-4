import collection.setinterface.checkiftwosetareequal.CheckTwoSetEqual;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class CheckTwoSetEqualTest {
    @Test
    void checkEquals() {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(new Integer[]{1, 2, 3}));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(new Integer[]{3, 2, 1}));

        Assert.assertTrue(CheckTwoSetEqual.isEqual(set1, set2));

    }
}
