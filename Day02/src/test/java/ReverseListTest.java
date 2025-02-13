import collection.listinterface.reverseealist.ReverseList;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseListTest {
    @Test
    void isReversed() {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1); li.add(2); li.add(3); li.add(4); li.add(5);
        ReverseList.reverseList(li);
        LinkedList<Integer> liRev = new LinkedList<>();
        liRev.add(5); liRev.add(4); liRev.add(3); liRev.add(2); liRev.add(1);
        Assert.assertEquals(li, liRev);
    }

    @Test
    void isReverse() {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1); li.add(2); li.add(3); li.add(4); li.add(5);
        ReverseList.reverseList(li);
        ArrayList<Integer> liRev = new ArrayList<>();
        liRev.add(5); liRev.add(4); liRev.add(3); liRev.add(2); liRev.add(1);
    }
}
