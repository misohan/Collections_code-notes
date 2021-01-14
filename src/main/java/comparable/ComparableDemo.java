package comparable;

import java.util.TreeSet;

public class ComparableDemo {
    // Comparable Interface has only one method
    // compareTo
    // obj1 <obj2 (-1), obj1==obj2 (0), obj1 > obj2 (+1)

    // Comparator interface
    // compare(obj1, ob2) => own implementation possible
    public static void main(String[] args) {
        TreeSet data = new TreeSet();
        data.add(15);
        data.add(18);
        data.add(25);
        data.add(1);
        data.add(13);
        data.add(1); // duplicate element

        // by default soring is ascending if we will not implement our own compareTo method

    }
}
