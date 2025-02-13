//Symmetric Difference
//        Find the symmetric difference (elements present in either set but not in both) of two sets.
//        Example:
//        Set1: {1, 2, 3}, Set2: {3, 4, 5} → Output: {1, 2, 4, 5}.

package collection.setinterface.symmetricdifference;

import java.util.Arrays;
import java.util.HashSet;

public class CalculateSymmetricDifference {

    // method to find the symmetric difference of two sets
    public static <T> HashSet<T> findSymmetricDifference(HashSet<T> s1, HashSet<T> s2) {
        HashSet<T> symmetricDiff = new HashSet<>();

        for (T item : s1) {
            if (!s2.contains(item)) {
                symmetricDiff.add(item);
            }
        }

        for (T item : s2) {
            if (!s1.contains(item)) {
                symmetricDiff.add(item);
            }
        }
        return symmetricDiff;
    }

    public static void main(String[] args) {
        // given two set
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(new Integer[]{1, 2, 3}));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(new Integer[]{3, 4, 5}));

        // finding the symmetric difference
        System.out.println(findSymmetricDifference(set2, set1));
    }
}
