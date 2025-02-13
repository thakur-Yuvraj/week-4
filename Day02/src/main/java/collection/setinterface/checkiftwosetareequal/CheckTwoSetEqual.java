//Check if Two Sets Are Equal
//Compare two sets and determine if they contain the same elements, regardless of order.
//        Example:
//Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.

package collection.setinterface.checkiftwosetareequal;

import java.util.Arrays;
import java.util.HashSet;

public class CheckTwoSetEqual {

    // method to check if two set are equal or not
    public static <T> boolean isEqual(HashSet<T> set1, HashSet<T> set2) {
        if (set1.size() != set2.size()) return false;
        for(T item : set1) {
            if (!set2.contains(item)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // given two set
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(new Integer[]{1, 2, 3}));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(new Integer[]{3, 2, 1}));

        // checking if they are equal or not
        if (isEqual(set1, set2)) {
            System.out.println("Are equal");
        }else {
            System.out.println("Not equal");
        }
    }
}
