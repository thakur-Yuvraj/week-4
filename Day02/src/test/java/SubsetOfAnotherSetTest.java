import collection.setinterface.subsetofanotherset.SubsetOfAnotherSet;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class SubsetOfAnotherSetTest {
    @Test
    void isSetOfAnother() {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(new Integer[]{2, 3}));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(new Integer[]{1, 2, 3, 4}));

        Assert.assertTrue(SubsetOfAnotherSet.isSubsetOfAnother(set1, set2));
    }
}
