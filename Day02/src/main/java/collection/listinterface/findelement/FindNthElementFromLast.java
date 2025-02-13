//Find the Nth Element from the End
//Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
//Example:
//Input: [A, B, C, D, E], N=2 → Output: D.

package collection.listinterface.findelement;

import java.util.*;

public class FindNthElementFromLast {
    // method to find element at last
    public static <T> T findElementAtLast(List<T> list, int n) {
        if (list == null || list.isEmpty() || n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Initialize two iterators
        ListIterator<T> fast = list.listIterator();
        ListIterator<T> slow = list.listIterator();

        // Move the fast iterator N steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                throw new IllegalArgumentException("N is greater than the size of the list");
            }
            fast.next();
        }

        // Move both iterators until fast reaches the end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        // The slow iterator is now at the Nth element from the end
        return slow.next();
    }


    public static void main(String[] args) {
        // given input
        List<Character> chars = new LinkedList<>(Arrays.asList(new Character[] {'A', 'B', 'C', 'D', 'E'}));
        int target = 2;
        System.out.println(FindNthElementFromLast.findElementAtLast(chars, target));

    }
}
