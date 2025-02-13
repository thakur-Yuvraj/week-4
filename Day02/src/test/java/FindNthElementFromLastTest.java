import collection.listinterface.findelement.FindNthElementFromLast;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindNthElementFromLastTest {
    @Test
    void findElement() {
        //Input: [A, B, C, D, E], N=2 → Output: D.
        List<Character> input = new LinkedList<>(Arrays.asList(new Character[] {'A', 'B', 'C', 'D', 'E'}));
        Character output = FindNthElementFromLast.findElementAtLast(input, 2);

        Assert.assertEquals(output, 'D');
    }
}
