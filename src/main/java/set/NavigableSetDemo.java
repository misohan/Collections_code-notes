package set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        // have methods related to navigation functionality
        // NavigableSet and SortedSet have same implementation TreeSet

        //assigning treeSet object to navigableSet reference
        NavigableSet<Integer> data = new TreeSet<Integer>();

        //adding elements
        data.add(1000);
        data.add(3000);
        data.add(13000);
        data.add(40000);
        data.add(54000);
        System.out.println("---- Tree Set ----");
        System.out.println(data);
        System.out.println("-----------------------------------------");

        //Methods

        System.out.println(data.floor(13550)); // Returns the least element in this set greater than or equal
        // to the given element, or null if there is no such element.

        System.out.println(data.lower(14000)); // Returns the greatest element in this set strictly
        // less than the given element, or null if there is no such element.

        System.out.println(data.ceiling(2500)); // Returns the least element in this set strictly greater
        // than the given element, or null if there is no such element.

        System.out.println(data.higher(4000));

        System.out.println(data.pollFirst());

        System.out.println(data.pollLast());

        System.out.println(data.descendingSet());
    }

}
