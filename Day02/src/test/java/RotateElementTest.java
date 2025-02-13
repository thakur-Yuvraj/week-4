import collection.listinterface.rotateelements.RotateElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementTest {
    @Test
    void rotateElementT1() {
        List<Integer> input = new ArrayList<>(Arrays.asList(new Integer[] {10, 20, 30, 40, 50}));
        List<Integer> output = RotateElement.rotateList(input, 2);
        List<Integer> correctOutput = new ArrayList<>(Arrays.asList(new Integer[]{30, 40, 50, 10, 20}));
        Assert.assertEquals(output, correctOutput);
    }

    @Test
    void rotateElementT2() {
        List<Integer> input = new ArrayList<>(Arrays.asList(new Integer[] {10, 20, 30, 40, 50}));
        List<Integer> output = RotateElement.rotateList(input, 1);
        List<Integer> correctOutput = new ArrayList<>(Arrays.asList(new Integer[]{20, 30, 40, 50, 10}));
        Assert.assertEquals(output, correctOutput);
    }

}
