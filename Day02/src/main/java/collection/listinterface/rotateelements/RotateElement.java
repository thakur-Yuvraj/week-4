//Rotate Elements in a List
//Rotate the elements of a list by a given number of positions.
//Example:
//Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].

package collection.listinterface.rotateelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElement {

    // method to reverse a list
    public static List<Integer> rotateList(List<Integer> nums, int k) {
        // reverse list
        List<Integer> rotateNums = new ArrayList<>();

        for (int i = k; i < nums.size(); i++) {
            rotateNums.add(nums.get(i));
        }

        for (int i = 0; i < k; i++) {
            rotateNums.add(nums.get(i));
        }

        return rotateNums;
    }
    public static void main(String[] args) {
        // given list of numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(new Integer[]{10, 20, 30, 40, 50}));

        // variable by which we rotate the array
        int k = 2;

        // getting the rotated list
        System.out.println(RotateElement.rotateList(nums, k));
    }
}
