//Remove Duplicates While Preserving Order
//Remove duplicate elements from a list while maintaining the original order of elements.
//Example:
//Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].


package collection.listinterface.removeduplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {

    // method to remove the duplicate and returns it as unique integer list
    public static List<Integer> removeDuplicate(List<Integer> nums) {
        List<Integer> output = new ArrayList<>();
        HashSet<Integer> numUnique = new HashSet<>();
        for (Integer num : nums) {
            if (!numUnique.contains(num)) {
                numUnique.add(num);
                output.add(num);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        // given input list
        List<Integer> nums = new ArrayList<>(Arrays.asList(new Integer[] {3, 1, 2, 2, 3, 4}));

        // removing the duplicate while preserving order
        System.out.println(RemoveDuplicate.removeDuplicate(nums));
    }
}
