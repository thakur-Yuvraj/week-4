//Convert a Set to a Sorted List
//        Convert a HashSet of integers into a sorted list in ascending order.
//        Example:
//        Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].

package collection.setinterface.settoasortedlist;

import java.util.*;

public class SetToSortedList {
    // helper function to insert a num into sorted list
    private static <T extends Comparable<T>> void insert(List<T> li, T target) {
        for (int i = 0; i < li.size(); i++) {
            if (target.compareTo(li.get(i)) < 0) {
                // target < li.get(i)
                li.add(i, target);
                return;
            }
        }
        li.add(target);
    }

    // method to convert set into a sorted list
    public static <T extends Comparable<T>> List<T> setToList(HashSet<T> s) {
        List<T> output = new ArrayList<>();
        for (T num : s) {
            insert(output, num);
        }
        return output;
    }
    public static void main(String[] args) {
        // given set
        HashSet<Integer> set = new HashSet<>(Arrays.asList(new Integer[]{5, 3, 9, 1}));

        // turning the set into sorted list
        System.out.println(setToList(set));
    }
}
