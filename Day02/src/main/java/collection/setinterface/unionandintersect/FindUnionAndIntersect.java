//Union and Intersection of Two Sets
//Given two sets, compute their union and intersection.
//        Example:
//Set1: {1, 2, 3}, Set2: {3, 4, 5} → Union: {1, 2, 3, 4, 5}, Intersection: {3}.


package collection.setinterface.unionandintersect;

import java.util.Arrays;
import java.util.HashSet;

public class FindUnionAndIntersect {
    // method to find union of two set
    public static <T> HashSet<T> findUnion(HashSet<T> s1, HashSet<T> s2) {
        HashSet<T> union = new HashSet<>();
        union.addAll(s1);
        union.addAll(s2);
        return union;
    }

    // method to find intersect of two set
    private static <T> HashSet<T> findIntersect(HashSet<T> set1, HashSet<T> set2) {
        HashSet<T> intersect = new HashSet<>();
        for (T item : set1) {
            if (set2.contains(item)) {
                intersect.add(item);
            }
        }
        return intersect;
    }
    public static void main(String[] args) {
        // given two set
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(new Integer[]{1, 2, 3}));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(new Integer[]{3, 4, 5}));

        // finding the union of two set
        System.out.println(findUnion(set2, set1));

        // finding the intersect of two set
        System.out.println(findIntersect(set1, set2));
    }


}
