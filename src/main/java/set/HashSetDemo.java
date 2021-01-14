package set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // insertion order is not preserved
        // not allowed duplicates
        // heterogeneous objects
        // implements interface
        // elements are inserted with hashcode

        // underlying data structure: HashTable

        // when we want to insert element to HashTable, we need to calculate its index.
        // formula: Integer value % table size

        // Example

        HashSet<Integer> hashSet = new HashSet<>(5);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        System.out.println("Size of hashTable: " + hashSet.size());
        System.out.println("Index: " + 49%5);
        // if we want to add element 49 with size of table 5, element index will be 4

        // when 75% capacity set is reached, set will get double sized, so current size*2
        HashSet hashSet1 = new HashSet(100); // next capacity would be 200

        HashSet hashSet2 = new HashSet(100, .80f); // when 80% of set will be occupied, capacity
        // will be doubled

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.forEach(System.out::println);
        HashSet hashSet3 = new HashSet(arrayList); // the way how to remove duplicates
        hashSet3.forEach(System.out::println);
        hashSet.add(5);
        hashSet3.forEach(System.out::println);

    }

}
