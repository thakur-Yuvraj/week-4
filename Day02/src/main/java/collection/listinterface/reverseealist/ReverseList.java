//Reverse a List
//        Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
//        Example:
//        Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].


package collection.listinterface.reverseealist;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseList {

    // helper function to swap two element
    private static void swap(List<Integer> list, int a, int b) {
        list.set(a, list.get(a) ^ list.get(b));
        list.set(b, list.get(a) ^ list.get(b));
        list.set(a, list.get(a) ^ list.get(b));
    }

    // method to reverse a list
    public static void reverseList(List<Integer> list) {
        int st = 0;
        int ed = list.size()-1;

        while(st < ed) {
            swap(list, st, ed);
            st++; ed--;
        }
    }
    public static void main(String[] args) {

        // creating object of arraylist
        List<Integer> list = new ArrayList<>();

        // adding element to list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // reversing element of the list
        ReverseList.reverseList(list);
        System.out.println(list);

        // creating object of linked list
        List<Integer> linkedList = new LinkedList<>();

        // adding element to linked List
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // reversing element of linked list
        ReverseList.reverseList(linkedList);
        System.out.println(linkedList);
    }


}
