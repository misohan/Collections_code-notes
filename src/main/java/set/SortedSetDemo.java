package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet treeSet = new TreeSet();
        // sorting values in natural sorting order, ascending

        //assigning treeSet object to SortedSet reference
        SortedSet s = new TreeSet();
        s.add(5);
        s.add(10);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(7);
        System.out.println(s);

        //Methods in SortedSet Interface TreeSet Collection Integer

        //Object first()
        System.out.println(s.first());

        //Object last()
        System.out.println(s.last());

        //SortedSet headSet(Object o)
        System.out.println(s.headSet(3)); // values that coming before 3 sor 1, 2

        //SortedSet tailSet(Object 0)
        System.out.println(s.tailSet(3)); // values that coming after 3, 3 including

        //SortedSet subSet(Object o,Object p)
        System.out.println(s.subSet(3,7)); // values between 3 and 7, including 3, but not containing 7

        //Comaparator comparator()
        System.out.println(s.comparator());

        // it takes only homogenous elements, can not sort different objects
    }




}
