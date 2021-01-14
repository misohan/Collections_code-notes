package lists;

import arrays.Car;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // every element is separated object => node
        // node = data + address to next element
        // duplicate objects allowed
        // heterogeneous objects allowed
        // insertion order is preserved

        //creating linkedList
        LinkedList l = new LinkedList();

        //creating linkedList with specified collection
        //LinkedList ll = new LinkedList(Collection c);

        //adding elements in linkedList
        l.add("John");
        l.add(10);
        l.add(null);
        System.out.println(l);

        //to replace element with given element at specified index
        l.set(1, 13);
        System.out.println(l);

        //to add element at specified index without replacing (shifts existing values to the right)
        l.add(2, true);
        System.out.println(l);

        //to remove last element
        l.removeLast();
        System.out.println(l);

        //to add element at first position
        l.addFirst(1);
        System.out.println(l);


        // ArrayList VS LinkedList
        // ArrayList is worse for insertion and deletion
        // ArrayList is good for retrieving (index)
        // LinkedList is bad for retrieving since we need to iterate by each node one by one
        // LinkedList is not good for retrieving, it can not be accessed by index

    }
}
